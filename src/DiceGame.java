import java.util.Scanner;

public class DiceGame {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a1G = in.nextInt();
        int b1G = in.nextInt();
        int a2G = in.nextInt();
        int b2G = in.nextInt();

        in.nextLine();

        int a1E = in.nextInt();
        int b1E = in.nextInt();
        int a2E = in.nextInt();
        int b2E = in.nextInt();

        double finalG = a1G + b1G + a2G + b2G;
        double finalE = a1E + b1E + a2E + b2E;

        if(finalG > finalE) {
            System.out.println("Gunnar");
        }

        if(finalE == finalG) {
            System.out.println("Tie");
        }

        if(finalG < finalE) {
            System.out.println("Emma");
        }
    }
}