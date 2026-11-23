import java.util.Scanner;

class Practice{

    public static void twiceOccurance(int[] ar){
        int count = 1; 

        for(int i = 0; i < ar.length-1; i++){
            if(ar[i] == ar[i+1]){
                count++;
            }
            else{
                if(count == 2){
                    System.out.println(ar[i] + " ");
                }
                count = 1;
            }
        }
        if(count == 2){
            System.out.println(ar[ar.length-1] + " ");
        }
    }

    public static void evenOccurance(int[] ar){
        int count = 1;

        for(int i = 0; i < ar.length-1; i++){
            if(ar[i] == ar[i+1]){
                count++;
            }
            else{
                if(count % 2 == 0){
                    System.out.println(ar[i] + " ");
                }
                count = 1;
            }
        }
        if(count % 2 == 0){
            System.out.println(ar[ar.length-1] + " ");
        }
    }

    public static void oddOccurance(int[] ar){
        int count = 1;

        for(int i = 0; i < ar.length-1; i++){
            if(ar[i] == ar[i+1]){
                count++;
            }
            else{
                if(count % 2 != 0){
                    System.out.println(ar[i] + " ");
                }
                count = 1;
            }
        }
        if(count % 2 != 0){
            System.out.println(ar[ar.length-1]);
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
            else{

            }
        }

        return true;
    }

    public static void primeOccurance(int[] ar){
        int count = 1;
        for(int i = 0; i < ar.length-1; i++){
            if(ar[i] == ar[i+1]){
                count++;
            }
            else{
                if(isPrime(count)){
                    System.out.println(ar[i] + " ");
                }
                count = 1;
            }
        }
        if(isPrime(count)){
            System.out.println(ar[ar.length-1]);
        }
    }


    public static void uniqueElement(int[] ar){
        int count = 1;

        for(int i = 0; i < ar.length-1; i++){
            if(ar[i] == ar[i+1]){
                count++;
            }
            else{
                if(count == 1){
                    System.out.println(ar[i] + " ");
                }
                count = 1;
            }
        }

        if(count == 1){
            System.out.println(ar[ar.length-1]);
        }
        
    }

    public static void repeatedElement(int[] ar){
        int count = 1;

        for(int i = 0; i < ar.length-1; i++){
            if(ar[i] == ar[i+1]){
                count++;
            }
            else{
                if(count != 1){
                    System.out.println(ar[i] + " ");
                }
                count = 1;
            }
        }

        if(count != 1){
            System.out.println(ar[ar.length-1]);
        }
        
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] ar = new int[n];

        for(int i = 0; i < ar.length; i++){
            ar[i] = scan.nextInt();
        }

        // twiceOccurance(ar);
        // evenOccurance(ar);
        // oddOccurance(ar);
        // primeOccurance(ar);
        // uniqueElement(ar);
        // repeatedElement(ar);

        scan.close();
    }
}