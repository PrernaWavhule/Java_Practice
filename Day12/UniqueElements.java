import java.util.Scanner;

class UniqueElements{

    public static void printUnique(int[] ar){
        int count = 1;
        for(int i = 0; i < ar.length-1; i++){
            if(ar[i] == ar[i+1]){
                count++;
            }
            else{
                if(count == 1){
                    System.out.print(ar[i] + " ");
                }
                count = 1;
            }
        }
        if(count == 1){
            System.out.println(ar[ar.length-1]);
        } 
    }

    public static int countOfUnique(int[] ar){
        int count = 1;
        int uniqueCount = 0;
        for(int i = 0; i < ar.length-1; i++){
            if(ar[i] == ar[i+1]){
                count++;
            }
            else{
                if(count == 1){
                    uniqueCount++; 
               }
               count = 1;
            }
        }
        if(count == 1){
            uniqueCount++;
        }
        return uniqueCount;
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] ar = new int[n];

        for(int i = 0; i < ar.length; i++){
            ar[i] = scan.nextInt();
        }

        // printUnique(ar);
        System.out.println(countOfUnique(ar));

        scan.close();
    }
}