import java.util.Scanner;

class Day1_CubeOfNum{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();

        int cube = num * num * num;

        System.out.println("Cube of the number: " + cube);
    }
}
