package com.e2open.transform;

import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

import com.e2open.common.FlatFileToXmlConstants;
import com.e2open.handler.FlatFileToXmlHandler;

public class FlatFileToXmlTransform implements FlatFileToXmlConstants {
	private FlatFileToXmlHandler flatFileToXmlHandler;

	private static int idx = 0;

	public FlatFileToXmlTransform(FlatFileToXmlHandler flatFileToXmlHandler) {
		this.flatFileToXmlHandler = flatFileToXmlHandler;
	}

	public void execute() throws Exception {
		System.out.println("--");
		String className = flatFileToXmlHandler.getClassName();

		String packageName = flatFileToXmlHandler.getPackageName();
		String xPath = flatFileToXmlHandler.getObjectKeyName();
		className = packageName + PACKAGE_DELIMETER + className;
		String methodName = null;
		String childClassName = flatFileToXmlHandler.getChildClassName();
		String xPathChild = flatFileToXmlHandler.getObjectKeyName() + XPATH_OBJECT_DELIMETER + childClassName;

		try {
			Class cls = Class.forName(className);
			methodName = getMethod(cls);
			if (methodName == null) {

				String listVarName = Character.toLowerCase(flatFileToXmlHandler.getChildClassName().charAt(0))
						+ flatFileToXmlHandler.getChildClassName().substring(1);
				System.out.println("****I think we need to LOOP : " + xPathChild);
				System.out.println("****listVarName : " + flatFileToXmlHandler.getInstance(cls, xPathChild));
				System.out.println("****listVarName : " + flatFileToXmlHandler.getLoopKeyName());

				flatFileToXmlHandler.setLoopVariables(flatFileToXmlHandler.getLoopKeyName(),
						flatFileToXmlHandler.getInstance(cls, xPathChild));
				//flatFileToXmlHandler.setLoopFlag(true);
				Field field = cls.getDeclaredField(listVarName);

				field.set(flatFileToXmlHandler.getInstance(cls, xPath),
						flatFileToXmlHandler.getLoopVariables(flatFileToXmlHandler.getLoopKeyName()));
				System.out.println("****getLoopVariables "
						+ flatFileToXmlHandler.getLoopVariables(flatFileToXmlHandler.getLoopKeyName()));
			} else {

				Class<?> param = getParameterType(cls, methodName);
				Object obj = flatFileToXmlHandler.getInstance(cls, xPath);
				Method method = cls.getDeclaredMethod(methodName, param);
				if (param.toString().equals("class java.lang.String")) {
					idx++;
					System.out.println(methodName + " **** Set value **** " + flatFileToXmlHandler.getInputLine()[idx]);
					System.out.println(" xPath **** " + xPath);
					System.out.println(" cls **** " + cls);
					System.out.println(" Obj **** " + obj);
					flatFileToXmlHandler.setLoopKeyName(xPath + "." + methodName);
					method.invoke(obj, flatFileToXmlHandler.getInputLine()[idx]);
				} else {
					method.invoke(obj, flatFileToXmlHandler.getInstance(cls, xPathChild));

				}
			}

		} catch (ClassNotFoundException cfe) {
			if (flatFileToXmlHandler.getFirstFlag())
				flatFileToXmlHandler.setFirstFlag(false);
			else
				flatFileToXmlHandler.exceptionHandling(cfe);
		}

	}

	private String getMethod(Class cls) {

		boolean firstFlag = flatFileToXmlHandler.getFirstFlag();
		String childClassName = flatFileToXmlHandler.getChildClassName();
		String tmpMethodName = null;
		String methodName = null;
		if (firstFlag) {
			methodName = "setValue";
			flatFileToXmlHandler.setFirstFlag(false);
		} else {
			tmpMethodName = "set" + childClassName;
			for (Method m : cls.getDeclaredMethods()) {
				if (tmpMethodName.equals(m.getName())) {
					methodName = tmpMethodName;
				}
			}
		}

		return methodName;
	}

	private Class<?> getParameterType(Class cls, String methodName)
			throws InstantiationException, IllegalAccessException {
		String childClassName = flatFileToXmlHandler.getChildClassName();
		String xPathChild = flatFileToXmlHandler.getObjectKeyName() + XPATH_OBJECT_DELIMETER + childClassName;

		Type type = null;
		Class<?>[] param = new Class[1];
		for (Method m : cls.getDeclaredMethods()) {
			if (!methodName.equals(m.getName()))
				continue;
			for (Type t : m.getParameterTypes()) {
				type = t;
				break;
			}
		}

		if (type.toString().equals("class java.lang.String")) {
			param[0] = String.class;
		} else {
			/*flatFileToXmlHandler
					.setChildInstance(flatFileToXmlHandler.getInstance(childClassName.getClass(), xPathChild));
			param[0] = flatFileToXmlHandler.getChildInstance().getClass();
			*/
			param[0] = flatFileToXmlHandler.getInstance(cls, xPathChild).getClass();
		}
		return param[0];
	}

	public void generateFFToXML(String xPath) throws Exception {
		System.out.println("generateFFToXML : " + xPath);
		System.out.println("flatFileToXmlHandler.getXmlOutputFile() : " + flatFileToXmlHandler.getXmlOutputFile());
		File FFToXmlOutputFile = flatFileToXmlHandler.getXmlOutputFile();
		JAXBContext jaxbMContext;
		String className = flatFileToXmlHandler.getClassName();

		Object parentObj = flatFileToXmlHandler.getInstance(className.getClass(), xPath);
		jaxbMContext = JAXBContext.newInstance(parentObj.getClass());
		Marshaller jaxbMarshaller = jaxbMContext.createMarshaller();
		jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		jaxbMarshaller.marshal(parentObj, FFToXmlOutputFile);

	}
}
