import java.util.Scanner;

public class Calculator {
    public static double add(double a,double b){
        return a+b;
    }
    public static double subtract(double a,double b){
        return a-b;
    }
    public static double multiply(double a, double b){
        return a*b;
    }
    public static double divison(double a,double b){
        if (b==0){
            System.out.println("cant devide with zero");
            return 0;
        }
        return a / b;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("welcome to Harsha's Simple  calci");
        System.out.println("enter your first number :");
        double num1=sc.nextDouble();

        System.out.println("enter your second number :");
        double num2=sc.nextDouble();

        System.out.println("select the operator :");
        char operator=sc.next().charAt(0);

        double result;

        switch (operator){
            case  '+':
                result=add(num1,num2);
                break;

            case  '-':
                result=subtract(num1,num2);
                break;

            case  '*':
                result=multiply(num1,num2);
                break;

            case  '/':
                result=divison(num1,num2);
                break;
            default:
                System.out.println(" Invalid operator selected ");
                return;
        }
        System.out.println("Result :"+ result);
        sc.close();
    }
}
