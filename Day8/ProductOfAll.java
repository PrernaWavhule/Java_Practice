import java.util.Scanner;

class ProductOfAll{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int[] ar = new int[n];
        long product = 1;

        for(int i = 0; i < ar.length; i++){
            ar[i] = scan.nextInt();
        }

        for(int i = 0; i < ar.length; i++){
            product = product * ar[i];
        }

        System.out.println(product);

        scan.close();
    }
}