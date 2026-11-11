import java.util.Scanner;

class EndingWith53{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        if(n % 100 == 53){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}