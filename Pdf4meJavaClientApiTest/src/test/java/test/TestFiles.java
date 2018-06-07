package test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class TestFiles {

	private static String pdfName = "pdf1.pdf";
	private static int pdfLength = 0;
	private static byte[] pdfBytes = null;
	private static File pdfFile = null;

	private static String pdfName2 = "pdf2.pdf";
	private static int pdfLength2 = 0;
	private static byte[] pdfBytes2 = null;
	private static File pdfFile2 = null;

	private static String textFileName = "txt.txt";
	private static int textFileLength = 0;
	private static byte[] textFileBytes = null;
	private static File textFileFile = null;

	private static String wordDocFileName = "wordDoc.docx";
	private static int wordDocFileLength = 0;
	private static byte[] wordDocFileBytes = null;
	private static File wordDocFile = null;

	private static String excelDocFileName = "excel.xlsx";
	private static int excelDocFileLength = 0;
	private static byte[] excelDocFileBytes = null;
	private static File excelDocFile = null;

	private static String emlDocFileName = "email.eml";
	private static int emlDocFileLength = 0;
	private static byte[] emlDocFileBytes = null;
	private static File emlDocFile = null;

	private static String msgDocFileName = "email.msg";
	private static int msgDocFileLength = 0;
	private static byte[] msgDocFileBytes = null;
	private static File msgDocFile = null;

	private static String jpgDocFileName = "picture.jpg";
	private static int jpgDocFileLength = 0;
	private static byte[] jpgDocFileBytes = null;
	private static File jpgDocFile = null;

	private static String zipFileName = "zip.zip";
	private static int zipFileLength = 0;
	private static byte[] zipFileBytes = null;
	private static File zipFile = null;

	public TestFiles() {
		try {
			// PDF 1
			byte[] pdf = Files.readAllBytes(Paths.get(pdfName));
			pdfBytes = pdf;
			pdfLength = pdf.length;
			pdfFile = new File(pdfName);

			// PDF 2
			byte[] pdf2 = Files.readAllBytes(Paths.get(pdfName2));
			pdfBytes2 = pdf2;
			pdfLength2 = pdf2.length;
			pdfFile2 = new File(pdfName2);

			// Text file
			byte[] textFile = Files.readAllBytes(Paths.get(textFileName));
			textFileBytes = textFile;
			textFileLength = textFile.length;
			textFileFile = new File(textFileName);

			// Word document
			byte[] wordDoc = Files.readAllBytes(Paths.get(wordDocFileName));
			wordDocFileBytes = wordDoc;
			wordDocFileLength = wordDoc.length;
			wordDocFile = new File(wordDocFileName);

			// Excel document
			byte[] excelDoc = Files.readAllBytes(Paths.get(excelDocFileName));
			excelDocFileBytes = excelDoc;
			excelDocFileLength = excelDoc.length;
			excelDocFile = new File(excelDocFileName);

			// eml document
			byte[] emlDoc = Files.readAllBytes(Paths.get(emlDocFileName));
			emlDocFileBytes = emlDoc;
			emlDocFileLength = emlDoc.length;
			emlDocFile = new File(emlDocFileName);

			// msg document
			byte[] msgDoc = Files.readAllBytes(Paths.get(msgDocFileName));
			msgDocFileBytes = msgDoc;
			msgDocFileLength = msgDoc.length;
			msgDocFile = new File(msgDocFileName);

			// picture document
			byte[] picDoc = Files.readAllBytes(Paths.get(jpgDocFileName));
			jpgDocFileBytes = picDoc;
			jpgDocFileLength = picDoc.length;
			jpgDocFile = new File(jpgDocFileName);

			// picture document
			byte[] zip = Files.readAllBytes(Paths.get(zipFileName));
			zipFileBytes = zip;
			zipFileLength = zip.length;
			zipFile = new File(zipFileName);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * Returns the name of the first test PDF.
	 * 
	 * @return
	 */
	public String getPdfName() {
		return pdfName;
	}

	/**
	 * Returns the name of the scond test PDF.
	 * 
	 * @return
	 */
	public String getPdfNameLong() {
		return pdfName2;
	}

	/**
	 * Returns the name of the text file.
	 * 
	 * @return
	 */
	public String getTextFileName() {
		return textFileName;
	}

	/**
	 * Returns the name of the word doc file.
	 * 
	 * @return
	 */
	public String getWordDocFileName() {
		return wordDocFileName;
	}

	/**
	 * Returns the name of the excel doc file.
	 * 
	 * @return
	 */
	public String getExcelDocFileName() {
		return excelDocFileName;
	}

	/**
	 * Returns the name of the eml doc file.
	 * 
	 * @return
	 */
	public String getEmlDocFileName() {
		return emlDocFileName;
	}

	/**
	 * Returns the name of the msg doc file.
	 * 
	 * @return
	 */
	public String getMsgDocFileName() {
		return msgDocFileName;
	}

	/**
	 * Returns the name of the jpg doc file.
	 * 
	 * @return
	 */
	public String getJPGDocFileName() {
		return jpgDocFileName;
	}

	/**
	 * Returns the name of the zip file.
	 * 
	 * @return
	 */
	public String getzipFileName() {
		return zipFileName;
	}

	/**
	 * Returns the length of the first test PDF.
	 * 
	 * @return
	 */
	public int pdfLength() {
		return pdfLength;
	}

	/**
	 * Returns the length of the long test PDF.
	 * 
	 * @return
	 */
	public int pdfLengthLong() {
		return pdfLength2;
	}

	/**
	 * Returns the length of the text file.
	 * 
	 * @return
	 */
	public int textFileLength() {
		return textFileLength;
	}

	/**
	 * Returns the length of the word doc file.
	 * 
	 * @return
	 */
	public int wordDocFileLength() {
		return wordDocFileLength;
	}

	/**
	 * Returns the length of the excel doc file.
	 * 
	 * @return
	 */
	public int excelDocFileLength() {
		return excelDocFileLength;
	}

	/**
	 * Returns the length of the eml doc file.
	 * 
	 * @return
	 */
	public int emlDocFileLength() {
		return emlDocFileLength;
	}

	/**
	 * Returns the length of the msg doc file.
	 * 
	 * @return
	 */
	public int msgDocFileLength() {
		return msgDocFileLength;
	}

	/**
	 * Returns the length of the jpg doc file.
	 * 
	 * @return
	 */
	public int jpgDocFileLength() {
		return jpgDocFileLength;
	}

	/**
	 * Returns the length of the zip file.
	 * 
	 * @return
	 */
	public int zipFileLength() {
		return zipFileLength;
	}

	/**
	 * Returns the byte array of the sample PDF.
	 * 
	 * @return
	 */
	public byte[] getPdfBytes() {
		return pdfBytes;
	}

	/**
	 * Returns the byte array of the big sample pdf
	 * 
	 * @return
	 */
	public byte[] getPdfBytesLong() {
		return pdfBytes2;
	}

	/**
	 * Returns the byte array of the text file
	 * 
	 * @return
	 */
	public byte[] getTextFileBytes() {
		return textFileBytes;
	}

	/**
	 * Returns the byte array of the word document
	 * 
	 * @return
	 */
	public byte[] getWordDocBytes() {
		return wordDocFileBytes;
	}

	/**
	 * Returns the byte array of the excel document
	 * 
	 * @return
	 */
	public byte[] getExcelDocBytes() {
		return excelDocFileBytes;
	}

	/**
	 * Returns the byte array of the eml file
	 * 
	 * @return
	 */
	public byte[] getEmlDocBytes() {
		return emlDocFileBytes;
	}

	/**
	 * Returns the byte array of the msg file
	 * 
	 * @return
	 */
	public byte[] getMsgDocBytes() {
		return msgDocFileBytes;
	}

	/**
	 * Returns the byte array of the jpg
	 * 
	 * @return
	 */
	public byte[] getJPGDocBytes() {
		return jpgDocFileBytes;
	}

	/**
	 * Returns the byte array of the jpg
	 * 
	 * @return
	 */
	public byte[] getzipBytes() {
		return zipFileBytes;
	}

	/**
	 * Returns the file instance of the sample PDF.
	 * 
	 * @return
	 */
	public File getPdfFile() {
		return pdfFile;
	}

	/**
	 * Returns the file instance of the big sample pdf
	 * 
	 * @return
	 */
	public File getPdfFileLong() {
		return pdfFile2;
	}

	/**
	 * Returns the file instance of the text file
	 * 
	 * @return
	 */
	public File getTextFileFile() {
		return textFileFile;
	}

	/**
	 * Returns the file instance of the word document
	 * 
	 * @return
	 */
	public File getWordDocFile() {
		return wordDocFile;
	}

	/**
	 * Returns the file instance of the excel document
	 * 
	 * @return
	 */
	public File getExcelDocFile() {
		return excelDocFile;
	}

	/**
	 * Returns the file instance of the eml file
	 * 
	 * @return
	 */
	public File getEmlDocFile() {
		return emlDocFile;
	}

	/**
	 * Returns the file instance of the msg file
	 * 
	 * @return
	 */
	public File getMsgDoc() {
		return msgDocFile;
	}

	/**
	 * Returns the file instance of the jpg
	 * 
	 * @return
	 */
	public File getJPGDoc() {
		return jpgDocFile;
	}

	/**
	 * Returns the file instance of the jpg
	 * 
	 * @return
	 */
	public File getzipFile() {
		return zipFile;
	}
}
