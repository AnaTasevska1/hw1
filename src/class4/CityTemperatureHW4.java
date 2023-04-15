package class4;

import java.util.Scanner;

public class CityTemperatureHW4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name of the city");
        String city = scanner.next();

        System.out.println("Enter the temperature in Fahrenheit");
        double temperatureInFahrenheit = scanner.nextDouble();

        double temperatureInCelsius = ((temperatureInFahrenheit - 32) * 5/9);
        System.out.println("The temperature is "+temperatureInCelsius+" and the city is "+city);

    }
}

/*
4)Create a Java program that will ask user to input city and temperature.
Your program should convert Fahrenheit into celsius and print “The temperature is
the city  is ”
 */
