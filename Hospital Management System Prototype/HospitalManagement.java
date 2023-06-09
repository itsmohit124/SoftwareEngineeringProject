import javax.swing.*;
import java.util.Calendar;
import java.util.Scanner;


class Employee
{
    String eid, ename, desg, sex ,epassword;
    int salary;
    void new_emp()
    {

        eid = JOptionPane.showInputDialog("Enter employee id:-");

        ename = JOptionPane.showInputDialog("Enter employee name:-");

        desg = JOptionPane.showInputDialog("Enter employee desigination:-");

        sex = JOptionPane.showInputDialog("Enter sex:-");

        epassword = JOptionPane.showInputDialog("Enter password:-");

        salary =(Integer.parseInt(JOptionPane.showInputDialog("Enter Salary:-")));
    }

    void emp_info()

    {
        JOptionPane.showMessageDialog(null,"id    Name    Gender    Salary\n"+eid + "    " + ename + "    " + sex + "    " + salary);
    }

}
class PaymentReceipt
{
    String Payid,pid,pname,type_of_test;
    float Amount;
    void new_receipt()
    {

        Payid = JOptionPane.showInputDialog("Enter payment id:-");

        pid = JOptionPane.showInputDialog("Enter patient id:-");

        pname  = JOptionPane.showInputDialog("Enter patient name:-");

        type_of_test = JOptionPane.showInputDialog("Enter types of test performed:-");

        Amount =(Float.parseFloat(JOptionPane.showInputDialog("Enter total payment amount:-")));

    }

    void receipt_info()

    {
        JOptionPane.showMessageDialog(null, "Payment Id    Patient Id    Patient Name    Type Of Tests    Total Treatment Amount\n"+Payid + "        " + pid + "         " + pname + "     " + type_of_test + "       " + Amount);
    }

}
class MedicalReport
{

    String rid,dname,pid,pname,type_of_test,disease,Meds;

    void new_med_rep(){

        rid = JOptionPane.showInputDialog("Enter the report id:-");

        dname  = JOptionPane.showInputDialog("Enter name of doctor incharge:-");

        pid = JOptionPane.showInputDialog("Enter patient id:-");

        pname  = JOptionPane.showInputDialog("Enter patient name:-");

        type_of_test = JOptionPane.showInputDialog("Enter types of test performed:-");

        disease = JOptionPane.showInputDialog("Enter the type of disease patient have:-");

        Meds = JOptionPane.showInputDialog("Enter the name of medicines prescribed:-");

    }

    void report_info(){
        JOptionPane.showMessageDialog(null, "Report Id    Patient Id    Patient Name     Disease     Type Of Tests     Doctor Incharge     Madicines Prescribed\n"+rid+"      " + pid + "      " + pname + "     " + disease + "     " + type_of_test+ "    " +dname+"    "+Meds);
    }

}

class doctor

{
    String did, dname, specilist, appoint, doc_qual,dpassword;
    int droom;
    void new_doctor()

    {

        did  = JOptionPane.showInputDialog("Enter doctor id:-");

        dname  = JOptionPane.showInputDialog("Enter name of doctor:-");

        specilist  = JOptionPane.showInputDialog("Enter specialization of doctor:-");

        appoint  = JOptionPane.showInputDialog("Enter work time of doctor:-");

        doc_qual  = JOptionPane.showInputDialog("Enter qualification of doctor:-");

        dpassword  = JOptionPane.showInputDialog("Enter password:-");

        droom =(Integer.parseInt(JOptionPane.showInputDialog("Enter room no:-")));

    }

    void doctor_info()

    {
        JOptionPane.showMessageDialog(null,"id     Name    Specilist     Timing     Qualification     Room No.\n\n"+did + "    " + dname + "    " + specilist + "    " + appoint + "    " + doc_qual + "    " + droom);
    }
}

class patient

{
    String pid, pname, disease, sex, admit_status,ppassword;
    int age;
    void new_patient()

    {

        pid = JOptionPane.showInputDialog("Enter patient id:-");

        pname  = JOptionPane.showInputDialog("Enter patient name:-");

        disease = JOptionPane.showInputDialog("Enter the type of disease patient have:-");

        sex = JOptionPane.showInputDialog("Enter sex:-");

        admit_status = JOptionPane.showInputDialog("Enter admit_status:-");

        ppassword = JOptionPane.showInputDialog("Enter password:-");

        age =(Integer.parseInt(JOptionPane.showInputDialog("Enter age:-")));

    }

    void patient_info()
    {
        JOptionPane.showMessageDialog(null,"id    Name     Disease     Gender    Admit Status     Age\n"+pid + "   " + pname + "    " + disease + "     " + sex + "         " + admit_status + "        " + age);
    }
}

class medical

{
    String med_name, med_comp, exp_date;
    int med_cost, count;
    void new_medi()
    {

        med_name  = JOptionPane.showInputDialog("Enter medicine name:-");

        med_comp  = JOptionPane.showInputDialog("Enter composition of medicine:-");

        exp_date  = JOptionPane.showInputDialog("Enter exp_date of medicine:-");

        med_cost =(Integer.parseInt(JOptionPane.showInputDialog("Enter cost of medicine:-")));

        count =(Integer.parseInt(JOptionPane.showInputDialog("Enter no of unit:-")));

    }

    void find_medi()
    {
        JOptionPane.showMessageDialog(null,"Name    Company    Expiry Date  Cost\n"+med_name + "    " + med_comp + "     " + exp_date + "      " + med_cost);
    }
}

class lab

{
    String fecility;
    int lab_cost;
    void new_feci()
    {

        fecility  = JOptionPane.showInputDialog("Enter facility name:-");

        lab_cost =(Integer.parseInt(JOptionPane.showInputDialog("Enter cost of facility:-")));

    }

    void feci_list()
    {
        JOptionPane.showMessageDialog(null,"Fecilities    Cost\n"+fecility + "    " + lab_cost);
    }
}

class fecility

{
    String fec_name;
    void add_feci()

    {
        fec_name  = JOptionPane.showInputDialog("Enter facility name:-");
    }

    void show_feci()
    {
        JOptionPane.showMessageDialog(null,"Fecilities\n"+fec_name);
    }
}

public class HospitalManagement

{
    public static void main(String []args)
    {
        String []months = {

            "Jan",
            "Feb",
            "Mar",
            "Apr",

            "May",
            "Jun",
            "Jul",
            "Aug",

            "Sep",
            "Oct",
            "Nov",
            "Dec"
        };

        Calendar calendar = Calendar.getInstance();


        System.out.print("Date: " + months[calendar.get(Calendar.MONTH)] + " " + calendar.get(Calendar.DATE) + " " + calendar.get(Calendar.YEAR));

        System.out.println("\t\t\t\t\t\tTime: " + calendar.get(Calendar.HOUR) + ":" + calendar.get(Calendar.MINUTE) + ":" + calendar.get(Calendar.SECOND));

        doctor[] d = new doctor[25];

        patient[] p = new patient[100];

        lab[] l = new lab[100];

        fecility[] f = new fecility[100];

        medical[] m = new medical[100];

        Employee[] s = new Employee[100];

        PaymentReceipt[] pay=new PaymentReceipt[100];

        MedicalReport[] mr=new MedicalReport[100];


        Scanner in=new Scanner(System.in);

        int i;

        for (i = 0; i < 25; i++)

            d[i] = new doctor();

        for (i = 0; i < 100; i++)

            p[i] = new patient();

        for (i = 0; i < 100; i++)

            l[i] = new lab();

        for (i = 0; i < 100; i++)

            f[i] = new fecility();

        for (i = 0; i < 100; i++)

            m[i] = new medical();

        for (i = 0; i < 100; i++)

            s[i] = new Employee();

        for (i = 0; i < 100; i++)

            mr[i] = new MedicalReport();

        for (i = 0; i < 100; i++)

            pay[i] = new PaymentReceipt();

        d[0].did = "21";
        d[0].dname = "Dr.Ghanendra";
        d[0].specilist = "ENT";
        d[0].appoint = "5-11AM";
        d[0].doc_qual = "MBBS,MD";
        d[0].droom = 17;
        d[0].dpassword="1234";

        d[1].did = "32";
        d[1].dname = "Dr.Vikram";
        d[1].specilist = "Physician";
        d[1].appoint = "10-3AM";
        d[1].doc_qual = "MBBS,MD";
        d[1].droom = 45;
        d[1].dpassword="1234";

        d[2].did = "17";
        d[2].dname = "Dr.Rekha";
        d[2].specilist = "Surgeon";
        d[2].appoint = "8-2AM";
        d[2].doc_qual = "BDM";
        d[2].droom = 8;
        d[2].dpassword="1234";

        d[3].did = "33";
        d[3].dname = "Dr.Pramod";
        d[3].specilist = "Artho";
        d[3].appoint = "10-4PM";
        d[3].doc_qual = "MBBS,MS";
        d[3].droom = 40;
        d[3].dpassword="1234";

        p[0].pid = "12";
        p[0].pname = "Pankaj";
        p[0].disease = "Cancer";
        p[0].sex = "Male";
        p[0].admit_status = "y";
        p[0].age = 30;
        p[0].ppassword="1234";

        p[1].pid = "13";
        p[1].pname = "Sumit";
        p[1].disease = "Cold";
        p[1].sex = "Male";
        p[1].admit_status = "y";
        p[1].age = 23;
        p[1].ppassword="1234";

        p[2].pid = "14";
        p[2].pname = "Alok";
        p[2].disease = "Maleriya";
        p[2].sex = "Male";
        p[2].admit_status = "y";
        p[2].age = 45;
        p[2].ppassword="1234";

        p[3].pid = "15";
        p[3].pname = "Ravi";
        p[3].disease = "Diabetes";
        p[3].sex = "Male";
        p[3].admit_status = "y";
        p[3].age = 25;
        p[3].ppassword="1234";


        m[0].med_name = "Corex";
        m[0].med_comp = "Cino pvt";
        m[0].exp_date = "9-5-16";
        m[0].med_cost = 55;
        m[0].count = 8;

        m[1].med_name = "Nytra";
        m[1].med_comp = "Ace pvt";
        m[1].exp_date = "4-4-15";
        m[1].med_cost = 500;
        m[1].count = 5;

        m[2].med_name = "Brufa";
        m[2].med_comp = "Reckitt";
        m[2].exp_date = "12-7-17";
        m[2].med_cost = 50;
        m[2].count = 56;

        m[3].med_name = "Pride";
        m[3].med_comp = "DDF pvt";
        m[3].exp_date = "12-4-12";
        m[3].med_cost = 1100;
        m[3].count = 100;


        l[0].fecility = "X-ray     ";
        l[0].lab_cost = 800;

        l[1].fecility = "CT Scan   ";
        l[1].lab_cost = 1200;

        l[2].fecility = "OR Scan   ";
        l[2].lab_cost = 500;

        l[3].fecility = "Blood Bank";
        l[3].lab_cost = 50;


        f[0].fec_name = "Ambulance";

        f[1].fec_name = "Admit Facility ";

        f[2].fec_name = "Canteen";

        f[3].fec_name = "Emergency";


        s[0].eid = "22";
        s[0].ename = "Prakash";
        s[0].desg = "Worker";
        s[0].sex = "Male";
        s[0].salary = 5000;
        s[0].epassword="1234";

        s[1].eid = "23";
        s[1].ename = "Komal";
        s[1].desg = "Nurse";
        s[1].sex = "Female";
        s[1].salary = 2000;
        s[1].epassword="1234";

        s[2].eid = "24";
        s[2].ename = "Raju";
        s[2].desg = "Worker";
        s[2].sex = "Male";
        s[2].salary = 5000;
        s[2].epassword="1234";

        s[3].eid = "25";
        s[3].ename = "Rani";
        s[3].desg = "Nurse";
        s[3].sex = "Female";
        s[3].salary = 20000;
        s[3].epassword="1234";

        pay[0].Payid = "32";
        pay[0].pname = "Pankaj";
        pay[0].pid = "12";
        pay[0].type_of_test = "Blood,CT scan & Cancer Test";
        pay[0].Amount = 25000;

        pay[1].Payid = "33";
        pay[1].pname = "Sumit";
        pay[1].pid = "13";
        pay[1].type_of_test = "Blood Test";
        pay[1].Amount = 500;


        pay[3].Payid = "34";
        pay[3].pname = "Alok";
        pay[3].pid = "14";
        pay[3].type_of_test = "Platilates Test";
        pay[3].Amount = 800;

        pay[2].Payid = "35";
        pay[2].pname = "Ravi";
        pay[2].pid = "15";
        pay[2].type_of_test = "Sugar level Blood Test";
        pay[2].Amount = 1600;

        mr[1].rid = "11";
        mr[1].dname = "Dr.Vikram";
        mr[1].pid = "12";
        mr[1].pname = "Pankaj";
        mr[1].type_of_test = "Blood,CT scan & Cancer Test";
        mr[1].disease = "Cancer";
        mr[1].Meds="Carboplatin & Etoposide";

        mr[0].rid = "12";
        mr[0].dname = "Dr.Vikram";
        mr[0].pid = "13";
        mr[0].pname = "Sumit";
        mr[0].type_of_test = "Blood Test";
        mr[0].disease = "Cold";
        mr[0].Meds="Corex";

        mr[2].rid = "13";
        mr[2].dname = "Dr.Vikram";
        mr[2].pid = "14";
        mr[2].pname = "Alok";
        mr[2].type_of_test = "Platilates Test";
        mr[2].disease = "Maleriya";
        mr[2].Meds="Paracetamol & Chloroquine";

        mr[3].rid = "14";
        mr[3].dname = "Dr.Vikram";
        mr[3].pid = "15";
        mr[3].pname = "Ravi";
        mr[3].type_of_test = "Sugar level Blood Test";
        mr[3].disease = "Diabetes";
        mr[3].Meds="Metformin";

        String Aid = "2910";
        String Aname = "Mohit Sharma";
        String sex = "Male";
        int salary = 2500000;
        String Apassword="Mohit@123";


        int count1 = 4, count2 = 4, count3 = 4, count4 = 4, count5 = 4, count6 = 4,count7=4,count8=4;
        int  j;
        boolean  status1=true,status = true ;
        int []arr={count1,count2,count3,count4,count5,count6,count7,count8};
        String[] SelectionTypes = {"Doctor","Patient", "Employee","Admin","exit"};
            while (status)
            {
                boolean log=false,s1 = true,s2=true,s3 = true, s4 = true,s5 = true ,s6 = true;
                String SelectionType = (String) JOptionPane.showInputDialog(null, "Select User:",
                        "Hospital Management System", JOptionPane.QUESTION_MESSAGE, null, SelectionTypes, SelectionTypes[0]);
                if (SelectionType.equals("Doctor"))
                {
                    String user = JOptionPane.showInputDialog("Enter your id:");
                    String pass = JOptionPane.showInputDialog("Enter your password:");
                    for(int k:arr){
                        for (j = 0; j < k; j++)
                        {
                            if (user.equals(d[j].did)&&pass.equals(d[j].dpassword)){
                                log=true;
                            }
                        }
                    }if (log) {
                    JOptionPane.showMessageDialog(null, "Login successful!");
                    String[] SelectionTypesDoc= {"Doctor","Patient","Medicines","Laboratories","Employee","Medical Report"};
                    while (s1) {
                        String SelectionTypeDoc = (String) JOptionPane.showInputDialog(null, "See Details Of:",
                                "Hospital Management System", JOptionPane.QUESTION_MESSAGE, null, SelectionTypesDoc, SelectionTypesDoc[0]);


                        if (SelectionTypeDoc.equals("Doctor")) {
                            for (j = 0; j < count1; j++) {
                                d[j].doctor_info();
                            }
                        } else if (SelectionTypeDoc.equals("Patient")) {
                            for (j = 0; j < count2; j++) {
                                p[j].patient_info();
                            }
                        }
                        else if (SelectionTypeDoc.equals("Medicines")) {
                            for (j = 0; j < count3; j++) {
                                m[j].find_medi();
                            }
                        }
                        else if (SelectionTypeDoc.equals("Laboratories")) {
                            for (j = 0; j < count4; j++) {
                                l[j].feci_list();
                            }
                        }
                        else if (SelectionTypeDoc.equals("Employee")) {
                            for (j = 0; j < count6; j++)
                            {
                                if ("Nurse".equals(s[j].desg))
                                    s[j].emp_info();
                            }
                        }
                        else if (SelectionTypeDoc.equals("Medical Report")) {
                            int option1 = JOptionPane.showOptionDialog(null, "Generate or view Report?",
                                    "Hospital Management System", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,
                                    null, new String[]{"Show Report", "Generate Report"}, "Show Report");
                            if (option1 == JOptionPane.YES_OPTION) {
                                String Ptid = JOptionPane.showInputDialog("Enter Patient id:");
                                for (j = 0; j < count7; j++) {
                                    if (Ptid.equals(mr[j].pid))
                                        mr[j].report_info();
                                }
                            }
                            else{
                                mr[count7].new_med_rep();
                                count7++;
                                JOptionPane.showMessageDialog(null, "Credentials Added Succesfully");
                            }
                        }
                           int option1 = JOptionPane.showOptionDialog(null, "Back to menu?",
                                "Hospital Management System", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,
                                null, new String[]{"Last menu", "Log Out"}, "Log Out");
                            if (option1 == JOptionPane.YES_OPTION) {
                               s1 = true;
                            }
                            else {
                            s1 = false;
                            }
                    }
                    }
                    else {
                        JOptionPane.showMessageDialog(null, "Invalid username or password.");
                    }

                }
                else if(SelectionType.equals("Patient"))
                {
                    String user = JOptionPane.showInputDialog("Enter your id:");
                    String pass = JOptionPane.showInputDialog("Enter your password:");
                    for(int k:arr){
                        for (j = 0; j < k; j++)
                        {
                            if (user.equals(p[j].pid)&&pass.equals(p[j].ppassword)){
                                log=true;
                            }
                        }
                    }if (log) {
                    JOptionPane.showMessageDialog(null, "Login successful!");
                    String[] SelectionTypesDoc= {"Doctor","Patient","Medicines","Laboratories","Employee","Medical Report","Payment Receipt"};
                    while (s1) {
                        String SelectionTypeDoc = (String) JOptionPane.showInputDialog(null, "See Details Of:",
                                "Hospital Management System", JOptionPane.QUESTION_MESSAGE, null, SelectionTypesDoc, SelectionTypesDoc[0]);


                        if (SelectionTypeDoc.equals("Doctor")) {
                            for (j = 0; j < count1; j++) {
                                d[j].doctor_info();
                            }
                        } else if (SelectionTypeDoc.equals("Patient")) {
                            for (j = 0; j < count2; j++) {
                                if (user.equals(p[j].pid))
                                    p[j].patient_info();
                            }
                        }
                        else if (SelectionTypeDoc.equals("Medicines")) {
                            for (j = 0; j < count3; j++) {
                                m[j].find_medi();
                            }
                        }
                        else if (SelectionTypeDoc.equals("Laboratories")) {
                            for (j = 0; j < count4; j++) {
                                l[j].feci_list();
                            }
                        }
                        else if (SelectionTypeDoc.equals("Employee")) {
                            for (j = 0; j < count6; j++)
                            {
                                if ("Nurse".equals(s[j].desg))
                                    s[j].emp_info();
                            }
                        }
                        else if (SelectionTypeDoc.equals("Medical Report")) {
                                for (j = 0; j < count7; j++) {
                                    if (user.equals(mr[j].pid))
                                        mr[j].report_info();
                                }
                        }
                        if (SelectionTypeDoc.equals("Payment Receipt")) {
                            for (j = 0; j < count7; j++) {
                                if (user.equals(pay[j].pid))
                                    pay[j].receipt_info();
                            }
                        }
                        int option1 = JOptionPane.showOptionDialog(null, "Back to menu?",
                                "Hospital Management System", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,
                                null, new String[]{"Last menu", "Log Out"}, "Log Out");
                        if (option1 == JOptionPane.YES_OPTION) {
                            s1 = true;
                        }
                        else {
                            s1 = false;
                        }
                    }
                }
                else {
                    JOptionPane.showMessageDialog(null, "Invalid username or password.");
                }

                }

                else if(SelectionType.equals("Employee"))
                {
                    String user = JOptionPane.showInputDialog("Enter your id:");
                    String pass = JOptionPane.showInputDialog("Enter your password:");
                    for(int k:arr){
                        for (j = 0; j < k; j++)
                        {
                            if (user.equals(s[j].eid)&&pass.equals(s[j].epassword)){
                                log=true;
                            }
                        }
                    }if (log) {
                    JOptionPane.showMessageDialog(null, "Login successful!");
                    while (s6) {
                        String[] Selection = {"Patient", "Nurse", "Worker", "Security","Medicines", "Laboratories", "Facilities","Payment Receipt","Medical Report"};
                        String optionEmp = (String) JOptionPane.showInputDialog(null, "Select your Option:",
                                "Hospital Management System", JOptionPane.QUESTION_MESSAGE, null, Selection, Selection[0]);

                        if (optionEmp.equals("Patient")) {
                            while (s2) {
                                int option = JOptionPane.showOptionDialog(null, "Do you want to add or see detials?",
                                        "Hospital Management System", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,
                                        null, new String[]{"Add a Patient", "See patient details"}, "See patient details");


                                if (option == JOptionPane.YES_OPTION) {
                                    p[count2].new_patient();
                                    count2++;
                                    JOptionPane.showMessageDialog(null, "Credentials Added Succesfully");
                                } else {
                                    for (j = 0; j < count2; j++) {
                                        p[j].patient_info();
                                    }
                                }

                                int option1 = JOptionPane.showOptionDialog(null, "Back to menu?",
                                        "Hospital Management System", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,
                                        null, new String[]{"Last menu", "Main menu"}, "Last menu");
                                if (option1 == JOptionPane.YES_OPTION) {
                                    s2 = true;
                                } else {
                                    s2 = false;
                                }
                            }
                        } else if (optionEmp.equals("Nurse")) {
                            for (j = 0; j < count6; j++) {
                                if (optionEmp.equals(s[j].desg))
                                    s[j].emp_info();
                            }
                        } else if (optionEmp.equals("Worker")) {
                            for (j = 0; j < count6; j++) {
                                if (optionEmp.equals(s[j].desg))
                                    s[j].emp_info();
                            }
                        } else if (optionEmp.equals("Security")){
                           for (j = 0; j < count6; j++) {
                                if (optionEmp.equals(s[j].desg))
                                    s[j].emp_info();
                            }
                        }
                        else if (optionEmp.equals("Medical Report")){
                            String Ptid = JOptionPane.showInputDialog("Enter Patient id:");
                            for (j = 0; j < count7; j++) {
                                if (Ptid.equals(mr[j].pid))
                                    mr[j].report_info();
                            }
                        }
                        if (optionEmp.equals("Payment Receipt")) {
                            int option = JOptionPane.showOptionDialog(null, "Generate or View Payment Receipt?",
                                    "Hospital Management System", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,
                                    null, new String[]{"Generate Payment Receipt", "Show Payment Receipt"}, "Show Payment Receipt");


                            if (option == JOptionPane.YES_OPTION) {
                                pay[count2].new_receipt();
                                count8++;
                                JOptionPane.showMessageDialog(null, "Credentials Added Succesfully");
                            } else {
                                String Ptid = JOptionPane.showInputDialog("Enter Patient id:");
                                for (j = 0; j < count7; j++) {
                                    if (Ptid.equals(pay[j].pid))
                                        pay[j].receipt_info();
                                }
                            }
                        }
                        else if (optionEmp.equals("Medicines")){
                            while (s3) {
                                int option = JOptionPane.showOptionDialog(null, "Do you want to add or see detials?",
                                        "Hospital Management System", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,
                                        null, new String[]{"Add a Medicines", "See Medicines details"}, "See Medicines details");


                                if (option == JOptionPane.YES_OPTION) {
                                    m[count3].new_medi();
                                    count3++;
                                    JOptionPane.showMessageDialog(null, "Credentials Added Succesfully");
                                } else {
                                    for (j = 0; j < count3; j++) {
                                        m[j].find_medi();
                                    }
                                }

                                int option1 = JOptionPane.showOptionDialog(null, "Back to menu?",
                                        "Hospital Management System", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,
                                        null, new String[]{"Last menu", "Main menu"}, "Last menu");
                                if (option1 == JOptionPane.YES_OPTION) {
                                    s3 = true;
                                } else {
                                    s3 = false;
                                }
                            }
                        }else if (optionEmp.equals("Laboratories")){
                            while (s4) {
                                int option = JOptionPane.showOptionDialog(null, "Do you want to add or see detials?",
                                        "Hospital Management System", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,
                                        null, new String[]{"Add Lab details", "See Lab details"}, "See Medicines details");


                                if (option == JOptionPane.YES_OPTION) {
                                    l[count4].new_feci();
                                    count4++;
                                    JOptionPane.showMessageDialog(null, "Credentials Added Succesfully");
                                } else {
                                    for (j = 0; j < count4; j++) {
                                        l[j].feci_list();
                                    }
                                }

                                int option1 = JOptionPane.showOptionDialog(null, "Back to menu?",
                                        "Hospital Management System", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,
                                        null, new String[]{"Last menu", "Main menu"}, "Last menu");
                                if (option1 == JOptionPane.YES_OPTION) {
                                    s4 = true;
                                } else {
                                    s4 = false;
                                }
                            }
                        }else if (optionEmp.equals("Facilities")){
                            while (s5) {
                                int option = JOptionPane.showOptionDialog(null, "Do you want to add or see detials?",
                                        "Hospital Management System", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,
                                        null, new String[]{"Add Facilities", "See Facilities detail"}, "See Medicines details");


                                if (option == JOptionPane.YES_OPTION) {
                                    f[count5].add_feci();
                                    count5++;
                                    JOptionPane.showMessageDialog(null, "Credentials Added Succesfully");
                                } else {
                                    for (j = 0; j < count5; j++) {
                                        f[j].show_feci();
                                    }
                                }

                                int option1 = JOptionPane.showOptionDialog(null, "Back to menu?",
                                        "Hospital Management System", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,
                                        null, new String[]{"Last menu", "Main menu"}, "Last menu");
                                if (option1 == JOptionPane.YES_OPTION) {
                                    s5 = true;
                                } else {
                                    s5 = false;
                                }
                            }
                        }


                        int option1 = JOptionPane.showOptionDialog(null, "Back to menu?",
                                "Hospital Management System", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,
                                null, new String[]{"Last menu", "Log Out"}, "Log Out");
                        if (option1 == JOptionPane.YES_OPTION) {
                            s6 = true;
                        } else {
                            s6 = false;
                        }
                    }
                }else {
                    JOptionPane.showMessageDialog(null, "Invalid username or password.");
                }

                }
                else if(SelectionType.equals("Admin")) {
                    String user = JOptionPane.showInputDialog("Enter your Admin id:");
                    String pass = JOptionPane.showInputDialog("Enter your password:");
                            if (user.equals(Aid) && pass.equals(Apassword)) {
                                log = true;
                            }
                    if (log) {
                        JOptionPane.showMessageDialog(null, "Login successful!");
                        String[] SelectionTypesAdmin = {"Doctor", "Patient", "Medicines", "Laboratories", "Facilities", "Employee", "Admin Info and Change Option","Medical Report","Payment Receipt", "exit"};
                        while (status1) {
                            String SelectionTypeAdmin = (String) JOptionPane.showInputDialog(null, "Select your Option:",
                                    "Hospital Management System", JOptionPane.QUESTION_MESSAGE, null, SelectionTypesAdmin, SelectionTypesAdmin[0]);

                            if (SelectionTypeAdmin.equals("Doctor")) {
                                while (s1) {
                                    int option = JOptionPane.showOptionDialog(null, "Do you want to add or see detials?",
                                            "Hospital Management System", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,
                                            null, new String[]{"Add a Doctor", "See Doctor details"}, "See a Doctor details");


                                    if (option == JOptionPane.YES_OPTION) {
                                        d[count1].new_doctor();
                                        count1++;
                                        JOptionPane.showMessageDialog(null, "Credentials Added Succesfully");
                                    } else {
                                        for (j = 0; j < count1; j++) {
                                            d[j].doctor_info();
                                        }
                                    }

                                    int option1 = JOptionPane.showOptionDialog(null, "Back to menu?",
                                            "Hospital Management System", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,
                                            null, new String[]{"Last menu", "Main menu"}, "Last menu");
                                    if (option1 == JOptionPane.YES_OPTION) {
                                        s1 = true;
                                    } else {
                                        s1 = false;
                                    }
                                }
                            } else if (SelectionTypeAdmin.equals("Patient")) {
                                while (s2) {
                                    int option = JOptionPane.showOptionDialog(null, "Do you want to add or see detials?",
                                            "Hospital Management System", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,
                                            null, new String[]{"Add a Patient", "See patient details"}, "See patient details");


                                    if (option == JOptionPane.YES_OPTION) {
                                        p[count2].new_patient();
                                        count2++;
                                        JOptionPane.showMessageDialog(null, "Credentials Added Succesfully");
                                    } else {
                                        for (j = 0; j < count2; j++) {
                                            p[j].patient_info();
                                        }
                                    }

                                    int option1 = JOptionPane.showOptionDialog(null, "Back to menu?",
                                            "Hospital Management System", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,
                                            null, new String[]{"Last menu", "Main menu"}, "Last menu");
                                    if (option1 == JOptionPane.YES_OPTION) {
                                        s2 = true;
                                    } else {
                                        s2 = false;
                                    }
                                }
                            } else if (SelectionTypeAdmin.equals("Medicines")) {
                                while (s3) {
                                    int option = JOptionPane.showOptionDialog(null, "Do you want to add or see detials?",
                                            "Hospital Management System", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,
                                            null, new String[]{"Add a Medicines", "See Medicines details"}, "See Medicines details");


                                    if (option == JOptionPane.YES_OPTION) {
                                        m[count3].new_medi();
                                        count3++;
                                        JOptionPane.showMessageDialog(null, "Credentials Added Succesfully");
                                    } else {
                                        for (j = 0; j < count3; j++) {
                                            m[j].find_medi();
                                        }
                                    }

                                    int option1 = JOptionPane.showOptionDialog(null, "Back to menu?",
                                            "Hospital Management System", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,
                                            null, new String[]{"Last menu", "Main menu"}, "Last menu");
                                    if (option1 == JOptionPane.YES_OPTION) {
                                        s3 = true;
                                    } else {
                                        s3 = false;
                                    }
                                }
                            } else if (SelectionTypeAdmin.equals("Laboratories")) {
                                while (s4) {
                                    int option = JOptionPane.showOptionDialog(null, "Do you want to add or see detials?",
                                            "Hospital Management System", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,
                                            null, new String[]{"Add Lab details", "See Lab details"}, "See Medicines details");


                                    if (option == JOptionPane.YES_OPTION) {
                                        l[count4].new_feci();
                                        count4++;
                                        JOptionPane.showMessageDialog(null, "Credentials Added Succesfully");
                                    } else {
                                       for (j = 0; j < count4; j++) {
                                            l[j].feci_list();
                                       }
                                    }

                                    int option1 = JOptionPane.showOptionDialog(null, "Back to menu?",
                                            "Hospital Management System", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,
                                            null, new String[]{"Last menu", "Main menu"}, "Last menu");
                                    if (option1 == JOptionPane.YES_OPTION) {
                                        s4 = true;
                                    } else {
                                        s4 = false;
                                    }
                                }
                            } else if (SelectionTypeAdmin.equals("Facilities")) {
                                while (s5) {
                                    int option = JOptionPane.showOptionDialog(null, "Do you want to add or see detials?",
                                            "Hospital Management System", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,
                                            null, new String[]{"Add Facilities", "See Facilities detail"}, "See Medicines details");


                                    if (option == JOptionPane.YES_OPTION) {
                                        f[count5].add_feci();
                                        count5++;
                                        JOptionPane.showMessageDialog(null, "Credentials Added Succesfully");
                                    } else {
                                       for (j = 0; j < count5; j++) {
                                            f[j].show_feci();
                                       }

                                    }

                                    int option1 = JOptionPane.showOptionDialog(null, "Back to menu?",
                                            "Hospital Management System", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,
                                            null, new String[]{"Last menu", "Main menu"}, "Last menu");
                                    if (option1 == JOptionPane.YES_OPTION) {
                                        s5 = true;
                                    } else {
                                        s5 = false;
                                    }
                                }
                            } else if (SelectionTypeAdmin.equals("Employee")) {
                                while (s6) {
                                    String[] Selection = {"Add Employee", "Nurse", "Worker", "Security"};
                                    String option = (String) JOptionPane.showInputDialog(null, "Select your Option:",
                                            "Hospital Management System", JOptionPane.QUESTION_MESSAGE, null, Selection, Selection[0]);

                                    if (option.equals("Add Employee")) {
                                        s[count6].new_emp();
                                        count6++;
                                        JOptionPane.showMessageDialog(null, "Credentials Added Succesfully");
                                    } else if (option.equals("Nurse")) {
                                        for (j = 0; j < count6; j++) {
                                            if (option.equals(s[j].desg))
                                                s[j].emp_info();
                                        }
                                    } else if (option.equals("Worker")) {
                                        for (j = 0; j < count6; j++) {
                                            if (option.equals(s[j].desg))
                                                s[j].emp_info();
                                        }
                                    } else {
                                       for (j = 0; j < count6; j++) {
                                            if (option.equals(s[j].desg))
                                                s[j].emp_info();
                                        }
                                    }

                                    int option1 = JOptionPane.showOptionDialog(null, "Back to menu?",
                                            "Hospital Management System", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,
                                            null, new String[]{"Last menu", "Main menu"}, "Last menu");
                                    if (option1 == JOptionPane.YES_OPTION) {
                                        s6 = true;
                                    } else {
                                        s6 = false;
                                    }
                                }
                            }else if(SelectionTypeAdmin.equals("Admin Info and Change Option")){
                                int option1 = JOptionPane.showOptionDialog(null, "Back to menu?",
                                        "Hospital Management System", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,
                                        null, new String[]{"View Info", "Change Admin"}, "Last menu");
                                if (option1 == JOptionPane.YES_OPTION) {
                                    JOptionPane.showMessageDialog(null, "Admin id     AdminName     Gender     Salary\n"+Aid + "         " + Aname + "         " + sex + "          " + salary);
                                } else {
                                    Aid = JOptionPane.showInputDialog("Enter Admin id:");
                                    Aname =JOptionPane.showInputDialog("Enter Admin Name:");
                                    sex = JOptionPane.showInputDialog("Enter Sex:");
                                    salary = (Integer.parseInt (JOptionPane.showInputDialog("Enter Salary:")));
                                    Apassword=JOptionPane.showInputDialog("Enter Password:");
                                    JOptionPane.showMessageDialog(null, "Credentials changed Succesfully");
                                }

                            }
                            if (SelectionTypeAdmin.equals("Payment Receipt")) {
                                int option = JOptionPane.showOptionDialog(null, "Generate or View Payment Receipt?",
                                        "Hospital Management System", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,
                                        null, new String[]{"Generate Payment Receipt", "Show Payment Receipt"}, "Show Payment Receipt");


                                if (option == JOptionPane.YES_OPTION) {
                                    pay[count2].new_receipt();
                                    count8++;
                                    JOptionPane.showMessageDialog(null, "Credentials Added Succesfully");
                                } else {
                                    String Ptid = JOptionPane.showInputDialog("Enter Patient id:");
                                    for (j = 0; j < count7; j++) {
                                        if (Ptid.equals(pay[j].pid))
                                            pay[j].receipt_info();
                                    }
                                }
                            }
                            else if (SelectionTypeAdmin.equals("Medical Report")) {
                                String Ptid = JOptionPane.showInputDialog("Enter Patient id:");
                                for (j = 0; j < count7; j++) {
                                    if (Ptid.equals(mr[j].pid))
                                        mr[j].report_info();
                                }
                            }
                            int option1 = JOptionPane.showOptionDialog(null, "Back to menu?",
                                    "Hospital Management System", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,
                                    null, new String[]{"Last menu", "Log Out"}, "Log Out");
                            if (option1 == JOptionPane.YES_OPTION) {
                                status1 = true;
                            }
                            else {
                                status1 = false;
                            }
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Invalid id or password.");
                    }
                }
                    else{
                    status=false;
                }
        }

    }
}