import java.util.Scanner;

public  class Calculator {

    public static void addition(int c,int d){
        System.out.println("Addition of num1 and num2:"+(c+d));
    }
    public static void subtraction(int c,int d){
        System.out.println("Subtraction of num1 and num2:"+(c-d));
    }
    public static void multiplication(int c,int d){
        System.out.println("Multiplication of num1 and num2:"+(c*d));
    }
    public static void division(int c,int d){
        if(d!=0){
            System.out.println("Division of num1 and num2:"+(c/d));
        } else{
            System.out.println("Error: Cannot divide by zero!");
        }
    }
public static void main(String args[]){
    Scanner a = new Scanner(System.in);
    boolean running = true;
    while (running) {
    System.out.println("Calculator");
    System.out.println(" 1.Addition \n 2.Subtraction\n 3.Multiplication\n 4.Division\n 5.Exit");
    int choice = a.nextInt();
    if(choice == 5){
        System.out.println("Exiting Thank you..");
        running = false;
    }else{
        System.out.print("Enter the first number: ");
        int num1 = a.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = a.nextInt();
        switch (choice) {
            case 1:
                addition(num1, num2);
                break;
            case 2:
                subtraction(num1, num2);
                break;
            case 3:
                multiplication(num1, num2);
                break;
            case 4:
                division(num1, num2);
                break;
            default:
                System.out.println("Invalid input, please try again.");;
        }
    }
} 
    a.close();
}
}