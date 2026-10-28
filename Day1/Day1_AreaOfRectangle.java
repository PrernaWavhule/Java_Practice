import java.util.Scanner;

class Day1_AreaOfRectangle{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = scanner.nextInt();
        int breadth = scanner.nextInt();

        int area = length * breadth;

        System.out.println("Area of the rectangle: " + area);
    }
}