import java.util.Scanner;

public class R2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int r = in.nextInt();
        int s = in.nextInt()*2-r;

        System.out.print(s);

    }
}
