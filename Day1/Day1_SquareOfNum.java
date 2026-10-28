import java.util.Scanner;

class Day1_SquareOfNum{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();

        int square = num * num;

        System.out.println("Square of the number: " + square);
    }
}