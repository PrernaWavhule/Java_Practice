import java.util.Scanner;

class Day1_CelsiusToFahrenheit{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int celsius = scanner.nextInt();

        // 	(0°C × 9/5) + 32 = 32°F
        float fahrenheit = (celsius * 9.0f / 5.0f) + 32;

        System.out.println("Temperature in Fahrenheit: " + fahrenheit);
    }
}