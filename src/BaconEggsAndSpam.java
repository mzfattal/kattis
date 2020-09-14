import java.util.Map.Entry;
import java.util.Scanner;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;


public class BaconEggsAndSpam {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int cus = 0;
        do {
            cus = Integer.parseInt(input.nextLine());
            SortedMap<String, TreeSet<String>> orders = new TreeMap<String, TreeSet<String>>();
            for (int i = 0; i < cus; i++) {
                String[] order = input.nextLine().split(" ");
                for (int j = 1; j < order.length; j++) {
                    if (orders.get(order[j]) == null) {
                        TreeSet<String> set = new TreeSet<String>();
                        set.add(order[0]);
                        orders.put(order[j], set);
                    } else {
                        orders.get(order[j]).add(order[0]);
                    }
                }
            }
            for (Entry<String, TreeSet<String>> foods : orders.entrySet()) {
                System.out.print(foods.getKey());
                for (String person : foods.getValue()) {
                    System.out.print(" " + person);
                }
                System.out.println("");
            }
            System.out.println("");
        } while (cus != 0);

    }

}
