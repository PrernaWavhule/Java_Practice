import java.util.Scanner;

class SumDivisibleByK{
    
    public static void divisibleByK(int[] ar, int k){
        for(int i = 0; i < ar.length-k; i++){
            int sum = 0; 
            for(int j = i; j < i+k; j++){
                sum += ar[j];
            }
            if(sum % k == 0){
                System.out.println(sum);
            }
        }
    }

    public static void divisibleBy2and3(int[] ar, int k){
        for(int i = 0; i < ar.length-k; i++){
            int sum = 0; 
            for(int j = i; j < i+k; j++){
                sum += ar[j];
            }
            if(sum % 2 == 0 && sum % 3 == 0){
                System.out.println(sum);
            }
        }
    }

    public static void divisibleBy3(int[] ar, int k){
        for(int i = 0; i < ar.length-k; i++){
            int sum = 0; 
            for(int j = i; j < i+k; j++){
                sum += ar[j];
            }
            if(sum % 3 == 0){
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

        // divisibleByK(ar, k);
        // divisibleBy2and3(ar, k);
        // divisibleBy3(ar, k);

        scan.close();
    }
}