package steps;

import util.BeanUtil;
import util.EmployeeBean;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class KronoSteps {
    public List<EmployeeBean> prodEmployeeBean,qaEmployeeBean;
    public Map<String,List<EmployeeBean>> employeeMap = new HashMap<>();

    @When("^I configure consolidated prod and non prod data files$")
    public void iConfigureConsolidatedProdAndNonProdDataFiles() {
        System.out.println("############ Started configuration of consolidated prod and non prod data files ############ ");
        employeeMap = BeanUtil.getBeanObjectFromBeanFactory();
        if(null != employeeMap && !employeeMap.isEmpty()){
            prodEmployeeBean = employeeMap.get("prodmployeebean");
            qaEmployeeBean= employeeMap.get("qaemployeebean");
        }


    }

    @And("^I compare the prod and non prod data$")
    public void iCompareTheProdAndNonProdData() throws Exception {
        System.out.println("############ Started data comparison ############ ");
        BeanUtil.getCompareData(EmployeeBean.class,prodEmployeeBean.get(0),qaEmployeeBean.get(0));
    }
}
