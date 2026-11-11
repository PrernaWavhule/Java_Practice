import java.util.Scanner;

class DivisibleByBothNum{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a num");
        int n = scan.nextInt();

        if(n % 2 == 0 && n % 3 == 0){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}