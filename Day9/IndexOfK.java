import java.util.Scanner;

class IndexOfK{

    static int indexOfK(int[] ar, int k){
        for(int i = 0; i < ar.length; i++){
            if(ar[i] == k){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] ar = new int[n];

        for(int i = 0; i < ar.length; i++){
            ar[i] = scan.nextInt();
        }

        System.out.println("Enter the value ok K: ");
        int k = scan.nextInt();

        int res = indexOfK(ar, k);

        System.out.println("The index of k is: "+ res);

        scan.close();
    }
}