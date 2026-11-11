import java.util.Scanner;

class TwoDigitNum{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        if(n >= 10 && n <= 99){
            System.out.println(n + ": Two Digit Number!");
        }
        else{
            System.out.println(n +": Not a Two Digit Number!");
        }
    }
}