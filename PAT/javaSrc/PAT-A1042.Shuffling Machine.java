import java.util.Scanner;

public class A1042 {
    public static void main(String[] args) {
        A1042Solutions a1042Solutions = new A1042Solutions();
        a1042Solutions.wSolution();
    }
}

class A1042Solutions {
    int N = 54;
    char[] mp = {'S', 'H', 'C', 'D', 'J'};
    int[] start = new int[N + 1];
    int[] end = new int[N + 1];
    int[] next = new int[N + 1];

    public void wSolution() {
        int k = 0;
        Scanner scanner = new Scanner(System.in);
        k = scanner.nextInt();

        for (int i = 1; i <= N; i++) {
            start[i] = i;// 初始化牌的编号
        }
        for (int i = 1; i <= N; i++) {
            next[i] = scanner.nextInt();// 输入每个位置上的牌在操作之后的位置
        }
        for (int step = 0; step < k; step++) {
            for (int i = 1; i <= N; i++) {
                end[next[i]] = start[i];// 把第i个位置的牌的编号存于位置next[i]
            }
            for (int i = 1; i <= N; i++) {
                start[i] = end[i];// 把end数组赋值给start数组以供下次操作使用
            }
        }

        for (int i = 1; i <= N; i++) {
            if (i != 1) {
                System.out.print(" ");// 控制输出格式
            }
            start[i]--;
            System.out.printf("%c%d", mp[start[i] / 13], start[i] % 13 + 1);
        }

    }
}
