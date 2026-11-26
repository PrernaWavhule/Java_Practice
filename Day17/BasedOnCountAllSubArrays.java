import java.util.Scanner;

class BasedOnCountAllSubArrays{

    public static void sumOfAll(int[] ar){
        for(int size = 1; size <= ar.length; size++){
            for(int i = 0; i <= ar.length-size; i++){
                int sum = 0;
                for(int j = i; j < i+size; j++){
                    sum += ar[j];
                }
                System.out.println(sum);
            }
        }
    }

    public static void countSum(int[] ar, int k){
        int count = 0; 
        for(int size = 1; size <= ar.length; size++){
            for(int i = 0; i <= ar.length-size; i++){
                int sum = 0;
                for(int j = i; j < i+size; j++){
                    sum += ar[j];
                } 
                if(sum == k){
                    count++;
                }
            }
        }
        System.out.println(count);
    }

    public static void evenCount(int[] ar){
        int count = 0;
        for(int size = 1; size <= ar.length; size++){
            for(int i = 0;  i <= ar.length-size; i++){
                int sum = 0;
                for(int j = i; j < i+size; j++){
                    sum += ar[j];
                }
                if(sum % 2 == 0){
                    count++;
                }
            }
        }
        System.out.println(count);
    }

    public static void OddCount(int[] ar){
        int count = 0;
        for(int size = 1; size <= ar.length; size++){
            for(int i = 0; i <= ar.length-size; i++){
                int sum = 0; 
                for(int j = i;  j < i+size; j++){
                    sum += ar[j];
                }
                if(sum % 2 != 0){
                    count++;
                }
            }
        }
        System.out.println(count);
    }

    public static boolean isPrime(int n){
        if(n <= 1){
            return false;
        }
        for(int i = 2; i*i <= n; i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }

    public static void primeCount(int[] ar){
        int count = 0;
        for(int size = 1; size <= ar.length; size++){
            for(int i = 0; i <= ar.length-size; i++){
                int sum = 0; 
                for(int j = i; j < i+size; j++){
                    sum += ar[j];
                }
                if(isPrime(sum)){
                    count++;
                }
            }
        }
        System.out.println(count);
    }

    public static void sumDivisibleByk(int[] ar, int k){
        int count = 0;
        for(int size = 1; size <= ar.length; size++){
            for(int i = 0; i <= ar.length-size; i++){
                int sum = 0; 
                for(int j = i; j < i+size; j++){
                    sum += ar[j];
                }
                if(sum % k == 0){
                    count++;
                }
            }
        }
        System.out.println(count);
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] ar = new int[n];

        for(int i = 0; i < ar.length; i++){
            ar[i] = scan.nextInt();
        }

        int k = scan.nextInt();

        // System.out.println("Sum of all sub-arrays:");
        // sumOfAll(ar);

        // System.out.println("All sub-arrays whose sum is equal to k:");
        // countSum(ar, k);

        // System.out.println("Count of all sub-arrays whoes sum is even:");
        // evenCount(ar);

        // System.out.println("Count of all sub-arrays whose sum is odd:");
        // OddCount(ar);

        // System.out.println("Count of all sub-arrays whose sum is prime:");
        // primeCount(ar);

        System.out.println("All sub-arrays whoes sum is divisible by "+ k + ":");
        sumDivisibleByk(ar, k);

        scan.close();
    }
}