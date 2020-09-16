import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;

public class sortOfSorting {

        public static void main(String[] args) throws IOException{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            while(true) {
                int n = Integer.parseInt(br.readLine());
                if(n == 0)
                    break;
                String array[] = new String [n];
                for(int i = 0; i < n; i++) {
                    array[i] = br.readLine();
                }
                Arrays.sort(array, Comparator.comparing(o -> o.substring(0, 2)));
                for(int i = 0; i < array.length; i++) {
                    bw.write(array[i] + "\n");
                }
                bw.write("\n");
                bw.flush();
            }
        }

}
