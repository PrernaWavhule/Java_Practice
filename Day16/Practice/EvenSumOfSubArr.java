import java.util.Scanner;

class EvenSumOfSubArr{

    public static void evenSum(int[] ar, int k){
        for(int i = 0; i < ar.length-k; i++){
            int sum = 0;
            for(int j = i; j < i+k; j++){
                sum += ar[j];
            }
            if(sum % 2 == 0){
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

        evenSum(ar, k);

        scan.close();
    } 
}