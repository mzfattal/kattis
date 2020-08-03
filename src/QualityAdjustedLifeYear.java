import java.util.Scanner;

public class QualityAdjustedLifeYear {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        double result = 0;

        for(int i=0;i<n;i++) {

            double curP = in.nextDouble();
            double curN = in.nextDouble();

            double x = curP*curN;
            result = result + x;

        }
        System.out.printf("%.2f", result);
    }
}
