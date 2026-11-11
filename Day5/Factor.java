import java.util.Scanner;

class Factor{

    static void printFactor(int n){
        for(int i = 1; i <= n; i++){
            if(n % i == 0){
                System.out.println(i);
            }
        }
    }
    
    static void countFactor(int n){
        int count = 0;
        for(int i = 1; i <= n; i++){
            if(n % i == 0){
                count++;
            }
        }
        System.out.println(count);
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        // printFactor(n);
        countFactor(n);

        scan.close();
    }
}