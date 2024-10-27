package app;

public class Main {

    private static double KM_IN_MILE = 1.60934;

    public static void main(String[] args) {
        System.out.println("Miles to Kilometers converter.");
        double miles = 10;
        double kilometers = milesToKilometers(miles);
        System.out.println(miles + " miles is equal to " + kilometers + " kilometers.");

    }

    private static double milesToKilometers(double miles) {
        return miles * KM_IN_MILE;
    }
}
