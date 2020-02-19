import java.util.Scanner;

public class practice {


     public static void add()
     {

         int num1 = 0;
         int num2 = 0;
         int sum = 0;

         Scanner key=new Scanner(System.in);
         System.out.println("Enter num1: ");
         num1=key.nextInt();


         System.out.println("Enter num2: ");
         num2=key.nextInt();

         sum=num1+num2;

         System.out.println("your sum is: "+sum);
     }
    public static void main(String[] args) {

        add();
    }
}
