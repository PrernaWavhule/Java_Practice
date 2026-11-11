import java.util.Scanner;

class CommonFactors{

    static void commonFactors(int n1, int n2){
        int min = n1 < n2 ? n1 : n2;

        for(int i = 1; i <= min; i++){
            if(n1 % i == 0 && n2 % i == 0){
                System.out.print(i + " ");
            }
        }
    }

    static void revCommonFact(int n1, int n2){
        int min = n1 < n2 ? n1 : n2;

        for(int i = min; i >= 1; i--){
            if(n1 % i == 0 && n2 % i == 0){
                System.out.print(i +  " ");
            }
        }
    }

    static void gcd(int n1, int n2){
        int min = n1 < n2 ? n1 : n2;

        for(int i = min; i >= 1; i--){
            if(n1 % i == 0 && n2 % i == 0){
                System.out.println(i);
                break;
            }
        }        
    }

    static int euclideanGcd(int n1, int n2){
        while(n1 != n2){
            if(n1 > n2){
                n1 = n1 - n2;
            }
            else{
                n2 = n2 - n1;
            }
        }
        return n1;
    }

    static int euclideanGcd2(int n1, int n2){
        while(n1 != 0 && n2 != 0){
            if(n1 > n2){
                n1 = n1 % n2;
            }
            else{
                n2 = n2 % n1;
            }
        }
        int res = n1 != 0 ? n1 : n2;
        return res;
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int n1 = scan.nextInt();
        int n2 = scan.nextInt();

        // commonFactors(n1, n2);
        // revCommonFact(n1, n2);
        // gcd(n1, n2);
        // System.out.print(euclideanGcd(n1, n2));
        System.out.print(euclideanGcd2(n1, n2));

        scan.close();
    }
}