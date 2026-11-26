import java.util.Scanner;

class LongestSubArray{

    public static void longestSubArr(int[] ar, int k){
        for(int size = ar.length; size >= 1; size--){
            for(int i = 0; i <= ar.length-size; i++){
                int sum = 0;
                for(int j = i; j < i+size; j++){
                    sum += ar[j];
                }
                if(sum == k){
                    for(int j = i; j < i+size; j++){
                        System.out.print(ar[j] + " ");
                    }
                    return;
                }
            }
        }
    }

    public static void longestEvenSubArray(int[] ar){
        for(int size = ar.length; size >= 1; size--){
            for(int i = 0; i <= ar.length-size; i++){
                int sum = 0;
                for(int j = i; j < i+size; j++){
                    sum += ar[j];
                }
                if(sum % 2 == 0){
                    for(int j = i; j < i+size; j++){
                        System.out.print(ar[j] + " ");
                    }
                    return;
                }
            }
        }
    }

    public static void longestOddSubArray(int[] ar){
        for(int size = ar.length; size >= 1; size--){
            for(int i = 0; i <= ar.length-size; i++){
                int sum = 0;
                for(int j = i; j < i+size; j++){
                    sum += ar[j];
                }
                if(sum % 2 != 0){
                    for(int j = i; j < i+size; j++){
                        System.out.print(ar[j] + " ");
                    }
                    return;
                }
            }
        }
    }

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

    public static void longestPrimeSubArray(int[] ar){
        for(int size = ar.length; size >= 1; size--){
            for(int i = 0; i <= ar.length-size; i++){
                int sum = 0;
                for(int j = i; j < i+size; j++){
                    sum += ar[j];
                }
                if(isPrime(sum)){
                    for(int j = i; j < i+size; j++){
                        System.out.print(ar[j] + " ");
                    }
                    return;
                }
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

        // int k = scan.nextInt();

        // System.out.println("Longest sub-array whose sum is equal to " + k +":");
        // longestSubArr(ar, k);

        // System.out.println("Longest sub-array whose sum is even:");
        // longestEvenSubArray(ar);

        // System.out.println("Longest sub-array whose sum is odd:");
        // longestOddSubArray(ar);

        System.out.println("Longest sub-array whose sum is prime:");
        longestPrimeSubArray(ar);

        scan.close();
    }
}