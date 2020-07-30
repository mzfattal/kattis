import java.util.Scanner;

public class Autori {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String word = in.next();

        for(int i=0;i<word.length();i++) {
            char curr = word.charAt(i);
            boolean bool = Character.isUpperCase(curr);
            if(bool) {
                System.out.print(curr);
            }
        }
    }
}
