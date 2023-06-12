import java.util.Scanner;
public class NumberComparison {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double firstNum = 0;
        double secondNum = 0;
        String trash = "";
        System.out.println("Enter your first number: ");
        if(in.hasNextDouble()) {
            firstNum = in.nextDouble();
            in.nextLine();//clear the buffer
        }
        else {trash = in.nextLine();
            System.out.println("You must enter a valid number not " + trash);
            System.out.println("Run the program again!");
            System.exit(0);}
        System.out.println("Enter your second number: ");
        if(in.hasNextDouble()) {
            secondNum = in.nextDouble();
            in.nextLine();//clear the buffer
        }
        else {trash = in.nextLine();
            System.out.println("You must enter a valid number not " + trash);
            System.out.println("Run the program again!");
            System.exit(0);}
        if (firstNum == secondNum) {
            System.out.println("The two numbers are equal.");}
        else if (firstNum > secondNum){
            System.out.println("The second input is less than the first input.");}
        else {
            System.out.println("the first input is less than the second input.");}
    }
}