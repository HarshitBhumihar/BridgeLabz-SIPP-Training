class UnitConvertor {

    // Method to convert kilometers to miles
    public static double convertKmToMiles(double km) {
        double km2miles = 0.621371;
        return km * km2miles;
    }

    // Method to convert miles to kilometers
    public static double convertMilesToKm(double miles) {
        double miles2km = 1.60934;
        return miles * miles2km;
    }

    // Method to convert meters to feet
    public static double convertMetersToFeet(double meters) {
        double meters2feet = 3.28084;
        return meters * meters2feet;
    }

    // Method to convert feet to meters
    public static double convertFeetToMeters(double feet) {
        double feet2meters = 0.3048;
        return feet * feet2meters;
    }

    // Main method to demonstrate functionality
    public static void main(String[] args) {
        double km = 5;
        double miles = 3;
        double meters = 10;
        double feet = 20;

        System.out.println(km + " kilometers = " + convertKmToMiles(km) + " miles.");
        System.out.println(miles + " miles = " + convertMilesToKm(miles) + " kilometers.");
        System.out.println(meters + " meters = " + convertMetersToFeet(meters) + " feet.");
        System.out.println(feet + " feet = " + convertFeetToMeters(feet) + " meters.");
    }
}