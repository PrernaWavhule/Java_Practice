import java.util.Scanner;

class Pairs{

    static void printAllPairs(int[] ar){

        for(int i = 0; i < ar.length-1; i++){
            for(int j = i+1; j < ar.length; j++){
                System.out.println(ar[i]+","+ar[j] + " ");
            }
        }

    }

    static void sumEqualsKPairs(int[] ar, int k){
        for(int i = 0; i < ar.length-1; i++){
            for(int j = i+1; j < ar.length; j++){
                if(ar[i] + ar[j] == k){
                    System.out.println(ar[i]+","+ar[j] + " ");
                }
            }
        }
    }

    static void diffEqualsKPairs(int[] ar, int k){
        for(int i = 0; i < ar.length-1; i++){
            for(int j = i+1; j < ar.length; j++){
                if(ar[i] - ar[j] == k || ar[j] - ar[i] == k){
                    System.out.println(ar[i]+","+ar[j] + " ");
                }
            }
        }
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] ar = new int[n];

        for(int i = 0; i < ar.length; i++){
            ar[i] = scan.nextInt();
        }

        // printAllPairs(ar);

        int k = scan.nextInt();
        // sumEqualsKPairs(ar, k);
        diffEqualsKPairs(ar, k);

        scan.close();
    }
}