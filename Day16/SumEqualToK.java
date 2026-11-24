import java.util.Scanner;

class SumEqualToK{
    public static void sumOfSubArrays(int[] ar, int size, int k){
        int count = 0;
        for(int i = 0; i <= ar.length-size; i++){
            int sum = 0;
            for(int j = i; j < i+size; j++){
                sum += ar[j];
            }
            if(sum == k){
                count++;
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

        int size = scan.nextInt();
        int k = scan.nextInt();

        sumOfSubArrays(ar, size, k);

        scan.close();
    }
}