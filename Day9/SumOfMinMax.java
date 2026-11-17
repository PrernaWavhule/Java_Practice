import java.util.Scanner;

class SumOfMinMax{

    static int sum(int[] ar){
        int sum = 0;
        for(int i = 0; i < ar.length; i++){
            sum += ar[i];
        }
        return sum;
    }

    static int max(int[] ar){
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < ar.length; i++){
            if(ar[i] > max){
                max = ar[i];
            }
        }
        return max;
    }

    static int min(int[] ar){
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < ar.length; i++){
            if(ar[i] < min){
                min = ar[i];
            }
        }
        return min;
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] ar = new int[n];

        for(int i = 0; i < ar.length; i++){
            ar[i] = scan.nextInt();
        }

        int sum = sum(ar);
        int max = max(ar);
        int min = min(ar);

        System.out.println(sum-max);
        System.out.println(sum-min);

        scan.close();
    }
}