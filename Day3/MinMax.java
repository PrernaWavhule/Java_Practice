import java.util.Scanner;

class MinMax{
    public static void main(String[] aegs){
        Scanner scan = new Scanner(System.in);

        int n1 = scan.nextInt();
        int n2 = scan.nextInt();

        System.out.println("MAX : " + (n1 > n2 ? n1 : n2));
        System.out.println("MIN : " + (n1 < n2 ? n1 : n2));
    }
}