import java.util.Scanner;

public class B1012 {
    public static void main(String[] args) {
        B1012Solutions b1012Solutions = new B1012Solutions();
        b1012Solutions.wSolution();
    }
}

// this class is used to solve the problem
class B1012Solutions {

    /**
     * @author QuakeWang
     */
    public void wSolution() {
        int[] count = new int[5];
        int[] ans = new int[5];
        int n, temp;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            temp = scanner.nextInt();// 读入数字
            if (temp % 5 == 0) {// A1类
                if (temp % 2 == 0) {
                    ans[0] += temp;
                    count[0]++;
                }
            } else if (temp % 5 == 1) {// A2类
                if (count[1] % 2 == 0) {
                    ans[1] += temp;
                } else {
                    ans[1] -= temp;
                }
                count[1]++;
            } else if (temp % 5 == 2) {// A3类
                count[2]++;
            } else if (temp % 5 == 3) {// A4类
                ans[3] += temp;
                count[3]++;
            } else {// A5类
                if (temp > ans[4]) {
                    ans[4] = temp;
                }
                count[4]++;
            }
        }
        if (count[0] == 0) System.out.print("N ");
        else System.out.printf("%d ", ans[0]);
        if (count[1] == 0) System.out.print("N ");
        else System.out.printf("%d ", ans[1]);
        if (count[2] == 0) System.out.print("N ");
        else System.out.printf("%d ", count[2]);
        if (count[3] == 0) System.out.print("N ");
        else System.out.printf("%.1f ", (double) ans[3] / count[3]);
        if (count[4] == 0) System.out.print("N");// 最后一个不能有空格！！！
        else System.out.printf("%d", ans[4]);
    }
}
