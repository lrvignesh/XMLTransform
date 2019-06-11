package com.xmltransform;

import java.io.File;

import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.TransformerFactoryConfigurationError;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

public class XMLTransformer {

	public static void main(String[] args) throws TransformerFactoryConfigurationError, TransformerException {

		StreamSource styleSource = new StreamSource(XMLTransformer.class.getClassLoader().getResourceAsStream("EmployeeTransform.xsl"));

		StreamSource inpSource = new StreamSource(XMLTransformer.class.getClassLoader().getResourceAsStream("Employee.xml"));

		Transformer transformer = TransformerFactory.newInstance().newTransformer(styleSource);

		transformer.transform(inpSource, new StreamResult(new File("Output\\EmployeeOutput.xml")));

		System.out.println("Transformation done successfully");

	}
}
