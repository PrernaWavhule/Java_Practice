import java.util.Scanner;

class LargestElement{

    static int largestElem(int[] ar){

        int mzx = Integer.MIN_VALUE; // OR ar[0]

        for(int i = 0; i < ar.length; i++){
            if(ar[i] > max){
                max = ar[i];
            }
        }

        return max;
    }


    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        int n = scan.nextInt();
        int[] ar = new int[n];

        for(int i = 0; i < ar.length; i++){
            ar[i] = scan.nextInt();
        }

        System.out.println(largestElem(ar));

        scan.close();
    }
}