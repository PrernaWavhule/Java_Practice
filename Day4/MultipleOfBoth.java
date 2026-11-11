import java.util.Scanner;

class MultipleOfBoth{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int a = scan.nextInt();
        int b = scan.nextInt();

        // Multiple Of 2 and 3
        for(int i = 1; i <= n; i++){
            if(i % a == 0 || i % b == 0){
                System.out.println(i);
            }
        }

        scan.close();
    }
}