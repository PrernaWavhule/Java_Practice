import java.util.Scanner;

class MaxAmong4{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int n1 = scan.nextInt();
        int n2 = scan.nextInt();
        int n3 = scan.nextInt();
        int n4 = scan.nextInt();

        int max1 = n1 > n2 ? n1 : n2;
        int max2 = n3 > n4 ? n3 : n4;

        System.out.println("MAX : " + (max1 > max2 ? max1 : max2));
    }
}