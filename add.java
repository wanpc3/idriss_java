import java.util.Scanner;

public class add{
    public static void main(String[]args){
        double num1, num2, total;
        Scanner number = new Scanner(System.in);

        System.out.println("Enter first number: ");
        num1 = number.nextDouble();

        System.out.println("Enter second number: ");
        num2 = number.nextDouble();

        //process
        total = num1 + num2;
        System.out.println("Sum of two numbers");
        System.out.println(total);
    }
}