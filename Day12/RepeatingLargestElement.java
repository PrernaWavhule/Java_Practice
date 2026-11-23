import java.util.Scanner;
import java.util.Arrays;

class RepeatingLargestElement{

    public static int repeatingLargest(int[] ar){
        int temp = ar[0];
        for(int i = 0; i < ar.length-1; i++){
            if(ar[i] == ar[i+1]){
                if(ar[i] > temp){
                    temp = ar[i];
                }
            }
        }
        return temp;
    }


    public static int sirApproachFirst(int[] ar){

        for(int i = ar.length-2; i >= 0; i--){
            if(ar[i] == ar[i+1]){
                return ar[i];
            }
        }
        return -1;
    }

    public static int sirApproachSecond(int[] ar){

        for(int i = ar.length-1; i >= 1; i--){
            if(ar[i] == ar[i-1]){
                return ar[i];
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

        Arrays.sort(ar);
        // System.out.println(repeatingLargest(ar));
        // System.out.println(sirApproachFirst(ar));
        System.out.println(sirApproachSecond(ar));

        
        scan.close();
    }
}