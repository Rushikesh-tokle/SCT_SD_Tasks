import java.util.Scanner;

public class SCT_SD_task1 {

    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static double celsiusToKelvin(double celsius) {
        return celsius + 273.15;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static double fahrenheitToKelvin(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9 + 273.15;
    }

    public static double kelvinToCelsius(double kelvin) {
        return kelvin - 273.15;
    }

    public static double kelvinToFahrenheit(double kelvin) {
        return (kelvin - 273.15) * 9 / 5 + 32;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Temperature Conversion Program");
        System.out.println("Choose the conversion type:");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Celsius to Kelvin");
        System.out.println("3. Fahrenheit to Celsius");
        System.out.println("4. Fahrenheit to Kelvin");
        System.out.println("5. Kelvin to Celsius");
        System.out.println("6. Kelvin to Fahrenheit");
        System.out.print("Enter your choice (1-6): ");
        int choice = scanner.nextInt();

        System.out.print("Enter the temperature to convert: ");
        double temperature = scanner.nextDouble();

        double convertedTemp = 0.0;
        switch (choice) {
            case 1:
                convertedTemp = celsiusToFahrenheit(temperature);
                System.out.printf("Converted Temperature: %.2f °F%n", convertedTemp);
                break;
            case 2:
                convertedTemp = celsiusToKelvin(temperature);
                System.out.printf("Converted Temperature: %.2f K%n", convertedTemp);
                break;
            case 3:
                convertedTemp = fahrenheitToCelsius(temperature);
                System.out.printf("Converted Temperature: %.2f °C%n", convertedTemp);
                break;
            case 4:
                convertedTemp = fahrenheitToKelvin(temperature);
                System.out.printf("Converted Temperature: %.2f K%n", convertedTemp);
                break;
            case 5:
                convertedTemp = kelvinToCelsius(temperature);
                System.out.printf("Converted Temperature: %.2f °C%n", convertedTemp);
                break;
            case 6:
                convertedTemp = kelvinToFahrenheit(temperature);
                System.out.printf("Converted Temperature: %.2f °F%n", convertedTemp);
                break;
            default:
                System.out.println("Invalid choice! Please select a valid option.");
        }

        scanner.close();
    }
}
