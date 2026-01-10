public class Apples {

    public static void main(String[] args) {

        final int NUMBER_IN_DOZEN = 12;
        int noOfApples;
        double pricePerApple, totalPrice;

        noOfApples = NUMBER_IN_DOZEN;
        pricePerApple = 0.29;


        totalPrice = noOfApples * pricePerApple;

        System.out.println(noOfApples + " apples at the price of $" + pricePerApple + " costs $" + totalPrice);


    } // end main
} // end Apples
