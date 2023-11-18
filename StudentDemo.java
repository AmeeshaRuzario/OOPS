import java.util.Scanner;

class Student {
    private String USN;
    private String Name;
    private String Branch;
    private String Phone;

    public Student(int size) {
        USN = " ";
        Name = " ";
        Branch = " ";
        Phone = " ";

    }

    public Student(String pUSN, String Name, String Branch, String Phone) {
        USN = pUSN;
        this.Name = Name;
        this.Branch = Branch;
        this.Phone = Phone;
    }

    void display() {
        System.out.println("USN:" + USN);
        System.out.println("Name:" + Name);
        System.out.println("Branch:" + Branch);
        System.out.println("Phone:" + Phone);
    }
}
    public class StudentDemo{

        public static void main(String[] args)
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("How many Students");
            int size= sc.nextInt();
            Student[] ob = new Student[size];
             sc=new Scanner(System.in);
            for(int i=0;i<ob.length;i++)
            {
                String USN,Name,Branch,Phone;
                System.out.println("Enter USN,Name,Branch,Phone");
                USN=sc.nextLine();
                Name=sc.nextLine();
                Branch=sc.nextLine();
                Phone=sc.nextLine();
                Student objs=new Student(USN,Name,Branch,Phone);
                ob[i]=objs;

            }
            for(int i=0;i<ob.length;i++)
            {
                ob[i].display();
            }
        }
    }

