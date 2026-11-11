import java.util.Scanner;

class CommonMultiples{

    static void multiplesOfN(int n, int a){
        for(int i = 1; i <= n; i++){
            if(i % a == 0){
                System.out.println(i);
            }
        }
    }

    static void commonMultiples(int n, int a, int b){
        for(int i = 1; i <= n; i++){
            if(i % a == 0 && i % b == 0){
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int a = scan.nextInt();
        int b = scan.nextInt();

        // multiplesOfN(n, a);
        commonMultiples(n, a, b);

        scan.close();
    }
}