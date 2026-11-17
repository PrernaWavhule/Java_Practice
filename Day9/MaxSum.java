import java.util.Scanner;

class MaxSum{

    static int maxSum(int[] ar){
        int m1 = ar[0], m2 = Integer.MIN_VALUE;
        for(int i = 0; i < ar.length; i++){
            if(ar[i] > m1){
                m2 = m1;
                m1 = ar[i];
            }
            else if(ar[i] > m2){
                m2 = ar[i];
            }
        } 

        return m1 + m2;
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] ar = new int[n];

        for(int i = 0; i < ar.length; i++){
            ar[i] = scan.nextInt();
        }

        System.out.println("Maximum Sum is: " + maxSum(ar));

        scan.close();
    }
}