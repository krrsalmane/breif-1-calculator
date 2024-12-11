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
        int result = number1/number2;

        System.out.println("The divide result is: " + result);

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


    public  static void main (String [] args){
        int choice;
        do {

            System.out.println("\t** Menu  **\n ");
            System.out.println("1: Subtraction(-)");
            System.out.println("2: Addition(+)");
            System.out.println("3: multiply(*)");
            System.out.println("4: divide(/)");
            System.out.println("5: power(^)");

            System.out.println("enter the choice de 1 to 8");
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



                case 8:
                    break;


            }
        }while (choice != 8);  // Loop ends when the user chooses 0


    }

}




