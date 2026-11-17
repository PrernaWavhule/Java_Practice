import java.util.Scanner;

class OccuranceOfK{

    static int noOfOccurance(int[] ar, int k){
        int count = 0;
        for(int i = 0; i < ar.length; i++){
            if(ar[i] == k){
                count++;
            }
        }
        return count;
    }
    
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] ar = new int[n];

        for(int i = 0; i < ar.length; i++){
            ar[i] = scan.nextInt();
        }

        System.out.print("Enter K Value: ");
        int k = scan.nextInt();

        int res = noOfOccurance(ar, k);

        System.out.println("The Occurance of "+ k + " is: "+ res);
        scan.close();
    }
}