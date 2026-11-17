import java.util.Scanner;

class MinProduct{

    static long minProduct(int[] ar){
        int firstLargest = ar[0], secondLargest = Integer.MIN_VALUE;
        int firstSmallest = Integer.MAX_VALUE, secondSmallest = Integer.MAX_VALUE;

        
        for(int i = 0; i < ar.length; i++){
            if(ar[i] > firstLargest){
                secondLargest = firstLargest;
                firstLargest = ar[i];
            }
            else if(ar[i] > secondLargest){
                secondLargest = ar[i];
            }
        } 

        for(int i = 0; i < ar.length; i++){
            if(ar[i] < firstSmallest){
                secondSmallest = firstSmallest;
                firstSmallest = ar[i];
            }
            else if(ar[i] < secondSmallest){
                secondSmallest = ar[i];
            }
        } 

        long p1 = (long)firstLargest * secondLargest;
        long p2 = (long)firstSmallest * secondSmallest;
        long p3 = (long)firstSmallest * firstLargest;

        long res1 = p1 < p2 ? p1 : p2;
        long res2 = res1 < p3 ? res1 : p3;

        return res2;
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] ar = new int[n];

        for(int i = 0; i < ar.length; i++){
            ar[i] = scan.nextInt();
        }

        System.out.println("Minimum Product is: " + minProduct(ar));

        scan.close();
    }
}