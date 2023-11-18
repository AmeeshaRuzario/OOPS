import java.util.Scanner;

class DistanceConverter{
    public void converter()
    {
        System.out.println("Enter the distance in miles:");
        Scanner sc=new Scanner(System.in);
        int miles = sc.nextInt();
        double km=1.609*miles;
        System.out.println("The converted distance in kilometer:"+km);
        System.out.println("Enter the distance in km");
        Scanner read = new Scanner(System.in);
        int kilometer = read.nextInt();
        double Miles=kilometer/1.609;
        double meter=kilometer*1000;
        System.out.println("The Converted Distance in miles is:"+Miles+"and the converted distance in meter is:"+meter);
        System.out.println("Enter the distance in meter");
        Scanner Read=new Scanner(System.in);
        int Meter=Read.nextInt();
        double Kilometer=Meter/1000;
        System.out.println("the Converted distance in Kilometer is:"+Kilometer);

    }
}
class TimeConverter
{
    public  void converter()
    {
        System.out.println("Enter the time in hours:");
        Scanner read= new Scanner(System.in);
        int hours =read.nextInt();
        double min=hours*60;
        double sec=hours*3600;
        System.out.println("converted time in min:"+min+"converted time in sec:"+sec);
        System.out.println("Enter the time in min");
        Scanner sc= new Scanner(System.in);
        int minutes=sc.nextInt();
        double Sec=minutes*60;
        double Hours=min/60;
        System.out.println("converted time in sec:"+sec+"and in hours:"+Hours);



    }
}
public class Convertor {
    public static void main(String[] args)
    {
        DistanceConverter dc1= new DistanceConverter();
        dc1.converter();
        TimeConverter tc1=new TimeConverter();
        tc1.converter();
    }
}
