package com.e2open.handler;

import java.io.File;

public abstract class FlatFileToXmlEvent {

	FlatFileToXmlHandler flatFileToXmlHandler;

	FlatFileToXmlEvent(FlatFileToXmlHandler flatFileToXmlHandler) throws Exception {
		this.flatFileToXmlHandler = flatFileToXmlHandler;
		execute();
	}

	/*
	 * Initialize xmlConfigFile 
	 */

	public void execute() throws Exception {
		flatFileToXmlHandler.execute();
	}

}
