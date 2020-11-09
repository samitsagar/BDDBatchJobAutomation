package util;

import java.util.ArrayList;
import java.util.List;

public class CommonUtils {

    public List getBatchFilePath(){
        List<String> cmdList = new ArrayList<String>();
        // adding command and args to the list
        //cmdList.add("sh");
        cmdList.add("/Users/samitpradhananga/Documents/Kronos/POC/BDDBatchJobAutomation/src/main/resources/isEmailExistInMacys.command");
        return cmdList;
    }

}
