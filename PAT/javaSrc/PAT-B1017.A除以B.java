import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        String A = str[0];
        int B = Integer.parseInt(str[1]);
        StringBuffer sb = new StringBuffer();
        int sum = 0;
        for (int i = 0; i < A.length(); i++) {
            sum = sum * 10 + A.charAt(i) - '0';
            sb.append((char) (sum / B + '0'));
            sum %= B;
        }
        String Q = sb.toString();
        int R = sum;
        if (Q.charAt(0) == '0' && Q.length() != 1) {
            System.out.println(Q.substring(1) + " " + R);
        } else {
            System.out.println(Q + " " + R);
        }
    }
}
