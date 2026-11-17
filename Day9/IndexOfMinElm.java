import java.util.Scanner;

class IndexOfMinElm{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] ar = new int[n];
        int min = Integer.MAX_VALUE;
        int minIndex = -1;

        for(int i = 0; i < ar.length; i++){
            ar[i] = scan.nextInt();
        }

        for(int i = 0; i < ar.length; i++){
            if(ar[i] < min){
                min = ar[i];
                minIndex = i;
            }
        }

        System.out.println("Min Index Of Min Element is: "+minIndex);
        scan.close();
    }
}