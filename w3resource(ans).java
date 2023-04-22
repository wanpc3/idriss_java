//Java basic exercise answers
import java.util.Scanner;

public class Main{
  public static void main(String[]args){

    Scanner input = new Scanner(System.in);
    int result_1;
    double result_2;
    //Question 1
    System.out.println("Hello");
    System.out.println("Idriss");
    System.out.println("\n");
    //Question 2
    int a = 74, b = 36;
    result_1 = a + b;
    System.out.println(result_1);
    System.out.println("\n");
    //Question 3
    double c = 50, d = 3;
    result_1 = 50/3;
    System.out.println(result_1);
    //Question 4
    int line_1,line_2,line_3,line_4;
    
    line_1 = -5 + 8 * 6;
    System.out.println(line_1);
    
    line_2 = (55+9) % 9;
    System.out.println(line_2);
    
    line_3 = 20 + -3 * 5 / 8;
    System.out.println(line_3);
    
    line_4 = 5 + 15 / 3 * 2 - 8 % 3;
    System.out.println(line_4);
    
    System.out.println("\n");
    //Question 5
    int num1, num2;
    System.out.println("Test Data:");
    System.out.println("Input first number: ");
    num1 = input.nextInt();
    System.out.println("Input Second number: ");
    num2 = input.nextInt();
    result_1 = num1 + num2;
    System.out.println(result_1);

    System.out.println("\n");
    //Question 6
    System.out.println("Test Data:");
    System.out.println("Input first number: ");
    num1 = input.nextInt();
    System.out.println("Input second number");
    num2 = input.nextInt();
    System.out.println(num1 + num2);
    System.out.println(num1 - num2);
    System.out.println(num1 * num2);
    System.out.println(num1 / num2);
    System.out.println(num1 % num2);
    }
  }
