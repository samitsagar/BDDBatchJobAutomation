package util;

import com.opencsv.bean.CsvBindByPosition;
import com.opencsv.bean.CsvToBeanBuilder;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

public class EmployeeBean {


    @CsvBindByPosition(position = 0)
    private String Empl_ID;
    @CsvBindByPosition(position = 1)
    private String Empl_Status;
    @CsvBindByPosition(position = 2)
    private String Status_Eff_Date;
    @CsvBindByPosition(position = 3)
    private String First_Name;
    @CsvBindByPosition(position = 4)
    private String Middle_Init;
    @CsvBindByPosition(position = 5)
    private String Last_Name;
    @CsvBindByPosition(position = 6)
    private String Short_Name;
    @CsvBindByPosition(position = 7)
    private String Birth_Date;
    @CsvBindByPosition(position = 8)
    private String Hire_Date;
    @CsvBindByPosition(position = 9)
    private String Wage_Rate;

    @CsvBindByPosition(position = 10)
    private String Wage_Effective_Date;
    @CsvBindByPosition(position = 11)
    private String WTK_License;
    @CsvBindByPosition(position = 12)
    private String Scheduler_License;
    @CsvBindByPosition(position = 13)
    private String Manager_License;
    @CsvBindByPosition(position = 14)
    private String Attendance_Lic;
    @CsvBindByPosition(position = 15)
    private String Leave_Lic;
    @CsvBindByPosition(position = 16)
    private String Record_Mgr_Lic;
    @CsvBindByPosition(position = 17)
    private String Time_Entry_Method;
    @CsvBindByPosition(position = 18)
    private String Phone_number;
    @CsvBindByPosition(position = 19)
    private String Type_Of_Contact_Phone;
    @CsvBindByPosition(position = 20)
    private String Email_Address;

    @CsvBindByPosition(position = 21)
    private String Email_Address_Type;
    @CsvBindByPosition(position = 22)
    private String Labor_Level_1;
    @CsvBindByPosition(position = 23)
    private String Labor_Level_1_Desciption;
    @CsvBindByPosition(position = 24)
    private String Labor_Level_2;
    @CsvBindByPosition(position = 25)
    private String Labor_Level_3;
    @CsvBindByPosition(position = 26)
    private String Labor_Level_4;
    @CsvBindByPosition(position = 27)
    private String Labor_Level_5;
    @CsvBindByPosition(position = 28)
    private String Labor_Level_6;
    @CsvBindByPosition(position = 29)
    private String Labor_Level_7;
    @CsvBindByPosition(position = 30)
    private String Primary_Labor_Account_Effective_Date;

    @CsvBindByPosition(position = 31)
    private String Primary_Org1_Organization;
    @CsvBindByPosition(position = 32)
    private String Primary_Org2_Division;
    @CsvBindByPosition(position = 33)
    private String Primary_Org5_Location;
    @CsvBindByPosition(position = 34)
    private String Primary_Org9_Department;
    @CsvBindByPosition(position = 35)
    private String Primary_Org10_Job;
    @CsvBindByPosition(position = 36)
    private String Primary_Job_Effective_Date;
    @CsvBindByPosition(position = 37)
    private String Reports_To_Supervisor_Number;
    @CsvBindByPosition(position = 38)
    private String Union_Code;
    @CsvBindByPosition(position = 39)
    private String Pay_Termed;
    @CsvBindByPosition(position = 40)
    private String TIA_Daily_Hr;

    @CsvBindByPosition(position = 41)
    private String TIA_Avg_Hrs;
    @CsvBindByPosition(position = 42)
    private String Sched_Days;
    @CsvBindByPosition(position = 43)
    private String Standard_Hours;
    @CsvBindByPosition(position = 44)
    private String Time_Span_Associated_With_Standard_Hours;
    @CsvBindByPosition(position = 45)
    private String Certification_Name;
    @CsvBindByPosition(position = 46)
    private String Certification_Effective_Date;
    @CsvBindByPosition(position = 47)
    private String Is_TheSkill_Active;
    @CsvBindByPosition(position = 48)
    private String Skill_Effective_Date;
    @CsvBindByPosition(position = 49)
    private String Certification_Expiration_Date;
    @CsvBindByPosition(position = 50)
    private String Skill_Name;

    @CsvBindByPosition(position = 51)
    private String Skill_Expiration_Date;
    @CsvBindByPosition(position = 52)
    private String Seniority_Date;
    @CsvBindByPosition(position = 53)
    private String Worker_Type;
    @CsvBindByPosition(position = 54)
    private String Time_Zone;
    @CsvBindByPosition(position = 55)
    private String Pay_Rule_Name;
    @CsvBindByPosition(position = 56)
    private String Workforce_Attendance_Employee_Profile_Name;
    @CsvBindByPosition(position = 57)
    private String Workforce_Attendance_Profile_Effective_Date;
    @CsvBindByPosition(position = 58)
    private String Attendance_Profile_Administrator;
    @CsvBindByPosition(position = 59)
    private String Leave_Profile_Name;
    @CsvBindByPosition(position = 60)
    private String Leave_Profile_Administrator;


    @CsvBindByPosition(position = 61)
    private String Store_Group;
    @CsvBindByPosition(position = 62)
    private String Pay_Class;
    @CsvBindByPosition(position = 63)
    private String Availability_Template_Profile_Manager;
    @CsvBindByPosition(position = 64)
    private String Display_Profile_Manager;
    @CsvBindByPosition(position = 65)
    private String Auto_Schedule_Option_Sets_Profile_Manager;
    @CsvBindByPosition(position = 66)
    private String Pay_Codes_Edit_Profile_Manager;
    @CsvBindByPosition(position = 67)
    private String Pay_Codes_View_Profile_Manager;
    @CsvBindByPosition(position = 68)
    private String Shift_Template_Profile_Manager;
    @CsvBindByPosition(position = 69)
    private String Work_Rule_Profile_Manager;
    @CsvBindByPosition(position = 70)
    private String Employee_Group_Manager;


    @CsvBindByPosition(position = 71)
    private String Pay_Codes_Edit_Profile_Employee;
    @CsvBindByPosition(position = 72)
    private String Schedule_Rule_Set_Employee;
    @CsvBindByPosition(position = 73)
    private String Schedule_Rule_Set_Effective_Date;
    @CsvBindByPosition(position = 74)
    private String Working_Time_Directive_Assignment;
    @CsvBindByPosition(position = 75)
    private String Function_Access_Profile_Assignment;
    @CsvBindByPosition(position = 76)
    private String Generic_Data_Access_Profile_GDAP_Default_Switch;
    @CsvBindByPosition(position = 77)
    private String Generic_Data_Access_Profile_Name;
    @CsvBindByPosition(position = 78)
    private String GDAP_Effective_Date;
    @CsvBindByPosition(position = 79)
    private String GDAP_Orig_Effective_Date;
    @CsvBindByPosition(position = 80)
    private String GDAP_Original_Expiration;

    @CsvBindByPosition(position = 81)
    private String GDAP_Role_Manager_Employee;
    @CsvBindByPosition(position = 82)
    private String Reports_Profile_Manager;
    @CsvBindByPosition(position = 83)
    private String Forecast_Map_Profile_Manager;
    @CsvBindByPosition(position = 84)
    private String Job_Transfer_Set_Manager;
    @CsvBindByPosition(position = 85)
    private String Process_Profile_Manager;
    @CsvBindByPosition(position = 86)
    private String Process_Profile_Employee;
    @CsvBindByPosition(position = 87)
    private String Engine_Override_Schedule_Rule_Set_Employee;
    @CsvBindByPosition(position = 88)
    private String Orig_Hire_Date;
    @CsvBindByPosition(position = 89)
    private String Hire_Date2;
    @CsvBindByPosition(position = 90)
    private String Eff_Date;

    @CsvBindByPosition(position = 91)
    private String Rehire_Date;
    @CsvBindByPosition(position = 92)
    private String Union_Senority_date;
    @CsvBindByPosition(position = 93)
    private String Service_Date;
    @CsvBindByPosition(position = 94)
    private String Job_Date;
    @CsvBindByPosition(position = 95)
    private String Benefit_Date;
    @CsvBindByPosition(position = 96)
    private String Minor_Rule_Set;
    @CsvBindByPosition(position = 97)
    private String Legacy_Division;
    @CsvBindByPosition(position = 98)
    private String Attestation_Profile;
    @CsvBindByPosition(position = 99)
    private String Attendance_Points_Type;
    @CsvBindByPosition(position = 100)
    private String Attendance_Points_Intial_Value;

    @CsvBindByPosition(position = 101)
    private String Attendance_Points_Eff_Date ;
    @CsvBindByPosition(position = 102)
    private String Minor_School_Cal;
    @CsvBindByPosition(position = 103)
    private String PS_Work_Sched;
    @CsvBindByPosition(position = 104)
    private String Mgr_School_Cal_Profile;
    @CsvBindByPosition(position = 105)
    private String Payrule_Eff_Date;
    @CsvBindByPosition(position = 106)
    private String PTO_Avg_Hours;
    @CsvBindByPosition(position = 107)
    private String WFM_Role_Id;
    @CsvBindByPosition(position = 108)
    private String SRS_Expire_Date;
    @CsvBindByPosition(position = 109)
    private String  Future_Sched_Rule_Set;
    @CsvBindByPosition(position = 110)
    private String  Future_Sched_Rule_Set_Ovrd;
    @CsvBindByPosition(position = 111)
    private String  Future_Sched_Rule_Set_Effective_Date;
    @CsvBindByPosition(position = 112)
    private String Job_Code ;


    public String getEmpl_ID() {
        return Empl_ID;
    }

    public void setEmpl_ID(String empl_ID) {
        Empl_ID = empl_ID;
    }

    public String getEmpl_Status() {
        return Empl_Status;
    }

    public void setEmpl_Status(String empl_Status) {
        Empl_Status = empl_Status;
    }

    public String getStatus_Eff_Date() {
        return Status_Eff_Date;
    }

    public void setStatus_Eff_Date(String status_Eff_Date) {
        Status_Eff_Date = status_Eff_Date;
    }

    public String getFirst_Name() {
        return First_Name;
    }

    public void setFirst_Name(String first_Name) {
        First_Name = first_Name;
    }

    public String getMiddle_Init() {
        return Middle_Init;
    }

    public void setMiddle_Init(String middle_Init) {
        Middle_Init = middle_Init;
    }

    public String getLast_Name() {
        return Last_Name;
    }

    public void setLast_Name(String last_Name) {
        Last_Name = last_Name;
    }

    public String getShort_Name() {
        return Short_Name;
    }

    public void setShort_Name(String short_Name) {
        Short_Name = short_Name;
    }

    public String getBirth_Date() {
        return Birth_Date;
    }

    public void setBirth_Date(String birth_Date) {
        Birth_Date = birth_Date;
    }

    public String getHire_Date() {
        return Hire_Date;
    }

    public void setHire_Date(String hire_Date) {
        Hire_Date = hire_Date;
    }

    public String getWage_Rate() {
        return Wage_Rate;
    }

    public void setWage_Rate(String wage_Rate) {
        Wage_Rate = wage_Rate;
    }

    public String getWage_Effective_Date() {
        return Wage_Effective_Date;
    }

    public void setWage_Effective_Date(String wage_Effective_Date) {
        Wage_Effective_Date = wage_Effective_Date;
    }

    public String getWTK_License() {
        return WTK_License;
    }

    public void setWTK_License(String WTK_License) {
        this.WTK_License = WTK_License;
    }

    public String getScheduler_License() {
        return Scheduler_License;
    }

    public void setScheduler_License(String scheduler_License) {
        Scheduler_License = scheduler_License;
    }

    public String getManager_License() {
        return Manager_License;
    }

    public void setManager_License(String manager_License) {
        Manager_License = manager_License;
    }

    public String getAttendance_Lic() {
        return Attendance_Lic;
    }

    public void setAttendance_Lic(String attendance_Lic) {
        Attendance_Lic = attendance_Lic;
    }
    public String getLeave_Lic() {
        return Leave_Lic;
    }

    public void setLeave_Lic(String leave_Lic) {
        Leave_Lic = leave_Lic;
    }

    public String getRecord_Mgr_Lic() {
        return Record_Mgr_Lic;
    }

    public void setRecord_Mgr_Lic(String record_Mgr_Lic) {
        Record_Mgr_Lic = record_Mgr_Lic;
    }

    public String getTime_Entry_Method() {
        return Time_Entry_Method;
    }

    public void setTime_Entry_Method(String time_Entry_Method) {
        Time_Entry_Method = time_Entry_Method;
    }

    public String getPhone_number() {
        return Phone_number;
    }

    public void setPhone_number(String phone_number) {
        Phone_number = phone_number;
    }

    public String getType_Of_Contact_Phone() {
        return Type_Of_Contact_Phone;
    }

    public void setType_Of_Contact_Phone(String type_Of_Contact_Phone) {
        Type_Of_Contact_Phone = type_Of_Contact_Phone;
    }

    public String getEmail_Address() {
        return Email_Address;
    }

    public void setEmail_Address(String email_Address) {
        Email_Address = email_Address;
    }

    public String getEmail_Address_Type() {
        return Email_Address_Type;
    }

    public void setEmail_Address_Type(String email_Address_Type) {
        Email_Address_Type = email_Address_Type;
    }

    public String getLabor_Level_1() {
        return Labor_Level_1;
    }

    public void setLabor_Level_1(String labor_Level_1) {
        Labor_Level_1 = labor_Level_1;
    }

    public String getLabor_Level_1_Desciption() {
        return Labor_Level_1_Desciption;
    }

    public void setLabor_Level_1_Desciption(String labor_Level_1_Desciption) {
        Labor_Level_1_Desciption = labor_Level_1_Desciption;
    }

    public String getLabor_Level_2() {
        return Labor_Level_2;
    }

    public void setLabor_Level_2(String labor_Level_2) {
        Labor_Level_2 = labor_Level_2;
    }

    public String getLabor_Level_3() {
        return Labor_Level_3;
    }

    public void setLabor_Level_3(String labor_Level_3) {
        Labor_Level_3 = labor_Level_3;
    }

    public String getLabor_Level_4() {
        return Labor_Level_4;
    }

    public void setLabor_Level_4(String labor_Level_4) {
        Labor_Level_4 = labor_Level_4;
    }

    public String getLabor_Level_5() {
        return Labor_Level_5;
    }

    public void setLabor_Level_5(String labor_Level_5) {
        Labor_Level_5 = labor_Level_5;
    }

    public String getLabor_Level_6() {
        return Labor_Level_6;
    }

    public void setLabor_Level_6(String labor_Level_6) {
        Labor_Level_6 = labor_Level_6;
    }

    public String getLabor_Level_7() {
        return Labor_Level_7;
    }

    public void setLabor_Level_7(String labor_Level_7) {
        Labor_Level_7 = labor_Level_7;
    }

    public String getPrimary_Labor_Account_Effective_Date() {
        return Primary_Labor_Account_Effective_Date;
    }

    public void setPrimary_Labor_Account_Effective_Date(String primary_Labor_Account_Effective_Date) {
        Primary_Labor_Account_Effective_Date = primary_Labor_Account_Effective_Date;
    }

    public String getPrimary_Org1_Organization() {
        return Primary_Org1_Organization;
    }

    public void setPrimary_Org1_Organization(String primary_Org1_Organization) {
        Primary_Org1_Organization = primary_Org1_Organization;
    }

    public String getPrimary_Org2_Division() {
        return Primary_Org2_Division;
    }

    public void setPrimary_Org2_Division(String primary_Org2_Division) {
        Primary_Org2_Division = primary_Org2_Division;
    }

    public String getPrimary_Org5_Location() {
        return Primary_Org5_Location;
    }

    public void setPrimary_Org5_Location(String primary_Org5_Location) {
        Primary_Org5_Location = primary_Org5_Location;
    }

    public String getPrimary_Org9_Department() {
        return Primary_Org9_Department;
    }

    public void setPrimary_Org9_Department(String primary_Org9_Department) {
        Primary_Org9_Department = primary_Org9_Department;
    }

    public String getPrimary_Org10_Job() {
        return Primary_Org10_Job;
    }

    public void setPrimary_Org10_Job(String primary_Org10_Job) {
        Primary_Org10_Job = primary_Org10_Job;
    }

    public String getPrimary_Job_Effective_Date() {
        return Primary_Job_Effective_Date;
    }

    public void setPrimary_Job_Effective_Date(String primary_Job_Effective_Date) {
        Primary_Job_Effective_Date = primary_Job_Effective_Date;
    }

    public String getReports_To_Supervisor_Number() {
        return Reports_To_Supervisor_Number;
    }

    public void setReports_To_Supervisor_Number(String reports_To_Supervisor_Number) {
        Reports_To_Supervisor_Number = reports_To_Supervisor_Number;
    }

    public String getUnion_Code() {
        return Union_Code;
    }

    public void setUnion_Code(String union_Code) {
        Union_Code = union_Code;
    }

    public String getPay_Termed() {
        return Pay_Termed;
    }

    public void setPay_Termed(String pay_Termed) {
        Pay_Termed = pay_Termed;
    }

    public String getTIA_Daily_Hr() {
        return TIA_Daily_Hr;
    }

    public void setTIA_Daily_Hr(String TIA_Daily_Hr) {
        this.TIA_Daily_Hr = TIA_Daily_Hr;
    }

    public String getTIA_Avg_Hrs() {
        return TIA_Avg_Hrs;
    }

    public void setTIA_Avg_Hrs(String TIA_Avg_Hrs) {
        this.TIA_Avg_Hrs = TIA_Avg_Hrs;
    }

    public String getSched_Days() {
        return Sched_Days;
    }

    public void setSched_Days(String sched_Days) {
        Sched_Days = sched_Days;
    }

    public String getStandard_Hours() {
        return Standard_Hours;
    }

    public void setStandard_Hours(String standard_Hours) {
        Standard_Hours = standard_Hours;
    }

    public String getTime_Span_Associated_With_Standard_Hours() {
        return Time_Span_Associated_With_Standard_Hours;
    }

    public void setTime_Span_Associated_With_Standard_Hours(String time_Span_Associated_With_Standard_Hours) {
        Time_Span_Associated_With_Standard_Hours = time_Span_Associated_With_Standard_Hours;
    }

    public String getCertification_Name() {
        return Certification_Name;
    }

    public void setCertification_Name(String certification_Name) {
        Certification_Name = certification_Name;
    }

    public String getCertification_Effective_Date() {
        return Certification_Effective_Date;
    }

    public void setCertification_Effective_Date(String certification_Effective_Date) {
        Certification_Effective_Date = certification_Effective_Date;
    }

    public String getIs_TheSkill_Active() {
        return Is_TheSkill_Active;
    }

    public void setIs_TheSkill_Active(String is_TheSkill_Active) {
        Is_TheSkill_Active = is_TheSkill_Active;
    }

    public String getSkill_Effective_Date() {
        return Skill_Effective_Date;
    }

    public void setSkill_Effective_Date(String skill_Effective_Date) {
        Skill_Effective_Date = skill_Effective_Date;
    }

    public String getCertification_Expiration_Date() {
        return Certification_Expiration_Date;
    }

    public void setCertification_Expiration_Date(String certification_Expiration_Date) {
        Certification_Expiration_Date = certification_Expiration_Date;
    }

    public String getSkill_Name() {
        return Skill_Name;
    }

    public void setSkill_Name(String skill_Name) {
        Skill_Name = skill_Name;
    }

    public String getSkill_Expiration_Date() {
        return Skill_Expiration_Date;
    }

    public void setSkill_Expiration_Date(String skill_Expiration_Date) {
        Skill_Expiration_Date = skill_Expiration_Date;
    }

    public String getSeniority_Date() {
        return Seniority_Date;
    }

    public void setSeniority_Date(String seniority_Date) {
        Seniority_Date = seniority_Date;
    }

    public String getWorker_Type() {
        return Worker_Type;
    }

    public void setWorker_Type(String worker_Type) {
        Worker_Type = worker_Type;
    }

    public String getTime_Zone() {
        return Time_Zone;
    }

    public void setTime_Zone(String time_Zone) {
        Time_Zone = time_Zone;
    }

    public String getPay_Rule_Name() {
        return Pay_Rule_Name;
    }

    public void setPay_Rule_Name(String pay_Rule_Name) {
        Pay_Rule_Name = pay_Rule_Name;
    }

    public String getWorkforce_Attendance_Employee_Profile_Name() {
        return Workforce_Attendance_Employee_Profile_Name;
    }

    public void setWorkforce_Attendance_Employee_Profile_Name(String workforce_Attendance_Employee_Profile_Name) {
        Workforce_Attendance_Employee_Profile_Name = workforce_Attendance_Employee_Profile_Name;
    }

    public String getWorkforce_Attendance_Profile_Effective_Date() {
        return Workforce_Attendance_Profile_Effective_Date;
    }

    public void setWorkforce_Attendance_Profile_Effective_Date(String workforce_Attendance_Profile_Effective_Date) {
        Workforce_Attendance_Profile_Effective_Date = workforce_Attendance_Profile_Effective_Date;
    }

    public String getAttendance_Profile_Administrator() {
        return Attendance_Profile_Administrator;
    }

    public void setAttendance_Profile_Administrator(String attendance_Profile_Administrator) {
        Attendance_Profile_Administrator = attendance_Profile_Administrator;
    }

    public String getLeave_Profile_Name() {
        return Leave_Profile_Name;
    }

    public void setLeave_Profile_Name(String leave_Profile_Name) {
        Leave_Profile_Name = leave_Profile_Name;
    }

    public String getLeave_Profile_Administrator() {
        return Leave_Profile_Administrator;
    }

    public void setLeave_Profile_Administrator(String leave_Profile_Administrator) {
        Leave_Profile_Administrator = leave_Profile_Administrator;
    }

    public String getStore_Group() {
        return Store_Group;
    }

    public void setStore_Group(String store_Group) {
        Store_Group = store_Group;
    }

    public String getPay_Class() {
        return Pay_Class;
    }

    public void setPay_Class(String pay_Class) {
        Pay_Class = pay_Class;
    }

    public String getAvailability_Template_Profile_Manager() {
        return Availability_Template_Profile_Manager;
    }

    public void setAvailability_Template_Profile_Manager(String availability_Template_Profile_Manager) {
        Availability_Template_Profile_Manager = availability_Template_Profile_Manager;
    }

    public String getDisplay_Profile_Manager() {
        return Display_Profile_Manager;
    }

    public void setDisplay_Profile_Manager(String display_Profile_Manager) {
        Display_Profile_Manager = display_Profile_Manager;
    }

    public String getAuto_Schedule_Option_Sets_Profile_Manager() {
        return Auto_Schedule_Option_Sets_Profile_Manager;
    }

    public void setAuto_Schedule_Option_Sets_Profile_Manager(String auto_Schedule_Option_Sets_Profile_Manager) {
        Auto_Schedule_Option_Sets_Profile_Manager = auto_Schedule_Option_Sets_Profile_Manager;
    }

    public String getPay_Codes_Edit_Profile_Manager() {
        return Pay_Codes_Edit_Profile_Manager;
    }

    public void setPay_Codes_Edit_Profile_Manager(String pay_Codes_Edit_Profile_Manager) {
        Pay_Codes_Edit_Profile_Manager = pay_Codes_Edit_Profile_Manager;
    }

    public String getPay_Codes_View_Profile_Manager() {
        return Pay_Codes_View_Profile_Manager;
    }

    public void setPay_Codes_View_Profile_Manager(String pay_Codes_View_Profile_Manager) {
        Pay_Codes_View_Profile_Manager = pay_Codes_View_Profile_Manager;
    }

    public String getShift_Template_Profile_Manager() {
        return Shift_Template_Profile_Manager;
    }

    public void setShift_Template_Profile_Manager(String shift_Template_Profile_Manager) {
        Shift_Template_Profile_Manager = shift_Template_Profile_Manager;
    }

    public String getWork_Rule_Profile_Manager() {
        return Work_Rule_Profile_Manager;
    }

    public void setWork_Rule_Profile_Manager(String work_Rule_Profile_Manager) {
        Work_Rule_Profile_Manager = work_Rule_Profile_Manager;
    }

    public String getEmployee_Group_Manager() {
        return Employee_Group_Manager;
    }

    public void setEmployee_Group_Manager(String employee_Group_Manager) {
        Employee_Group_Manager = employee_Group_Manager;
    }

    public String getPay_Codes_Edit_Profile_Employee() {
        return Pay_Codes_Edit_Profile_Employee;
    }

    public void setPay_Codes_Edit_Profile_Employee(String pay_Codes_Edit_Profile_Employee) {
        Pay_Codes_Edit_Profile_Employee = pay_Codes_Edit_Profile_Employee;
    }

    public String getSchedule_Rule_Set_Employee() {
        return Schedule_Rule_Set_Employee;
    }

    public void setSchedule_Rule_Set_Employee(String schedule_Rule_Set_Employee) {
        Schedule_Rule_Set_Employee = schedule_Rule_Set_Employee;
    }

    public String getSchedule_Rule_Set_Effective_Date() {
        return Schedule_Rule_Set_Effective_Date;
    }

    public void setSchedule_Rule_Set_Effective_Date(String schedule_Rule_Set_Effective_Date) {
        Schedule_Rule_Set_Effective_Date = schedule_Rule_Set_Effective_Date;
    }

    public String getWorking_Time_Directive_Assignment() {
        return Working_Time_Directive_Assignment;
    }

    public void setWorking_Time_Directive_Assignment(String working_Time_Directive_Assignment) {
        Working_Time_Directive_Assignment = working_Time_Directive_Assignment;
    }

    public String getFunction_Access_Profile_Assignment() {
        return Function_Access_Profile_Assignment;
    }

    public void setFunction_Access_Profile_Assignment(String function_Access_Profile_Assignment) {
        Function_Access_Profile_Assignment = function_Access_Profile_Assignment;
    }

    public String getGeneric_Data_Access_Profile_GDAP_Default_Switch() {
        return Generic_Data_Access_Profile_GDAP_Default_Switch;
    }

    public void setGeneric_Data_Access_Profile_GDAP_Default_Switch(String generic_Data_Access_Profile_GDAP_Default_Switch) {
        Generic_Data_Access_Profile_GDAP_Default_Switch = generic_Data_Access_Profile_GDAP_Default_Switch;
    }

    public String getGeneric_Data_Access_Profile_Name() {
        return Generic_Data_Access_Profile_Name;
    }

    public void setGeneric_Data_Access_Profile_Name(String generic_Data_Access_Profile_Name) {
        Generic_Data_Access_Profile_Name = generic_Data_Access_Profile_Name;
    }

    public String getGDAP_Effective_Date() {
        return GDAP_Effective_Date;
    }

    public void setGDAP_Effective_Date(String GDAP_Effective_Date) {
        this.GDAP_Effective_Date = GDAP_Effective_Date;
    }

    public String getGDAP_Orig_Effective_Date() {
        return GDAP_Orig_Effective_Date;
    }

    public void setGDAP_Orig_Effective_Date(String GDAP_Orig_Effective_Date) {
        this.GDAP_Orig_Effective_Date = GDAP_Orig_Effective_Date;
    }

    public String getGDAP_Original_Expiration() {
        return GDAP_Original_Expiration;
    }

    public void setGDAP_Original_Expiration(String GDAP_Original_Expiration) {
        this.GDAP_Original_Expiration = GDAP_Original_Expiration;
    }

    public String getGDAP_Role_Manager_Employee() {
        return GDAP_Role_Manager_Employee;
    }

    public void setGDAP_Role_Manager_Employee(String GDAP_Role_Manager_Employee) {
        this.GDAP_Role_Manager_Employee = GDAP_Role_Manager_Employee;
    }

    public String getReports_Profile_Manager() {
        return Reports_Profile_Manager;
    }

    public void setReports_Profile_Manager(String reports_Profile_Manager) {
        Reports_Profile_Manager = reports_Profile_Manager;
    }

    public String getForecast_Map_Profile_Manager() {
        return Forecast_Map_Profile_Manager;
    }

    public void setForecast_Map_Profile_Manager(String forecast_Map_Profile_Manager) {
        Forecast_Map_Profile_Manager = forecast_Map_Profile_Manager;
    }

    public String getJob_Transfer_Set_Manager() {
        return Job_Transfer_Set_Manager;
    }

    public void setJob_Transfer_Set_Manager(String job_Transfer_Set_Manager) {
        Job_Transfer_Set_Manager = job_Transfer_Set_Manager;
    }

    public String getProcess_Profile_Manager() {
        return Process_Profile_Manager;
    }

    public void setProcess_Profile_Manager(String process_Profile_Manager) {
        Process_Profile_Manager = process_Profile_Manager;
    }

    public String getProcess_Profile_Employee() {
        return Process_Profile_Employee;
    }

    public void setProcess_Profile_Employee(String process_Profile_Employee) {
        Process_Profile_Employee = process_Profile_Employee;
    }

    public String getEngine_Override_Schedule_Rule_Set_Employee() {
        return Engine_Override_Schedule_Rule_Set_Employee;
    }

    public void setEngine_Override_Schedule_Rule_Set_Employee(String engine_Override_Schedule_Rule_Set_Employee) {
        Engine_Override_Schedule_Rule_Set_Employee = engine_Override_Schedule_Rule_Set_Employee;
    }

    public String getOrig_Hire_Date() {
        return Orig_Hire_Date;
    }

    public void setOrig_Hire_Date(String orig_Hire_Date) {
        Orig_Hire_Date = orig_Hire_Date;
    }

    public String getHire_Date2() {
        return Hire_Date2;
    }

    public void setHire_Date2(String hire_Date2) {
        Hire_Date2 = hire_Date2;
    }

    public String getEff_Date() {
        return Eff_Date;
    }

    public void setEff_Date(String eff_Date) {
        Eff_Date = eff_Date;
    }

    public String getRehire_Date() {
        return Rehire_Date;
    }

    public void setRehire_Date(String rehire_Date) {
        Rehire_Date = rehire_Date;
    }

    public String getUnion_Senority_date() {
        return Union_Senority_date;
    }

    public void setUnion_Senority_date(String union_Senority_date) {
        Union_Senority_date = union_Senority_date;
    }

    public String getService_Date() {
        return Service_Date;
    }

    public void setService_Date(String service_Date) {
        Service_Date = service_Date;
    }

    public String getJob_Date() {
        return Job_Date;
    }

    public void setJob_Date(String job_Date) {
        Job_Date = job_Date;
    }

    public String getBenefit_Date() {
        return Benefit_Date;
    }

    public void setBenefit_Date(String benefit_Date) {
        Benefit_Date = benefit_Date;
    }

    public String getMinor_Rule_Set() {
        return Minor_Rule_Set;
    }

    public void setMinor_Rule_Set(String minor_Rule_Set) {
        Minor_Rule_Set = minor_Rule_Set;
    }

    public String getLegacy_Division() {
        return Legacy_Division;
    }

    public void setLegacy_Division(String legacy_Division) {
        Legacy_Division = legacy_Division;
    }

    public String getAttestation_Profile() {
        return Attestation_Profile;
    }

    public void setAttestation_Profile(String attestation_Profile) {
        Attestation_Profile = attestation_Profile;
    }

    public String getAttendance_Points_Type() {
        return Attendance_Points_Type;
    }

    public void setAttendance_Points_Type(String attendance_Points_Type) {
        Attendance_Points_Type = attendance_Points_Type;
    }

    public String getAttendance_Points_Intial_Value() {
        return Attendance_Points_Intial_Value;
    }

    public void setAttendance_Points_Intial_Value(String attendance_Points_Intial_Value) {
        Attendance_Points_Intial_Value = attendance_Points_Intial_Value;
    }

    public String getAttendance_Points_Eff_Date() {
        return Attendance_Points_Eff_Date;
    }

    public void setAttendance_Points_Eff_Date(String attendance_Points_Eff_Date) {
        Attendance_Points_Eff_Date = attendance_Points_Eff_Date;
    }

    public String getMinor_School_Cal() {
        return Minor_School_Cal;
    }

    public void setMinor_School_Cal(String minor_School_Cal) {
        Minor_School_Cal = minor_School_Cal;
    }

    public String getPS_Work_Sched() {
        return PS_Work_Sched;
    }

    public void setPS_Work_Sched(String PS_Work_Sched) {
        this.PS_Work_Sched = PS_Work_Sched;
    }

    public String getMgr_School_Cal_Profile() {
        return Mgr_School_Cal_Profile;
    }

    public void setMgr_School_Cal_Profile(String mgr_School_Cal_Profile) {
        Mgr_School_Cal_Profile = mgr_School_Cal_Profile;
    }

    public String getPayrule_Eff_Date() {
        return Payrule_Eff_Date;
    }

    public void setPayrule_Eff_Date(String payrule_Eff_Date) {
        Payrule_Eff_Date = payrule_Eff_Date;
    }

    public String getPTO_Avg_Hours() {
        return PTO_Avg_Hours;
    }

    public void setPTO_Avg_Hours(String PTO_Avg_Hours) {
        this.PTO_Avg_Hours = PTO_Avg_Hours;
    }

    public String getWFM_Role_Id() {
        return WFM_Role_Id;
    }

    public void setWFM_Role_Id(String WFM_Role_Id) {
        this.WFM_Role_Id = WFM_Role_Id;
    }

    public String getSRS_Expire_Date() {
        return SRS_Expire_Date;
    }

    public void setSRS_Expire_Date(String SRS_Expire_Date) {
        this.SRS_Expire_Date = SRS_Expire_Date;
    }

    public String getFuture_Sched_Rule_Set() {
        return Future_Sched_Rule_Set;
    }

    public void setFuture_Sched_Rule_Set(String future_Sched_Rule_Set) {
        Future_Sched_Rule_Set = future_Sched_Rule_Set;
    }

    public String getFuture_Sched_Rule_Set_Ovrd() {
        return Future_Sched_Rule_Set_Ovrd;
    }

    public void setFuture_Sched_Rule_Set_Ovrd(String future_Sched_Rule_Set_Ovrd) {
        Future_Sched_Rule_Set_Ovrd = future_Sched_Rule_Set_Ovrd;
    }

    public String getFuture_Sched_Rule_Set_Effective_Date() {
        return Future_Sched_Rule_Set_Effective_Date;
    }

    public void setFuture_Sched_Rule_Set_Effective_Date(String future_Sched_Rule_Set_Effective_Date) {
        Future_Sched_Rule_Set_Effective_Date = future_Sched_Rule_Set_Effective_Date;
    }

    public String getJob_Code() {
        return Job_Code;
    }

    public void setJob_Code(String job_Code) {
        Job_Code = job_Code;
    }


    public List<EmployeeBean> getEmployeeBean(String csvFileName) throws FileNotFoundException {
        List<EmployeeBean> employeeBean = null;
        if(csvFileName != "" && csvFileName != null) {
            employeeBean = new CsvToBeanBuilder(new FileReader(csvFileName))
                    .withType(EmployeeBean.class).build().parse();
        }
        return employeeBean;
    }



}

