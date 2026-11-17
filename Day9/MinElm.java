import java.util.Scanner;

class MinElm{


    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] ar = new int[n]; 
        int min = Integer.MAX_VALUE;

        for(int i = 0; i < ar.length; i++){
            ar[i] = scan.nextInt();
        }


        for(int i = 0; i < ar.length; i++){
            if(ar[i] < min){
                min = ar[i];
            }
        }

        System.out.println(min);
        
        scan.close();
    }
}