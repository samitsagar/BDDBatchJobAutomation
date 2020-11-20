package util;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;


public class BeanUtil {



    public static Map<String, List<EmployeeBean>> getBeanObjectFromBeanFactory(){
        List<EmployeeBean> prodEmployeeBean,qaEmployeeBean;
        Map<String,List<EmployeeBean>> employeeMap = new HashMap<>();
        EmployeeBean employeeBean = new EmployeeBean();
        try{
            prodEmployeeBean = employeeBean.getEmployeeBean("/Users/samitpradhananga/Documents/Kronos/POC/CompareFiles/TestData/PERSON_77Prod.txt");
            qaEmployeeBean = employeeBean.getEmployeeBean("/Users/samitpradhananga/Documents/Kronos/POC/CompareFiles/TestData/PERSON_77Test.txt");

            System.out.println(" Prod Status :-  "+prodEmployeeBean.get(0).getEmpl_Status());
            System.out.println(" QA Status :-  "+qaEmployeeBean.get(0).getEmpl_Status());

            employeeMap.put("prodmployeebean",prodEmployeeBean);
            employeeMap.put("qaemployeebean",qaEmployeeBean);

            //BeanUtil.getCompareData(EmployeeBean.class,prodEmployeeBean.get(0),qaEmployeeBean.get(0));

        }catch(Exception ex){
            System.out.println("Exception "+ ex);
        }finally {
            return employeeMap;
        }
    }

    public static <T> boolean getCompareData (Class<T> type, T prodDataBean, T qaDataBean)
            throws Exception {

        BeanInfo beanInfo = Introspector.getBeanInfo(type);
        for (PropertyDescriptor pd : beanInfo.getPropertyDescriptors()) {
            Method m = pd.getReadMethod();
            Object empProdData = m.invoke(prodDataBean);
            Object empQAData = m.invoke(qaDataBean);
            if (!Objects.equals(empProdData, empQAData)) {
                System.out.println("-----------------------------------------");
                System.out.println("PROD data "+ m.getName()+" value = "+ empProdData.toString() );
                System.out.println("QA data "+ m.getName()+" value = "+ empQAData.toString() );
                System.out.println("-----------------------------------------");
            }
        }
        return true;
    }
}

