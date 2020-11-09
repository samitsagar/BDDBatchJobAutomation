package runner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class TestRunner {

    public static  void main(String[] poc){
        Process p;
        try {
            List<String> cmdList = new ArrayList<String>();
            // adding command and args to the list
            cmdList.add("/Users/samitpradhananga/Documents/Kronos/POC/BDDBatchJobAutomation/src/main/resources/isEmailExistInMacys.command");
            ProcessBuilder pb = new ProcessBuilder(cmdList);
            p = pb.start();
            p.waitFor();
            BufferedReader reader=new BufferedReader(new InputStreamReader(
                    p.getInputStream()));
            String line;
            while((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
