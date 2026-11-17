import java.util.Scanner;

class SecondLargestElm{

    static int secondLarge(int[] ar){
        int p = ar[0], vp = Integer.MIN_VALUE;

        for(int i = 0; i < ar.length; i++){
            if(ar[i] > p){
                vp = p;
                p = ar[i];
            }else if(ar[i] > vp && ar[i] != p){
                vp = ar[i];
            }
        }
        return vp;
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] ar = new int[n];

        for(int i = 0; i < ar.length; i++){
            ar[i] = scan.nextInt();
        }

        System.out.println(secondLarge(ar));

        scan.close();
    }
}