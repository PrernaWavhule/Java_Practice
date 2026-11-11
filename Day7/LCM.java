import java.util.Scanner;

class LCM{

    static int printGcd(int n1, int n2){
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

    static int printLcm(int n1, int n2){
        return n1 * n2 / printGcd(n1, n2);
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int n1 = scan.nextInt();
        int n2 = scan.nextInt();

        System.out.println(printLcm(n1, n2));

        scan.close();
    }
}