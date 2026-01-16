import java.util.Scanner;

public class CosineExample {

    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Type an angle in radians: ");
        double angleInRadians = keyboard.nextDouble();
        double cosine = Math.cos(angleInRadians);
        System.out.println("The cosine of " + angleInRadians +
                " radians is " + cosine);

        System.out.print("Type an angle in degrees: ");
        double angleInDegrees = keyboard.nextDouble();
        angleInRadians = Math.toRadians(angleInDegrees);
        cosine = Math.cos(angleInRadians);
        System.out.println("The cosine of " + angleInDegrees +
                " degrees is " + cosine);


//        Scanner keyboard = new Scanner(System.in);
        System.out.print("Type the radius of the sphere in inches: ");
        double radius = keyboard.nextDouble();
        double volume = 4 * Math.PI * Math.pow(radius, 3) / 3;
        System.out.println("The volume of a sphere of radius " + radius +
                " inches is " + volume + " cubic inches.");
    } // End main
}
