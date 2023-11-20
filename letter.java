import java.util.Scanner;

class letter{
    public void numberofvowels(String msg){
        int acount =0,ecount=0,icount=0,ocount=0,ucount=0;
        for(int i=0;i<msg.length();i++)
        {
            char ch = msg.charAt(i);

            if(ch=='a'||ch=='A')
                acount++;
            if(ch=='e'||ch=='E')
                ecount++;
            if(ch=='i'||ch=='I')
                icount++;
            if(ch=='o'||ch=='O')
                 ocount++;
            if(ch=='u'||ch=='U')
                ucount++;
        }
        System.out.println("number of e letters "+ecount);
        System.out.println("number of a letters "+acount);
        System.out.println("number of i letters "+icount);
        System.out.println("number of o letters "+ocount);
        System.out.println("number of u letters "+ucount);


    }
    void nodigits(String msg){
        int noofdigits=0;
        for(int i=0;i<msg.length();i++) {
            char ch = msg.charAt(i);
            if (ch >= '0' && ch <= '9') {
                noofdigits++;
            }
        }
        System.out.println("no of digigts is " + noofdigits);

    }
    void noofcap(String msg){
        int nocap=0;
        for(int i=0;i<msg.length();i++) {
            char ch = msg.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                nocap++;
                System.out.println("the capital letter is present at position " + i);
            }
        }
        System.out.println("number of capital letters is " +nocap);

    }

}

public class lettergame {
    public static void main(String[] args) {
        letter obj = new letter();
        Scanner s = new Scanner(System.in);
        String msg = s.nextLine();
        obj.numberofvowels(msg);
        obj.nodigits(msg);
        obj.noofcap(msg);


    }
}
