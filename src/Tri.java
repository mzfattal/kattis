import java.util.Scanner;

public class Tri {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int r = in.nextInt();

        String answer = "";

        if(a+b==r) {
            answer = a+"+"+b+"="+r;
        }
        if(a==b+r) {
            answer = a+"="+b+"+"+r;
        }

        if(a*b==r) {
            answer = a+"*"+b+"="+r;
        }
        if(a==b*r) {
            answer = a+"="+b+"*"+r;
        }

        if(a-b==r) {
            answer = a+"-"+b+"="+r;
        }
        if(a==b-r) {
            answer = a+"="+b+"-"+r;
        }

        if(a/b==r) {
            answer = a+"/"+b+"="+r;
        }
        if(a==b/r) {
            answer = a+"="+b+"/"+r;
        }

        System.out.print(answer);


    }
}
