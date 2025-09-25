import java.util.Scanner;

public class Factorial {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Enter number you want to find factorial of: ");
        int userInput = input.nextInt();

        int originalUserInput = userInput;

        // Factorials end at 1
        int result = 1;
        while(userInput > 1){
            result = result * userInput;

            userInput --;
        }

        System.out.println("Result for " + originalUserInput +" is " + result);
    }
}
