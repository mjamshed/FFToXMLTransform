package com.e2open.common;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.e2open.handler.ExceptionHandler;

public class FlatFileToXmlConfig extends ExceptionHandler {

	private File xmlConfigFile;
	private File FFToXmlOutputFile;
	private File FFToXmlInputFile;

	private String packageName;
	private String objectKeyName;
	private String loopKeyName;
	private String className;
	private String childClassName;
	private ArrayList<String> removeXPath = new ArrayList<String>();

	private boolean firstFlag = true;
	private HashMap<String, Object> objects = new HashMap<String, Object>();

	private HashMap<String, ArrayList<Object>> storeLoopObject = new HashMap<String, ArrayList<Object>>();
	private ArrayList<Object> dynamicList;
	private String[] inputLine;

	public void setXmlConfigFile(File xmlConfigFile) {
		this.xmlConfigFile = xmlConfigFile;
	}

	public File getXmlConfigFile() {
		return xmlConfigFile;
	}

	public void setXmlOutputFile(File FFToXmlOutputFile) {
		this.FFToXmlOutputFile = FFToXmlOutputFile;
	}

	public File getXmlOutputFile() {
		return FFToXmlOutputFile;
	}

	public void setFFInputFile(File FFToXmlInputFile) {
		this.FFToXmlInputFile = FFToXmlInputFile;
	}

	public File getFFInputFile() {
		return FFToXmlInputFile;
	}

	public void setPackageName(String packageName) {
		this.packageName = packageName;
	}

	public String getPackageName() {
		return packageName;
	}

	/*public void setRemoveXPath(String removeXPath) {
		this.removeXPath.add(removeXPath);
	}*/

	/*public void clearXPath() {
		for (String xPath : removeXPath) {
			System.out.println("#### clearXPath " + objects.get(xPath));
			objects.remove(xPath);
		}
	
	}*/

	public void setObjectKeyName(String objectName) {
		this.objectKeyName = objectName;
	}

	public String getObjectKeyName() {
		return objectKeyName;
	}

	public void setLoopKeyName(String key) {
		this.loopKeyName = key;
	}

	public String getLoopKeyName() {
		return loopKeyName;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public String getClassName() {
		return className;
	}

	public void setFirstFlag(boolean firstFlag) {
		this.firstFlag = firstFlag;
	}

	public boolean getFirstFlag() {
		return firstFlag;
	}

	public void setChildClassName(String childClassName) {
		this.childClassName = childClassName;
	}

	/**
	 * Retrieve Child Class Name
	 */
	public String getChildClassName() {
		return childClassName;
	}

	/**
	 * Retrieve instance based on key variable. If no instance stored then will
	 * return new instance
	 * 
	 * @param cls
	 * @param xPath
	 * @return Object of an xPath
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 */
	public Object getInstance(Class<?> cls, String xPath) throws InstantiationException, IllegalAccessException {

		if (objects == null || !objects.containsKey(xPath)) {
			Object obj = cls.newInstance();
			objects.put(xPath, obj);
		}
		return objects.get(xPath);

	}

	/**
	 * To Store loop objects
	 */
	public void setLoopVariables(String key, Object obj) {

		System.out.println(" #### key " + key);
		System.out.println(" #### obj " + obj);
		if (storeLoopObject != null && storeLoopObject.containsKey(key)) {
			dynamicList = storeLoopObject.get(key);
			System.out.println(" #### storeLoopObject " + storeLoopObject.get(key));
		} else {

			dynamicList = new ArrayList<Object>();

		}
		dynamicList.add(obj);
		storeLoopObject.put(key, dynamicList);

	}

	/**
	 * Retrieve Loop objects
	 * 
	 * @return
	 */
	public Object getLoopVariables(String key) {
		return storeLoopObject.get(key);
	}

	public void clearLoopVariables() {
		storeLoopObject.clear();
	}

	/**
	 * Set the value of Input Flat File Line
	 * 
	 * @param inputLine
	 */
	public void setInputLine(String[] inputLine) {
		this.inputLine = inputLine;
	}

	/**
	 * get the value of Input Flat File Line
	 * 
	 * @return
	 */
	public String[] getInputLine() {
		return inputLine;
	}
}
