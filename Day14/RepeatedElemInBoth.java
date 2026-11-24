import java.util.Scanner;

class RepeatedElemInBoth{

    public static void repeatedElem(int[] ar1, int[] ar2){
        int i = 0, j = 0;

        while(i < ar1.length && j < ar2.length){
            if(ar1[i] == ar2[j]){
                System.out.print(ar1[i]  + " ");
                i++;
                j++;
            }
            else if(ar1[i] > ar2[j]){
                j++;
            }
            else{
                i++;
            }
        }
    }

    public static void deceRepeatecElem(int[] ar1, int[] ar2){
        int i = ar1.length-1, j = ar2.length-1;

        while(i >= 0 && j >= 0){
            if(ar1[i] == ar2[j]){
                System.out.println(ar1[i]);
                i--;
                j--;
            }
            else if(ar1[i] > ar2[j]){
                i--;
            }
            else{
                j--;
            }
        }
    }

    public static void firstDesc(int[] ar1, int[] ar2){
        int i = ar1.length-1, j = 0;

        while(i >= 0 && j < ar2.length){
            if(ar1[i] == ar2[j]){
                System.out.println(ar1[i]);
                i--; 
                j++;
            }
            else if(ar1[i] > ar2[j]){
                i--;
            }
            else{
                j++;
            }
        }
    }

    public static void secondDesc(int[] ar1, int[] ar2){
        int i = 0, j = ar2.length-1;

        while(i < ar1.length && j >= 0){
            if(ar1[i] == ar2[j]){
                System.out.println(ar1[i]);
                i++; 
                j--;
            }
            else if(ar1[i] > ar2[j]){
                j--;
            }
            else{
                i++;
            }
        }
    }

    public static void printUnique(int[] ar1, int[] ar2){
        int i = 0, j = 0;

        while(i < ar1.length && j < ar2.length){
            if(ar1[i] == ar2[j]){
                i++;
                j++;
            }
            else if(ar1[i] < ar2[j]){
                System.out.print(ar1[i] + " ");
                i++;
            }
            else{
                System.out.print(ar2[j] + " ");
                j++;
            }
        }

        
        while(i < ar1.length){
            System.out.print(ar1[i] + " ");
            i++;
        }

        while(j < ar2.length){
            System.out.print(ar2[j] + " ");
            j++;
        }
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int n1 = scan.nextInt();
        int[] ar1 = new int[n1];

        for(int i = 0; i < ar1.length; i++){
            ar1[i] = scan.nextInt(); 
        }

        int n2 = scan.nextInt();
        int[] ar2 = new int[n2];

        for(int i = 0; i < ar2.length; i++){
            ar2[i] = scan.nextInt(); 
        }

        // repeatedElem(ar1, ar2);
        // deceRepeatecElem(ar1, ar2);
        // firstDesc(ar1, ar2);
        // secondDesc(ar1, ar2);
        printUnique(ar1, ar2);

        scan.close();
    }
}