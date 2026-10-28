import java.util.Scanner;

class Day1_AreaOfTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double base = scanner.nextDouble();
        double height = scanner.nextDouble();

        // Calculate the area of the triangle
        double area = (base * height) / 2;

        // Print the area
        System.out.println("The area of the triangle is: " + area);
    }
}