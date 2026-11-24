import java.util.Scanner;

class MergeSortedArray{

    public static int[] meargeArray(int[] ar1, int[] ar2){
        int[] res = new int[ar1.length + ar2.length]; 
        int i = 0, j = 0, k = 0;

        while(i < ar1.length && j < ar2.length){
            if(ar1[i] <= ar2[j]){
                res[k] = ar1[i];
                i++;
                k++;
            }
            else {
                res[k] = ar2[j];
                k++;
                j++;
            }
        }

        while(i < ar1.length){
            res[k] = ar1[i];
                i++;
                k++;
        }

        while(j < ar2.length){
            res[k] = ar2[j];
                k++;
                j++;
        }
        return res;
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        int n1 = scan.nextInt();
        int[] ar1 = new int[n1];

        for(int i = 0; i < ar1.length; i++){
            ar1[i] = scan.nextInt();
        }

        int n2 = scan.nextInt();
        int[] ar2 = new int[n2];

        for(int i = 0; i < ar2.length; i++){
            ar2[i] = scan.nextInt();
        }

        int[] res = meargeArray(ar1, ar2);

        for(int i = 0; i < res.length; i++){
            System.out.print(res[i] + " ");
        }

        scan.close();
    }
}