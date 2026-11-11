import java.util.Scanner;

class DigitManipulation{

    static int countDigit(int n){
        int count = 0;
        while(n != 0){
            n = n / 10;
            count++;
        }
        return count;
    }

    static int sumOfDigits(int n){
        int sum = 0;
        while(n != 0){
            int rem = n % 10;
            sum += rem; 
            n = n / 10;
        }
        return sum;
    }

    static int revDidit(int n){
        int rev = 0;
        while(n != 0){
            int last = n % 10;
            rev = rev * 10 + last;
            n = n / 10;
        }
        return rev;
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        // System.out.println(countDigit(n));
        // System.out.println(sumOfDigits(n));
        System.out.println(revDidit(n));

        scan.close();
    }
}