package com.xmltransform;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;

import org.apache.poi.xwpf.usermodel.XWPFDocument;

import fr.opensagres.poi.xwpf.converter.pdf.PdfConverter;
import fr.opensagres.poi.xwpf.converter.pdf.PdfOptions;

public class PDF {
	public static void main(String[] args) throws Exception {
		String inputFile = "E://TEST.doc";
		String outputFile = "E://TEST.pdf";

		FileInputStream in = new FileInputStream(inputFile);
		XWPFDocument document = new XWPFDocument(in);
		File outFile = new File(outputFile);
		OutputStream out = new FileOutputStream(outFile);
		PdfOptions options = null;
		PdfConverter.getInstance().convert(document, out, options);
	}
}
