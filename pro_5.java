//pro 5
import java.util.*;

public class pro_5 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String : ");
        String str = sc.nextLine();

        System.out.println("In Which case Do you want to change?");
        System.out.println("1.UPPERCASE");
        System.out.println("2.lowercase");
        System.out.println("3.Sentence case");
        System.out.println("4.tOGGLE cASE");
        System.out.print("Enter Your Choic : ");
        int choic = sc.nextInt();

        switch(choic)
        {
            case 1:
                System.out.println("Output : "+str.toUpperCase());
                break;
            case 2:
                System.out.println("Output : "+str.toLowerCase());
                break;
            case 3:
                char ch[] = str.toCharArray();

                for(int i=0;i<str.length();i++)
                {
                    if(ch[i]>=97 && ch[i]<=122)
                    {
                        // System.out.print("hello");
                       char temp=Character.toUpperCase(ch[i]);
                       System.out.print(temp);
                    }
                    if(str.charAt(i)=='.'  && str.charAt(i+1)>=97 && str.charAt(i+1)<=122)
                    {
                      //  str.charAt(i+2) = str.charAt(i+2) - 32;
                    }
                }

                System.out.println("Output : "+str);

                break;

        }
    }
}