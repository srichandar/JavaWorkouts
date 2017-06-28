package workouts;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.common.PDStream;
import org.apache.pdfbox.rendering.ImageType;
import org.apache.pdfbox.rendering.PDFRenderer;
import org.apache.pdfbox.text.PDFTextStripper;

public class TestPDFTextReader {

	public static void main(String[] args) throws IOException {
		String pdfFilename = "C:\\SriDocs\\Works\\Reckon\\EOCActualSheet.pdf";
		PDDocument document = PDDocument.load(new File(pdfFilename));
		PDFTextStripper pdfTextStripper = new PDFTextStripper();
		System.out.println(pdfTextStripper.getText(document)); 
		System.out.println("--------------EOF-------------------");
		document.close();

	}

}
