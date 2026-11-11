import java.util.Scanner;

class NumEndingWithZero{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a Number.");
        int n = scan.nextInt();

        if(n % 10 == 0){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }

    }
}