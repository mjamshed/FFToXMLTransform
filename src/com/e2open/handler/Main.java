package com.e2open.handler;

import java.io.File;

import com.e2open.common.FlatFileToXmlConfig;

public class Main extends FlatFileToXmlEvent {

	Main(FlatFileToXmlHandler flatFileToXmlHandler) throws Exception {
		super(flatFileToXmlHandler);
		// TODO Auto-generated constructor stub
	}

	//For Testing
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		File fFToXmlUtilFile = new File(
				"C:\\Users\\mjamshed\\workspace\\eclipse-luna\\FlatFileToXmlTransform\\src\\com\\e2open\\util\\FFToXMLUtil.xml");

		File fFToXmlInputFile = new File(
				"C:\\Users\\mjamshed\\workspace\\eclipse-luna\\FlatFileToXmlTransform\\src\\com\\e2open\\InOut\\FFToXMLInput.txt");

		File fFToXmlOutputFile = new File(
				"C:\\Users\\mjamshed\\workspace\\eclipse-luna\\FlatFileToXmlTransform\\src\\com\\e2open\\InOut\\FFToXMLOutput.xml");

		FlatFileToXmlHandler flatFileToXmlHandler = new FlatFileToXmlHandler(fFToXmlUtilFile, fFToXmlInputFile,
				fFToXmlOutputFile);
		Main main = new Main(flatFileToXmlHandler);
		//main.init(FFToXmlUtilFile, FFToXmlInputFile, FFToXmlOutputFile);
	}

}
