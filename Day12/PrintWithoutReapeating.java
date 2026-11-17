import java.util.Scanner;

class PrintWithoutReapeating{

    public static void printElem(int[] ar){
        for(int i = 0; i < ar.length-1; i++){
            if(ar[i] != ar[i+1]){
                System.out.print(ar[i] + " ");
            }
        }
        System.out.print(ar[ar.length-1]);   
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] ar = new int[n];

        for(int i = 0; i < ar.length; i++){
            ar[i] = scan.nextInt();
        }

        printElem(ar);
        
        scan.close();
    }
}