import java.util.Scanner;

class PrintEvenSumSubArr{

    public static void evenSumSubArr(int[] ar, int size){
        for(int i = 0; i < ar.length-size; i++){
            int sum = 0;
            for(int j = i; j < i+size; j++){
                sum += ar[j];
            }
            if(sum % 2 == 0){
                for(int j = i; j < i+size; j++){
                    System.out.print(ar[j] + " ");
                }
                System.out.println();
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

        System.out.println("Enter size:");
        int size = scan.nextInt();

        evenSumSubArr(ar, size);

        scan.close();
    }
}