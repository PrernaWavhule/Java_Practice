import java.util.Scanner;

class Day1_SumOfNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int sum1 = a + b;
        int sum2 = a + c;
        int sum3 = b + c;



        System.out.println(sum1);
        System.out.println(sum2);
        System.out.println(sum3);
    }
}