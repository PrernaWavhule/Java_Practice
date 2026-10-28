import java.util.Scanner;

class Day1_FahrenheitToCelsius{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int fahrenheit = scanner.nextInt();

        // 	(32°F − 32) × 5/9 = 0°C
        float celsius = (fahrenheit - 32) * 5.0f / 9.0f;

        System.out.println("Temperature in Celsius: " + celsius);
    }
}