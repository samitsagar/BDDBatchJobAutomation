package steps;
import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.StringReader;

public class readHeader {
    public static void main (String [] args) throws IOException,
            CsvValidationException{
        //String headerFile = "Users/samitpradhananga/Documents/Kronos/POC/CompareFiles/TestData/Personhdr.csv";

        File headerFile = new File(System.getProperty("user.home"), "Personhdr.csv");
        CSVReader reader = new CSVReader(new FileReader(headerFile));
        String [] nextLine;
        while ((nextLine = reader.readNext()) != null) {
            // nextLine[] is an array of values from the line
            for (String e : nextLine) {
                System.out.format(" %s", e);
            }

        }
   /*     File personProd = new File(System.getProperty("user.home"), "PERSON_77 Prod.txt");
        CSVReader reader = new CSVReader(new FileReader(personProd));
        String [] nextLine;
        while ((nextLine = reader.readNext()) != null) {
            // nextLine[] is an array of values from the line
            for (String e : nextLine) {
                System.out.format(" %s", e);
            }

        }*/
        /*File personTest = new File(System.getProperty("user.home"), "PERSON_77Test.txt");
        CSVReader reader = new CSVReader(new FileReader(personTest));
        //reader.useDelimiter("\r\n");
        String [] nextLine;
        while ((nextLine = reader.readNext()) != null) {
            // nextLine[] is an array of values from the line
            for (String e : nextLine) {
                System.out.format("%s", e);
            }
        }*/
    }

}