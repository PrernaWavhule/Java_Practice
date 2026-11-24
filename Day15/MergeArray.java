import java.util.Scanner;

class MergeArray{
    public static int[] meargeArray(int[] a1, int[] a2, int[] a3){
        int[] res = new int[a1.length + a2.length + a3.length];
        int i = 0, k = 0;
        while(k < res.length){
            if(i < a1.length){
                res[k++] = a1[i];
            }
            if(i < a2.length){
                res[k++] = a2[i];
            }
            if(i < a3.length){
                res[k++] = a3[i];
            }
            i++;
        }

        return res;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int n1 = scan.nextInt();
        int[] a1 = new int[n1];

        for(int i = 0; i < a1.length; i++){
            a1[i] = scan.nextInt();
        }

        int n2 = scan.nextInt();
        int[] a2 = new int[n2];

        for(int i = 0; i < a2.length; i++){
            a2[i] = scan.nextInt();
        }

        int n3 = scan.nextInt();
        int[] a3 = new int[n3];

        for(int i = 0; i < a3.length; i++){
            a3[i] = scan.nextInt();
        }

        int[] res = meargeArray(a1, a2, a3);

        for(int i = 0; i < res.length; i++){
            System.out.print(res[i] + " ");
        }

        scan.close();
    }
}