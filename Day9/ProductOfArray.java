import java.util.Scanner;

class ProductOfArray{

    static int product(int[] ar){
        int p = 1;
        for(int i = 0; i < ar.length; i++){
            p = p * ar[i];    
        }
        return p;
    }

    static int[] resArr(int[] ar){
        int p = product(ar);
        int[] res = new int[ar.length];
        for(int i = 0; i < ar.length; i++){
            res[i] = p/ar[i];
        }
        return res;
    }


    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int[] ar = new int[n];

        for(int i = 0; i < ar.length; i++){
            ar[i] =  scan.nextInt();
        }

        int[] res = resArr(ar);

        for(int i = 0; i < res.length; i++){
            System.out.print(res[i] + " ");
        }

        scan.close();
    }
}