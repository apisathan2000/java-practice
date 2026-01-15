import java.util.Scanner;

public class inputLesson {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        int age;
        double area;

        System.out.print("What is your age ? :");
        age = keyboard.nextInt();

        System.out.println("The user's age is " + age);

        System.out.print("Enter the area of your room in square feet :");
        area = keyboard.nextDouble();

        System.out.println("The area of users room in square feet is " + area);


        System.out.println("Please enter your height in feet and inches:");
        int feet = keyboard.nextInt();
        int inches = keyboard.nextInt();

        System.out.println("You entered " + feet + " feet and " + inches + " inches.");

    }

}
