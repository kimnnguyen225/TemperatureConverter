import java.text.NumberFormat;
import java.util.Scanner;

public class TemperatureConverter {

    public static void main(String[] args) {

        // formula: c = (f-32) * 5/9
        // This application converts temperature values from Fahrenheit to Celsius
        // The application should accept decimal entries like 77.5
        // The application should format the Celsius temperature to allow for up to 2 decimal places
        // Assume that the user will enter valid data
        // The application should continue only if the user enters y or Y to continue

        // create Scanner object
        Scanner sc = new Scanner(System.in);

        // display welcome message
        System.out.println("Welcome to the Temperature Converter");
        System.out.println();

        // perform calculation until choice isn't y or Y
        String choice = "y";
        while (choice.equalsIgnoreCase("y")) {
            // get input data from user
            System.out.println("Enter degrees in Fahrenheit: ");
            double degreeFehrenheit = sc.nextDouble();

            // convert F to C
            double convertFtoC = (degreeFehrenheit - 32) * 5/9;

            // format Celsius output
            // import NumberFormat class, then call getNumberInstance() static method to return
            // NumberFormat object named number. Once you use a static method to return a NumberFormat
            // object named number, you can call non-static methods from that object
            NumberFormat number = NumberFormat.getNumberInstance();
            number.setMaximumFractionDigits(2);
            String convertFtoCString = number.format(convertFtoC);

            // display result
            System.out.println("Degrees in Celsius: " + convertFtoCString);

            // ask if user wants to continue
            System.out.println("Continue? (y/n): ");
            choice = sc.next();
            System.out.println();
        }
        sc.close();
    }
}
