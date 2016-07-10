package com.e2open.handler;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Arrays;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

import org.apache.commons.lang.StringUtils;

import com.e2open.common.FlatFileToXmlConfig;
import com.e2open.common.FlatFileToXmlConstants;
import com.e2open.transform.FlatFileToXmlTransform;
import com.e2open.util.FlatFileToXmlUtil;
import com.e2open.util.FlatFileToXmlUtil.Mapper;
import com.e2open.util.FlatFileToXmlUtil.Mapper.MappingList;

public class FlatFileToXmlHandler extends FlatFileToXmlConfig implements FlatFileToXmlConstants {

	FlatFileToXmlHandler(File fFToXmlUtilFile, File fFToXmlInputFile, File fFToXmlOutputFile) {
		setXmlConfigFile(fFToXmlUtilFile);
		setXmlOutputFile(fFToXmlOutputFile);
		setFFInputFile(fFToXmlInputFile);

	}

	public void execute() throws Exception {
		File ffToXMLUtilFile = getXmlConfigFile();
		processFlatFileToXmlUtil();
	}

	private void processFlatFileToXmlUtil() throws Exception {

		JAXBContext jaxbUMContext;
		FlatFileToXmlTransform flatFileToXmlTransform = null;
		BufferedReader br = null;
		try {
			File ffToXMLUtilFile = getXmlConfigFile();
			File fFToXmlInputFile = getFFInputFile();

			br = new BufferedReader(new FileReader(fFToXmlInputFile));
			String sCurrentLine;

			jaxbUMContext = JAXBContext.newInstance(FlatFileToXmlUtil.class);
			Unmarshaller jaxbUnmarshaller = jaxbUMContext.createUnmarshaller();
			FlatFileToXmlUtil flatFileToXML = (FlatFileToXmlUtil) jaxbUnmarshaller.unmarshal(ffToXMLUtilFile);

			setPackageName(flatFileToXML.getPackage());
			Mapper mapper = flatFileToXML.getMapper();
			List<MappingList> mappingList = mapper.getMappingList();
			String rootTag = null;
			while ((sCurrentLine = br.readLine()) != null) {
				if (sCurrentLine.startsWith("#") || (sCurrentLine.trim().length() == 0)) {
					continue;
				}

				//String[] lineArray = 
				setInputLine(sCurrentLine.split("\t"));
				for (MappingList mList : mappingList) {

					boolean firstFlag = getFirstFlag();
					String xPath = fixXPath(mList.getOutputXPath());

					//		setLoopFlag(mList.getLoop());

					String[] splitXPath = xPath.split(XPATH_DELIMETER);
					int splitIdx = splitXPath.length - 1;
					while (splitIdx >= 0) {

						setObjectKeyName(StringUtils.join(Arrays.copyOfRange(splitXPath, 0, splitIdx + 1),
								XPATH_OBJECT_DELIMETER));
						setClassName(splitXPath[splitIdx]);

						flatFileToXmlTransform = new FlatFileToXmlTransform(this);
						flatFileToXmlTransform.execute();

						setChildClassName(splitXPath[splitIdx]);
						rootTag = splitXPath[splitIdx];
						splitIdx--;

					}
					setFirstFlag(true);

				}

				//clearLoopVariables();
				//clearXPath();
				System.out.println("Cleared");
			}
			if (flatFileToXmlTransform != null && rootTag != null) {
				System.out.println("generateFFToXML");
				flatFileToXmlTransform.generateFFToXML(rootTag);
			}

		} catch (Exception e) {
			exceptionHandling(e);
		} finally {
			if (br != null)
				br.close();
		}
	}

	private String fixXPath(String xPath) {
		if (xPath.startsWith(XPATH_DELIMETER)) {
			xPath = xPath.substring(1);
		}
		String[] tmpStore = xPath.split(XPATH_DELIMETER);
		xPath = "";
		for (int i = 0; i < tmpStore.length; i++) {
			xPath = xPath + Character.toUpperCase(tmpStore[i].charAt(0)) + tmpStore[i].substring(1) + XPATH_DELIMETER;
		}
		return xPath.substring(0, xPath.length() - 1);
	}

}
