import java.util.Random;

class firstthread extends Thread{
    public void run()
    {
        Random rand = new Random();
        while(true)
        {
            int compno = rand.nextInt(10);
            System.out.println(" random number generated is : " + compno);
            try
            {
                Thread.sleep(500);

            }
            catch(InterruptedException e)
            {
                System.out.println("interrupted sleep " + e);
            }
            secondthread secondthread  = new secondthread(compno);
            secondthread.start();
            thirdthread thirdthread = new  thirdthread( compno);
            thirdthread.start();
        }
    }
}

class secondthread extends Thread{
    int num;
   secondthread(int n){
         num  = n;
    }
    public void run()
    {
        int square;
        square = num * num;
        System.out.println("square is " + square);
    }
}
class thirdthread extends Thread{
    int num;
    thirdthread(int n){
        num  = n;
    }
    public void run()
    {
        int square;
        square = num * num*num;
        System.out.println("cube is " + square);
    }
}

public class multithreaded {
    public static void main(String[] args) {
        firstthread obj = new firstthread();
        obj.start();


    }
}
