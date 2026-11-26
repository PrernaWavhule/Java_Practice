import java.util.Scanner;

class PrintSubArraysInDifferentVariations{

    public static void printAllSubArrays(int[] ar){
        for(int size = 1; size <= ar.length; size++){
            for(int i = 0; i <= ar.length-size; i++){
                for(int j = i; j < i+size; j++){
                    System.out.print(ar[j]+ " ");
                }
                System.out.println();
            }
        }
    }

    public static void printAllSubArrRev(int[] ar){
        for(int size = ar.length; size > 0; size--){
            for(int i = 0; i <= ar.length-size; i++){
                for(int j = i; j < i+size; j++){
                    System.out.print(ar[j] + " ");
                }
                System.out.println();
            }
        }
    }

    public static void sumEqualToK(int[] ar, int k){
        for(int size = 1; size <= ar.length; size++){
            for(int i = 0; i <= ar.length-size; i++){
                int sum = 0;
                for(int j = i; j < i+size; j++){
                    sum += ar[j];
                }
                if(sum == k){
                    for(int j = i; j < i+size; j++){
                        System.out.print(ar[j] + " ");
                    }
                    System.out.println();
                }
            }
        }
    }

    public static void evenSum(int[] ar){
        for(int size = 1; size <= ar.length; size++){
            for(int i = 0; i <= ar.length-size; i++){
                int sum = 0;
                for(int j = i; j < i+size; j++){
                    sum += ar[j];
                }
                if(sum % 2 == 0){
                    for(int j = i; j < i+size; j++){
                        System.out.print(ar[j] + " ");
                    }
                    System.out.println();
                }
            }
        }
    }

    public static void oddSum(int[] ar){
        for(int size = 1; size <= ar.length; size++){
            for(int i = 0; i <= ar.length-size; i++){
                int sum = 0;
                for(int j = i; j < i+size; j++){
                    sum += ar[j];
                }
                if(sum % 2 != 0){
                    for(int j = i; j < i+size; j++){
                        System.out.print(ar[j] + " ");
                    }
                    System.out.println();
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

    public static void primeSum(int[] ar){
        for(int size = 1; size <= ar.length; size++){
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
    }

    public static void divisibleByKSum(int[] ar, int k){
        for(int size = 1; size <= ar.length; size++){
            for(int i = 0; i <= ar.length-size; i++){
                int sum = 0; 
                for(int j = i; j < i+size; j++){
                    sum += ar[j];
                }
                if(sum % k == 0){
                    for(int j = i; j < i+size; j++){
                        System.out.print(ar[j] + " ");
                    }
                    System.out.println();
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

        int k = scan.nextInt();

        // System.out.println("All sub-arrays:");
        // printAllSubArrays(ar);

        // System.out.println("All sub-arrays is reverse order:");
        // printAllSubArrRev(ar);

        // System.out.println("All sub-arrays whose sum equals to " + k + ":");
        // sumEqualToK(ar, k);

        // System.out.println("All sub-arrays whose sum is even:");
        // evenSum(ar);

        // System.out.println("All sub-arrays whoes sum is odd:");
        // oddSum(ar);

        // System.out.println("All sub-arrays whoes sum is prime:");
        // primeSum(ar);

        System.out.println("All sub-arrays whose sum is divisible by " + k + ":");
        divisibleByKSum(ar, k);

        scan.close();
    }
}