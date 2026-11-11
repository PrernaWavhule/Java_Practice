import java.util.Scanner;

class PrintPositive{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        System.out.println(n >= 0 ? n : n * -1);

    }
}