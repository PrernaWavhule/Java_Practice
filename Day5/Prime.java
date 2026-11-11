import java.util.Scanner;

class Prime{

    static String printPrime1(int n){
        int count = 0;

        for(int i = 1; i <= n; i++){
            if(n % i == 0){
                count++;
            }
        }
        if(count == 2){
            return "Prime";
        }

        return "Not Prime";
    }

    static String printPrime2(int n){
        int count = 0;

        for(int i = 2; i <= n/2; i++){
            if(n % i == 0){
                count++;
            }
        }
        if(count == 0){
            return "Prime";
        }

        return "Not Prime";
    }

    static String printPrime3(int n){
        for(int i = 2; i <= n/2; i++){
            if(n % i == 0){
                return "Not Prime";
            }
        }
        return "Prime";
    }

    static String printPrime4(int n){
        // Non prime num: first factor is less than or equal to root n
        for(int i = 2; i*i <= n; i++){
            if(n % i == 0){
                return "Not Prime";
            }
        }
        return "Prime";
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        // System.out.println(printPrime1(n));
        // System.out.println(printPrime2(n));
        // System.out.println(printPrime3(n));
        System.out.println(printPrime4(n));

        scan.close();
    }
}