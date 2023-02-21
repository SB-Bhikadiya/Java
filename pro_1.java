//pro 1
import java.util.*;
import java.lang.Thread;

public class pro_1 extends Thread
{
    int rno[] = new int[5];
    String[] name = new String[5];
    public void getdata()
    {
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<5;i++)
        {
            System.out.print("Enter Rno : ");
            rno[i]= sc.nextInt();
            System.out.print("Enter Name : ");
            name[i] = sc.next();
        }
    }
    public void sortdata()
    {
        String temp;
        int temprno;
        for(int i=0;i<5;i++)
        {
            for(int j=i;j<5;j++)
            {
                if(name[i].compareTo(name[j]) > 0)
                {
                    temp = name[i];
                    name[i] = name[j];
                    name[j] = temp;

                    temprno = rno[i];
                    rno[i] = rno[j];
                    rno[j] = temprno;
                }
            }
        }
    }
    public void printdata()
    {
        try 
        {
            Thread t = new Thread("Student");
            System.out.println("============================================");
            System.out.println("Student's Data in assending order of name");
            System.out.println("============================================");
            for(int i=0;i<5;i++)
            {
                System.out.print("\tRno : "+rno[i]);
                System.out.println("\tName : "+name[i]);
                t.sleep(1000);
            }
        }
        catch(Exception e)
        {
            System.out.println("Exception : "+e.getMessage());
        }
    }

    public static void main(String args[])
    {
        pro_1 s1 = new pro_1();
        s1.getdata();
        s1.sortdata();
        s1.printdata();
    }
}