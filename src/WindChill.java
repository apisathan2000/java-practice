import java.util.Scanner;

public class WindChill {

    public static void main(String[] args){

        final double c1 = 35.74;
        final double c2 = 0.6215;
        final double c3 = 35.75;
        final double c4 = 0.4275;

        Scanner keyboard = new Scanner(System.in);


        double temperatureCurrentAir;
        double velocityWind;

        System.out.print("Enter current air temperature in Fahrenheit:");
        temperatureCurrentAir = keyboard.nextDouble();

        System.out.print("Enter the velocity of the wind in miles per hour:");
        velocityWind = keyboard.nextDouble();

        // W = c1 + c2 × T – c3 × V0.16 + c4 × T × V0.16

        double velocityPower = Math.pow(velocityWind,0.16);


        double windChill = c1 + (c2 * temperatureCurrentAir) - (c3 * velocityPower) + (c4 * temperatureCurrentAir * velocityPower);

        System.out.println("The wind chill for "+temperatureCurrentAir+"F air with speed of "+velocityWind+" miles per hour is "+Math.round(windChill)+"F" );





    }

}
