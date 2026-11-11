import java.util.Scanner;

class Swap2{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();

        System.out.println("Before Swap");
        System.out.println("a : " + a);
        System.out.println("b : " + b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After Swap");
        System.out.println("a : " + a);
        System.out.println("b : " + b);
        
    }
}