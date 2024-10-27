package app;

public class Main {

    private static double KM_IN_MILE = 1.60934;

    public static void main(String[] args) {
        System.out.println("Miles to Kilometers converter.");
        double miles = 10;
        var km = 432;
        double kilometers = milesToKilometers(miles);
        double milesFromKilometers = kilometerToMiles(km);
        System.out.println(miles + " miles is equal to " + kilometers + " kilometers.");
        System.out.println(km + " kilometers is equal to " + milesFromKilometers + " miles.");
    }

    private static double milesToKilometers(double miles) {
        return miles * KM_IN_MILE;
    }

    private static double kilometerToMiles(double kilometers) {
        return kilometers / KM_IN_MILE;
    }
}

