import java.util.Scanner;

public class AppleProblem {

    public static void main(String[] args){

        Scanner keyboard = new Scanner(System.in);

        int applesInTheBox;
        double priceApple, priceBox;

        System.out.print("How may apples in the box ? :");
        applesInTheBox = keyboard.nextInt();

        System.out.print("What is the price of an apple ? :");
        priceApple = keyboard.nextDouble();

        System.out.print("What is the price of the box ? :");
        priceBox = keyboard.nextDouble();


        double totalIndividual = priceApple * applesInTheBox;

        double savings = totalIndividual - priceBox;

        System.out.println("The amount saved by buying in box is $" +savings);

    }

}
