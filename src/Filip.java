import java.util.Scanner;

public class Filip {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int revA = 0;
        int revB = 0;

        while(a != 0)
            {
                revA = revA * 10;
                revA = revA + a%10;
                a = a/10;
            }
        while(b != 0)
        {
            revB = revB * 10;
            revB = revB + b%10;
            b = b/10;
        }

        if(revA > revB) {
            System.out.print(revA);
        } else {
            System.out.print(revB);
        }

    }
}
