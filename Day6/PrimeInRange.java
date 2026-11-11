import java.util.Scanner;

class PrimeInRange{

    static boolean isPrime(int n){
        for(int i = 2; i*i <= n; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }

    static void primeInRange(int a, int b){
        for(int i = a; i <= b; i++){
            if(isPrime(i)){
                System.out.println(i);
            }
        }
    }

    static void firstNPrime(int n){
        int count = 0;
        for(int i = 2; count < n; i++){
            if (isPrime(i)){
                System.out.println(i);
                count++;
            }
        }
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        // int a = scan.nextInt();
        // int b = scan.nextInt();

        // primeInRange(a, b);

        int n = scan.nextInt();
        firstNPrime(n);

        scan.close();
    }
}