//pro 3
import java.util.*;

public class pro_3 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String : ");
        String str = sc.nextLine();
        String vowels = "aeiouAEIOU";
        String vow = "";
        String nonvow = "";

        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)== 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u' || str.charAt(i) == 'A'|| str.charAt(i) == 'E'|| str.charAt(i) == 'I'|| str.charAt(i) == 'O'|| str.charAt(i) == 'U')
            {
                vow += str.charAt(i);
            }
            else 
            {
                nonvow += str.charAt(i);
            }
        }

        System.out.println("1.Extract Vowels");
        System.out.println("2.Extract Non-Vowels");
        int ch1 = sc.nextInt();
        System.out.println("1.Output in UPPERCASE");
        System.out.println("2.Output in lowercase");
        int ch2 = sc.nextInt();

        switch(ch1)
        {
            case 1:
                switch(ch2)
                {
                    case 1:
                        System.out.println(vow.toUpperCase());
                        break;
                    case 2:
                        System.out.println(vow.toLowerCase());
                        break;
                }
                break;
            case 2:
                switch(ch2)
                {
                    case 1:
                        System.out.println(nonvow.toUpperCase());
                        break;
                    case 2:
                        System.out.println(nonvow.toLowerCase());
                        break;
                }
                break;
        }
    }
}