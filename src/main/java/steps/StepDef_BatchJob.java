package steps;

import cucumber.api.java.en.Given;
import util.CommonUtils;

import java.util.ArrayList;
import java.util.List;

public class StepDef_BatchJob {

    util.CommonUtils commonUtils =new CommonUtils();
    List<String> listPath = new ArrayList<String>();

    @Given("^I set batch file path to process$")
    public void iSetBatchFilePathToProcess() {
        listPath=commonUtils.getBatchFilePath();
    }
}
