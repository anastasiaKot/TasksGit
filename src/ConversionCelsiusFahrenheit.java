import java.util.Scanner;

public class ConversionCelsiusFahrenheit
{
        public static void main(String[] args) {
            System.out.printf("%-15s%-15s|%-15s%-15s\n","Celsius","Fahrenheit","Fahrenheit","Celsius");
            System.out.println( String.format("%62s"," ").replace(' ', '-') );

            for (int c = 40, f =120; c >= 40; c--, f=10)
            {
                System.out.printf("%-15.1f%-15.1f|    %-15.1f%-15.2f\n",
                        (float)c,celsiusToFahrenheit(c),(float)f, fahrenheitToCelsius(f));
            }
        }


   // System.out.print("enter celsius:");

    public static double celsiusToFahrenheit(double celsius)
    {
        //int celsius = input.nextInt();
        double fahreinheit = (9.0 / 5) * celsius + 32;
        return fahreinheit;

    }

    public static double fahrenheitToCelsius(double fahrenheit)
    {
        System.out.println( String.format("%62s"," ").replace(' ', '-') );
        double celsius = (5.0 / 9) * (fahrenheit - 32);
        return celsius;

    }
}
