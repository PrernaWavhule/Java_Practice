import java.util.Scanner;

class PrintPrimeSumSubArr{

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

    public static void primeSumSubArr(int[] ar, int size){
        for(int i = 0; i < ar.length-size; i++){
            int sum = 0; 
            for(int j = i; j < i+size; j++){
                sum += ar[j];
            }
            if(isPrime(sum)){
                for(int j = i; j < i+size; j++){
                    System.out.print(ar[j] + " ");
                }
                System.out.println();
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

        int size = scan.nextInt();

        primeSumSubArr(ar, size);

        scan.close();
    }
}