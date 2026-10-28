import java.util.Scanner;

class Day1_ProductOfTwoNum{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        int product = num1 * num2;

        System.out.println("Product of the two numbers: " + product);
    }
}