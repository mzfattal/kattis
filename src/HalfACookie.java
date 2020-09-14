import java.util.Scanner;
import java.text.DecimalFormat;

public class HalfACookie {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        DecimalFormat numberFormat = new DecimalFormat("#.000000");

        double r;
        double x;
        double y;

        while(sc.hasNext()) {
            r = sc.nextDouble();
            x = sc.nextDouble();
            y = sc.nextDouble();

            if(x*x+y*y >= r*r) {
                System.out.println("miss");
            } else {

                x = Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
                y = 0;
                double xcirc = x;
                double ycirc = Math.sqrt(Math.pow(r,2) - Math.pow(x,2));

                double ang = Math.atan(ycirc/xcirc);

                double arcArea = Math.pow(r,2) * ang;
                double triArea = xcirc * ycirc;
                double totArea = Math.PI * Math.pow(r,2);

                double first = totArea - arcArea + triArea;
                double second = arcArea-triArea;

                System.out.println(numberFormat.format(first) + " " + numberFormat.format(second));

            }

        }

    }
}
