/* 
5
3 4 5 2 1
*/
import java.util.Scanner;

class PracticeSet{

    public static void firsEven(int[] ar){
        for(int i = 0; i < ar.length-1; i++){
            for(int j = i+1; j < ar.length; j++){
                if(ar[i] % 2 == 0){
                    System.out.println(ar[i] + " " + ar[j]);
                }
            }
        }
    }

    public static void secondEven(int[] ar){
        for(int i = 0; i < ar.length-1; i++){
            for(int j = i+1; j < ar.length; j++){
                if(ar[j] % 2 == 0){
                    System.out.println(ar[i] + " " + ar[j]);
                }
            }
        }
    }


    public static void firsOdd(int[] ar){
        for(int i = 0; i < ar.length-1; i++){
            for(int j = i+1; j < ar.length; j++){
                if(ar[i] % 2 != 0){
                    System.out.println(ar[i] + " " + ar[j]);
                }
            }
        }
    }

    public static void secondOdd(int[] ar){
        for(int i = 0; i < ar.length-1; i++){
            for(int j = i+1; j < ar.length; j++){
                if(ar[j] % 2 != 0){
                    System.out.println(ar[i] + " " + ar[j]);
                }
            }
        }
    }

    public static void bothEven(int[] ar){
        for(int i = 0; i < ar.length-1; i++){
            for(int j = i+1; j < ar.length; j++){
                if(ar[i] % 2 == 0 && ar[j] % 2 == 0){
                    System.out.println(ar[i] + " " + ar[j]);
                }
            }
        }
    }

    public static void bothOdd(int[] ar){
        for(int i = 0; i < ar.length-1; i++){
            for(int j = i+1; j < ar.length; j++){
                if(ar[i] % 2 != 0 && ar[j] % 2 != 0){
                    System.out.println(ar[i] + " " + ar[j]);
                }
            }
        }
    }

    public static void sumEven(int[] ar){
        for(int i = 0; i < ar.length-1; i++){
            for(int j = i+1; j < ar.length; j++){
                if((ar[i] + ar[j]) % 2 == 0){
                    System.out.println(ar[i] + " " + ar[j]);
                }
            }
        }
    }

    public static void sumOdd(int[] ar){
        for(int i = 0; i < ar.length-1; i++){
            for(int j = i+1; j < ar.length; j++){
                if((ar[i] + ar[j]) % 2 != 0){
                    System.out.println(ar[i] + " " + ar[j]);
                }
            }
        }
    }

    public static void firstEvenSecondOdd(int[] ar){
        for(int i = 0; i < ar.length-1; i++){
            for(int j = i+1; j < ar.length; j++){
                if(ar[i] % 2 == 0 && ar[j] % 2 != 0){
                    System.out.println(ar[i] + " " + ar[j]);
                }
            }
        }
    }

    public static void firstOddSecondEven(int[] ar){
        for(int i = 0; i < ar.length-1; i++){
            for(int j = i+1; j < ar.length; j++){
                if(ar[i] % 2 != 0 && ar[j] % 2 == 0){
                    System.out.println(ar[i] + " " + ar[j]);
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

    public static void firstPrime(int[] ar){
        for(int i = 0; i < ar.length-1; i++){
            for(int j = i+1; j < ar.length; j++){
                if(isPrime(ar[i])){
                    System.out.println(ar[i] + " " + ar[j]);
                }
            }
        }
    }

    public static void secondPrime(int[] ar){
        for(int i = 0; i < ar.length-1; i++){
            for(int j = i+1; j < ar.length; j++){
                if(isPrime(ar[j])){
                    System.out.println(ar[i] + " " + ar[j]);
                }
            }
        }
    }

    public static void sumPrime(int[] ar){
        for(int i = 0; i < ar.length-1; i++){
            for(int j = i+1; j < ar.length; j++){
                if(isPrime(ar[i] + ar[j])){
                    System.out.println(ar[i] + " " + ar[j]);
                }
            }
        }
    }

    public static void sumNotPrime(int[] ar){
        for(int i = 0; i < ar.length-1; i++){
            for(int j = i+1; j < ar.length; j++){
                if(!isPrime(ar[i] + ar[j])){
                    System.out.println(ar[i] + " " + ar[j]);
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

        // firsEven(ar);
        // secondEven(ar);
        // firsOdd(ar);
        // secondOdd(ar);
        // bothEven(ar);
        // bothOdd(ar);
        // sumEven(ar);
        // sumOdd(ar);
        // firstEvenSecondOdd(ar);
        // firstOddSecondEven(ar);
        // firstPrime(ar);
        // secondPrime(ar);
        // sumPrime(ar);
        sumNotPrime(ar);

        scan.close();
    }
}