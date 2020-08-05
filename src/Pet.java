import java.util.Scanner;

public class Pet {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int bestScore = 0;
        int bestUser = 0;

        for(int j=1;j<=5;j++) {
            int userSum = 0;
            for(int i=0; i<4;i++) {
                userSum = userSum + in.nextInt();
            }
            if(userSum > bestScore) {
                bestScore = userSum;
                bestUser = j;
            }
        }
        System.out.print(bestUser+" "+bestScore);
    }
}
