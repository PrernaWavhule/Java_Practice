import java.util.Scanner;

class DivisibleBy3Num{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        // Check wether num divisible by 2, 5, and 10.
        if(n % 10 == 0){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }

    }
}