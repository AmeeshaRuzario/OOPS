import java.util.InputMismatchException;
import java.util.Scanner;

class generalexception {
    int arr[];
    void readata()

    {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the size of array");
        int size = s.nextInt();
        arr = new int[size];
        System.out.println("enter the array elements");
        for (int i = 0; i < arr.length; i++)
            arr[i] = s.nextInt();
    }

    int findsmall() {
        int small = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < small)
                small = arr[i];
        }
        return small;
    }
    void dividebysmall()
    {
        int small = findsmall();
        int result;
        for (int i = 0; i < arr.length; i++){
            result = arr[i]/small;
        }
        System.out.println("division is successfull");

    }

    void findnumber()
    {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the index");
        int index = s.nextInt();
        int value = arr[index];
        System.out.println("value is "+value);

    }

    void convert()
    {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the string you want to convert");
        String x = s.nextLine();
        int value = Integer.parseInt(x);
        System.out.println("conversion is successfull");

    }

    void compute(){
         readata();
        findsmall();
        dividebysmall();
        findnumber();
        convert();


    }

}

public class exceptionhandling {
    public static void main(String[] args) {
        generalexception obj1 = new generalexception();
        try
        {
            obj1.compute();
        }
        catch(ArithmeticException e)
        {
            System.out.println("arithmetic exception has occuered " + e);
        }
        catch(InputMismatchException e)
        {
            System.out.println("check the input  has occuered " + e);
        }
        catch(NumberFormatException e)
        {
            System.out.println("NUMBER MISS matched " + e);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("array index out of bound bhai " + e);
        }

    }
}
