import java.util.Scanner;

class ForLoop{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        
        for(float i = 1; i <= n; i++){
            System.out.println(i);
        }
    }
}