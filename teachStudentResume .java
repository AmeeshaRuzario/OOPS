import java.util.Scanner;

interface resume{
     public void biodata();
}

class teacher implements resume{
    String persoinfo,qualification,experience,achievements;
    void readdata(){
        Scanner s = new Scanner(System.in);
        System.out.println("enter the personel information of teacher (name) ");
        persoinfo = s.nextLine();
        System.out.println("enter the qualification ");
        qualification = s.nextLine();
        System.out.println("enter the experience  ");
        experience = s.nextLine();
        System.out.println("enter achievements ");
        achievements = s.nextLine();

    }
    public void biodata(){
        System.out.println(" personal info "+ persoinfo);
        System.out.println(" qualification "+ qualification);
        System.out.println(" experience "+ experience);
        System.out.println(" achievements "+ achievements);


    }

}

class student implements resume {
    String persoinfo, result, discipline;

    void readdata() {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the personel information of student (name) ");
        persoinfo = s.nextLine();
        System.out.println("enter the result ");
        result = s.nextLine();
        System.out.println("enter the discipline ");
        discipline = s.nextLine();


    }
   public  void biodata()
    {
        System.out.println(" personal info "+ persoinfo);
        System.out.println(" result  "+ result);
        System.out.println(" discipline "+ discipline);
    }
}





public class teachStudentResume {
    public static void main(String[] args) {
        teacher obj1 = new teacher();
        obj1.readdata();
        obj1.biodata();

        student obj2 = new student();
        obj2.readdata();
        obj2.biodata();

    }
}
