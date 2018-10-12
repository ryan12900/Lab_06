import java.util.Scanner;
public class Calculator
{
    //new comment for the new commit tttttrt
    public static void main(String[] args)
    {
        //inputing and storing the variables for the operands
        System.out.print("Enter first operand: ");
        Scanner input = new Scanner(System.in);
        double firstOperand = input.nextDouble();
        System.out.print("Enter second operand: ");
        double secondOperand = input.nextDouble();
        System.out.println();
        //display menu and storing operation response
        System.out.println("Calculator Menu\n---------------\n1. Addition\n2. Subtraction\n3. Multiplication\n4. Division");
        System.out.print("Which operation do you want to perform? ");
        int response = input.nextInt();
        System.out.println();

        //switch case for the menu of operations
        switch (response) {
            case 1:
                System.out.println("The result of the operation is " + (firstOperand + secondOperand) + ". Goodbye!");
                break;
            case 2:
                System.out.println("The result of the operation is " + (firstOperand - secondOperand) + ". Goodbye!");
                break;

            case 3:
                System.out.println("The result of the operation is " + (firstOperand * secondOperand) + ". Goodbye!");
                break;

            case 4:
                System.out.println("The result of the operation is " + (firstOperand / secondOperand) + ". Goodbye!");
                break;
            default:
                System.out.println("Error: Invalid selection! Terminating program.");
                break;

    }
    }
}
