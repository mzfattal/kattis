import java.util.HashSet;
import java.util.Scanner;

public class AlmostPerfect {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        while (in.hasNext()) {

            long num = in.nextLong();
            double max = Math.ceil(Math.sqrt((double)num));
            HashSet<Long> factors = new HashSet<>();

            for (long i = 2; i <= max; i++) {
                if (num % i == 0) {
                    factors.add(i);
                    factors.add(num / i);
                }
            }

            long total = 1;
            for (Long factor : factors) {
                total += factor;
            }

            if (total == num) {
                System.out.println(num + " perfect");
            } else if (Math.abs(total - num) <= 2) {
                System.out.println(num + " almost perfect");
            } else {
                System.out.println(num + " not perfect");
            }
        }
    }
}
