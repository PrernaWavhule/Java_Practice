import java.util.Scanner;

class PrimeSumOfSubArr{

    public static boolean isPrime(int n){
        if(n <= 1){
            return false;
        }

        for(int i = 2; i*i <= n; i++){
            if(n % i == 0){
                return false;
            }
        }

        return true;
    }

    public static void primeSum(int[] ar, int k){
        for(int i = 0; i < ar.length-k; i++){
            int sum = 0; 
            
            for(int j = i; j < i+k; j++){
                sum += ar[j];
            }

            if(isPrime(sum)){
                System.out.println(sum);
            }
        }
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int[] ar = new int[n];

        for(int i = 0; i < ar.length; i++){
            ar[i] = scan.nextInt();
        }

        int k = scan.nextInt();

        primeSum(ar, k);

        scan.close();
    }
}