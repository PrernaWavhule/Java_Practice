import java.util.Scanner;

class LargestSubArray{

    public static boolean largestArray(int[] ar,int size, int k){
        for(int i = 0; i < ar.length-size; i++){
            int sum = 0;
            for(int j = i; j < i+size; j++){
                sum += ar[j];
            }
            if(sum == k){
                for(int j = i; j < i+size; j++){
                    System.out.print(ar[j] + " ");
                }
                System.out.println();
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] ar = new int[n];

        for(int i = 0; i < ar.length; i++){
            ar[i] = scan.nextInt();
        }

        int k = scan.nextInt();

        for(int size = ar.length-1; size >= 0; size--){
            if(largestArray(ar, size, k)){
                break;
            }
        }
        
        scan.close();
    }
}