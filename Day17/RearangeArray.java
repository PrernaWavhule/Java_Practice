import java.util.Scanner;

class RearangeArray{

    public static void rearangeArr(int[] ar){
        int i = 0, j = 0;

        while(i < ar.length){
            if(ar[i] == 0){
                i++;
            }
            else{
                ar[j++] = ar[i++];
            }
        }

        while(j < ar.length){
            ar[j++] = 0;
        }
    }

    public static void rearangeArrRev(int[] ar){
        int i = ar.length-1, j = ar.length-1;

        while(i >= 0){
            if(ar[i] == -1){
                i--;
            }
            else{
                ar[j--] = ar[i--];
            }
        }

        while(j >= 0){
            ar[j--] = -1;
        }
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] ar = new int[n];

        for(int i = 0; i < ar.length; i++){
            ar[i] = scan.nextInt();
        }

        // rearangeArr(ar);
        rearangeArrRev(ar);

        for(int i = 0; i < ar.length; i++){
            System.out.print(ar[i] + " ");
        }

        scan.close();
    }
}