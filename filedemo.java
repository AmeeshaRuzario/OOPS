import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class myfile{
    public void process()
    {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the file name");
        String filename = s.nextLine();
        File file = new File(filename);
        int linecount = 0;
        int charcount =0;
        int wordcount =0;
        try
        {
            Scanner f = new Scanner(file);
            while(f.hasNext()){
                String line = f.nextLine();
                linecount++;
                String[] arr = line.split("\\s");
                wordcount = wordcount + arr.length;
                charcount +=line.length();


            }

        }
        catch(FileNotFoundException e)
        {
            System.out.println(e);
        }
        System.out.println("number of line :" +linecount);
        System.out.println("number of words "+ wordcount);
        System.out.println("number of characters "+ charcount);
    }
}




public class Main {
    public static void main(String[] args) {
        myfile a = new myfile();
        a.process();

        }
    }
