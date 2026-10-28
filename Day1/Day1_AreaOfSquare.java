import java.util.Scanner;

class Day1_AreaOfSquare{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int side = scanner.nextInt();

        int area = side * side;

        System.out.println("Area of the square: " + area);
    }
}