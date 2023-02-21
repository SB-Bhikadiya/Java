//pro 14
import package_maths.ArithmeticOperation;

public class pro_14 
{
    public static void main(String args[])
    {
        ArithmeticOperation a1 = new ArithmeticOperation();
        int sum = a1.sum(10,20);
        int sub = a1.sub(20,10);
        int mul = a1.mul(10,5);
        int div =  a1.div(50,5);
        System.out.println("Addition is : "+sum);
        System.out.println("Substraction is : "+sub);
        System.out.println("Multiplication is : "+sum);
        System.out.println("Division is : "+div);

    }
}
