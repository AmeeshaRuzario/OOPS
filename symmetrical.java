import java.util.Scanner;

class symmetrical
{
    int arr[];
    int oddno;
    int evenno;
    public void readelements()
    {
        Scanner s =new Scanner(System.in);
        System.out.println("enter the size of array");
        int size = s.nextInt();
        arr = new int[size];

        for(int i=0;i<size;i++)
        {
            System.out.println("enter the  element ");

            arr[i] = s.nextInt();


        }
    }
    void compute()
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%2==0)
                evenno++;
            else
                oddno++;
        }
    }
    int getevenno()
    {
        return evenno;
    }
    int getOddno()
    {
        return oddno;
    }
}



public class CheckSymmetrical {
    public static void main(String[] args) {
        symmetrical arr1 = new symmetrical();

        arr1.readelements();
        arr1.compute();

        symmetrical arr2 = new symmetrical();

        arr2.readelements();
        arr2.compute();

        if(arr1.getevenno()==arr2.getevenno()&arr1.getOddno()==arr2.getOddno())
            System.out.println("symmetrical");
        else
            System.out.println("not symmetrical");




    }
}
