package steps;

import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Map;

public class ScanDelta {

    public static void main(String[] args) throws Exception
    {

        data = new HashMap<String, HashMap<Integer, HashMap<String, String>>>();//
        //empid, rowID : [ Prod : <Value>, Test : <Value> ]
        //data: [ empid, record: [value : Prod/Test ]]

        //String []  header  = new String[] {"Empl ID","Empl Status","Status Eff Date","First Name","Middle Init","Last Name",};
        //parsing a CSV file into Scanner class constructor
        Scanner scRow;

        scRow = new Scanner(new File("/Users/samitpradhananga/Documents/Kronos/POC/CompareFiles/TestData/PERSON_77Prod.txt"));
        scRow.useDelimiter("\r\n");	//sets the delimiter pattern
        scRow.next();

        while (scRow.hasNext())  //returns a boolean value
        {
            Scanner scColumnProd = new Scanner(scRow.next());
            scColumnProd.useDelimiter(",");
            HashMap <Integer, HashMap<String, String>> record = new HashMap <Integer, HashMap<String, String>>();
            String empid = scColumnProd.next();
            for(int recordIndex = 1; recordIndex < 113; recordIndex++) {
                String value_prod = scColumnProd.next();
                HashMap<String,String> value_pair_prod = new HashMap<String,String>();
                value_pair_prod.put("prod", value_prod);
                record.put(recordIndex, value_pair_prod);
                data.put(empid, record);
            }
            scColumnProd.close();
        }
        scRow.close();  //closes the scanner
        scRow = new Scanner(new File("/Users/samitpradhananga/Documents/Kronos/POC/CompareFiles/TestData/PERSON_77Test.txt"));
        scRow.useDelimiter("\r\n");	//sets the delimiter pattern
        scRow.next();

        while (scRow.hasNext())  //returns a boolean value
        {
            Scanner scColumnTest = new Scanner(scRow.next());
            scColumnTest.useDelimiter(",");
            HashMap <Integer, HashMap<String, String>> value_tst = new HashMap <Integer, HashMap<String, String>>();
            String empid = scColumnTest.next();
            for(int i = 1; i < 113; i++) {
                String value_test = scColumnTest.next();
                HashMap<Integer, HashMap<String, String>> prevRecord;

                prevRecord = data.get(empid);
                if(prevRecord == null) {
                    HashMap<String,String> B = new HashMap<String,String>();
                    B.put("test", value_test);
                    value_tst.put(i, B);
                    data.put(empid, value_tst);
                    System.out.println("record for employee : "+empid + " does not exist in Production Data");
                }
                else {
                    HashMap<String, String> prevRecord_child = prevRecord.get(i);
                    if (prevRecord_child == null) {
                        prevRecord_child = new HashMap<String, String>();
                        prevRecord.put(i, prevRecord_child);
                    }
                    prevRecord_child.put("test", value_test);

                    if(prevRecord_child.get("prod") != null && !prevRecord_child.get("prod").equals(value_test))
                    {
                        System.out.println("record for employee : "+empid + " is different at index_id : "+ i +", Difference : "+value_test);

                    }
                }

            }
            scColumnTest.close();
        }
        scRow.close();  //closes the scanner

       Iterator iterator = data.entrySet().iterator();
       while (iterator.hasNext()) {
            Map.Entry me1 = (Map.Entry) iterator.next();
			 //if(me2.getKey().equals("11231019")){
				//System.out.println("assocNbr: "+me2.getKey() + " & fieldIndex: " + me2.getValue());
			//}
            //if (me2.getValue().get())
           HashMap<Integer, HashMap<String,String>> rec = (HashMap<Integer, HashMap<String, String>>) me1.getValue();
            Iterator iterator2 = rec.entrySet().iterator();
            while(iterator2.hasNext()) {
                Map.Entry me2 = (Map.Entry) iterator2.next();
                HashMap<String, String> v = (HashMap<String, String>) me2.getValue();
                if(v.get("test") == null) {
                    System.out.println("Record does not exist in test data for employee Id: " + me1.getKey());
                    break;
                }
            }
        }
    }

    public static HashMap<String, HashMap<Integer, HashMap<String,String>>> data;
}