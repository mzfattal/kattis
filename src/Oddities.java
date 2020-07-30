import java.util.Scanner;

public class Oddities {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        for(int i=0;i<n;i++) {
            int cur = in.nextInt();
            if(cur%2==0) {
                System.out.println(cur + " is even");
            } else {
                System.out.println(cur + " is odd");
            }
        }
    }
}
