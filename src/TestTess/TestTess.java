package TestTess;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

import net.sourceforge.tess4j.*;

public class TestTess {

    public static void main(String[] args) throws FileNotFoundException {
    	
    	
    	File image = new File("C:/Users/Farnaz/Box Sync/2019 - Admissions - OCR Project/Transcripts - Redacted/Trans_Redacted_Part10.pdf");
        //File image = new File("F:/Eclipse-workspace/TessOCR/Tess4J-3.4.8-src/Tess4J/test/resources/test-data/eurotext.pdf");
        Tesseract tessInst = new Tesseract();
        tessInst.setDatapath("F:/Eclipse-workspace/TessOCR/Tess4J-3.4.8-src/Tess4J");
        try {
            String result= tessInst.doOCR(image);
            PrintWriter out = new PrintWriter("OCR-output.txt");    
            //System.out.println(result);
            out.println(result);
            out.close();
        } catch (TesseractException e) {
            System.err.println(e.getMessage());
        }

    }

}