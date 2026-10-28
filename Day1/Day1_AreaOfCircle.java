import java.util.Scanner;

class Day1_AreaOfCircle{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double radius = scanner.nextDouble();
        double pi = 3.14;

        double area = pi * radius * radius;

        System.out.println("Area of the circle: " + area);
    }
}