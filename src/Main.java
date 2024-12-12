import java.util.Scanner;
import java.lang.Math.*;

public class Main {

    public static void subtract() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int number1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int number2 = scanner.nextInt();
        int result = number1-number2;

        System.out.println("The subtraction result is: " + result);
    }
    public static void addition() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int number1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int number2 = scanner.nextInt();
        int result = number1+number2;

        System.out.println("The addition result is: " + result);
    }
    public static void multiply() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int number1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int number2 = scanner.nextInt();
        int result = number1*number2;

        System.out.println("The multiply result is: " + result);
    }
    public static void divide() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int number1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int number2 = scanner.nextInt();
        if( number2 == 0){
            System.out.print("Error:you can't do that ");
        }
        else {
            int result = number1 / number2;
            System.out.println("The divide result is: " + result);
        }
    }
    public static void  power() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int number1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int number2 = scanner.nextInt();
        double result = Math.pow(number1,number2);
        System.out.println("The power result is: " + result);
    }
    public static void squareroot () {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int number1 = scanner.nextInt();
        double result = Math.sqrt(number1);
        System.out.println("The square root result is: " + result);
    }
    public static void factorial () {
        System.out.println("enter a number");
        Scanner scanner = new Scanner(System.in);
        double n = scanner.nextDouble();
        for (double i = n-1; i>=1; i--) {
              n *=i;
        }
        System.out.println("factorial result is: "+n);
    }

    public  static void main (String [] args){
        int choice;
        do {

            System.out.println("\n\t** Menu  **\n ");
            System.out.println("1: Subtraction(-)");
            System.out.println("2: Addition(+)");
            System.out.println("3: multiply(*)");
            System.out.println("4: divide(/)");
            System.out.println("5: power(^)");
            System.out.println("6: square root");
            System.out.println("7: factorial");
            System.out.println("0: the end");

            System.out.println("enter the choice: ");
            Scanner scanner = new Scanner(System.in);
            choice = scanner.nextInt();

            switch(choice) {
                case 1:
                    subtract();
                    break;
                case 2:
                    addition();
                    break;
                case 3:
                    multiply();
                    break;
                case 4:
                    divide();
                    break;
                case 5:
                    power();
                    break;
                case 6:
                    squareroot();
                    break;
                case 7:
                    factorial();
                    break;
                case 0:
                    System.out.println("the end");
                default: System.out.println("Invalid choice\n");
                break;



            }
        }while (choice != 0);  // Loop ends when the user chooses 0


    }

}




