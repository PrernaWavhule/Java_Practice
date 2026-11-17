import java.util.Scanner;

class IndexOfLargestElm{

    static int largestElem(int a[]){
        int max = Integer.MIN_VALUE;
        int maxIndex = -1;

        for(int i = 0; i < a.length; i++){
            if(a[i] > max){
                max = a[i];
                maxIndex = i;
            }
        }

        return maxIndex;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];
        

        for(int i = 0; i < a.length; i++){
            a[i] = scan.nextInt();
        }

        System.out.println(largestElem(a));

        scan.close();
    }
}