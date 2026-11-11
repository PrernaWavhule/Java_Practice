import java.util.Scanner;

class EvenNum{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        for(int i = 2; i <= n; i++, i++){
            System.out.println(i);
        }

        scan.close();
    }
}