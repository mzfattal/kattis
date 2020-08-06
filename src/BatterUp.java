import java.util.Scanner;

public class BatterUp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        double result = 0;
        int factor = 0;

        for(int i=0;i<n;i++) {
            int curr = in.nextInt();
            if(curr != -1) {
                result = result + curr;
                factor++;
            }
        }

        double answer = result/factor;


        System.out.print(answer);
    }
}
