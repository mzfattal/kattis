import java.util.Scanner;

public class SimonSays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        in.nextLine();
        for(int i=0;i<n;i++) {
            String word = in.nextLine();
            if(word.startsWith("Simon says")) {
                System.out.println(word.substring(10));
            }
        }

    }
}
