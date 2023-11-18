import java.util.Scanner;

class staff{
    String staffid,name,phone,salary;

    void readdata()
    {
        Scanner s =new Scanner(System.in);
        System.out.println("enter the staffid");
        staffid = s.nextLine();
        System.out.println("enter the name");
        name= s.nextLine();
        System.out.println("enter the phone");
        phone = s.nextLine();
        System.out.println("enter the salary");
        salary = s.nextLine();

    }
    void display()
    {
        System.out.println(" staffid :" +staffid);
        System.out.println(" name :" +name);
        System.out.println(" phone :" +phone);
        System.out.println(" salary :" +salary);
    }
}

class teaching extends staff{
    String domain,publications;
    void readdata()
    {
        super.readdata();
        Scanner s =new Scanner(System.in);
        System.out.println("enter the domain");
        domain = s.nextLine();
        System.out.println("enter the publication");
        publications= s.nextLine();

    }
    void display()
    {
        super.display();
        System.out.println(" domain :" +domain);
        System.out.println(" publications :" +publications);
    }
}

class technical extends staff
{
    String skills;
    void readdata()
    {
        Scanner s = new Scanner(System.in);
        super.readdata();
        System.out.println("enter the skills");
        skills = s.nextLine();

    }
    void display()
    {
        super.display();
        System.out.println(" skills :" +skills);

    }
}

class contract extends staff
{
    String contract;
    void readdata()
    {
        super.readdata();
        Scanner s = new Scanner(System.in);
        System.out.println("enter the contract period");
        contract = s.nextLine();
    }
    void display()
    {
        super.display();
        System.out.println(" contract period is  :" +contract);

    }
}
public class staffs {
    public static void main(String[] args) {
        teaching obj1 = new teaching();
        obj1.readdata();
        obj1.display();

        technical obj2 = new technical();
        obj2.readdata();
        obj2.display();

        contract obj3 = new contract();
        obj3.readdata();
        obj3.display();

    }
}
