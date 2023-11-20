import java.util.*;
class validateexception extends Exception{
    String msg;
    validateexception(String msg)
    {
        this.msg=msg;
    }
    public String toString()
    {
        return msg;
    }
}
   public class B2 {
    public static void validatusn(String usn) throws  validateexception{
        int len = usn.length();
        if(len!=10){
            throw new validateexception("invalid usn ");
        }
        boolean start = usn.startsWith("NNM");
        if(start==false)
        {
            throw new validateexception("invalid usn starting digits ");
        }
        String year = usn.substring(3,5);
        int y = Integer.parseInt(year);
        if(y>23)
            throw new validateexception("invalid year of admission ");
        try{
            String last = usn.substring(7,10);
            int x =Integer.parseInt(last);
        }
        catch(NumberFormatException e)
        {
            throw new validateexception("invalid last digits ");
        }
        String branch = usn.substring(5,7);
        String[] a = {"CS","ISE","CIVIL"};
        boolean branchvalue = false;
        for(String str:a)
        {
            if(branch.equals(str))
            {
                branchvalue = true;
            }
        }
        if(branchvalue==false)
            throw new validateexception("invalid branch ");
    }

       public static void main(String[] args) {
           Scanner s = new Scanner(System.in);
           System.out.println("enter the usn");
           String usn = s.nextLine();
           try{
               validatusn(usn);
           }
           catch(validateexception ex){
               System.out.println(ex);
           }
       }
}
