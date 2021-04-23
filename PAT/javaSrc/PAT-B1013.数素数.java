import java.util.Scanner;

public class Main {
    // num 是素数返回 true，num 不是素数返回 false
    private static boolean prime(int num) {
        int max = (int) Math.sqrt(num);
        for (int i = 2; i <= max; i++) {
            if (num % i == 0) { // 能被整除，不是素数，返回 false
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // 输入 M, N
        Scanner in = new Scanner(System.in);
        int M = in.nextInt();
        int N = in.nextInt();
        in.close();

        int index = 1; // 下一个素数的下标，下标从 1 开始
        int num = 2;
        // 排除第 M 个素数之前的素数
        while (index < M) {
            if (prime(num++)) {
                index++;
            }
        }

        int col = 0;	// 列，0 ~ 9
        // 输出第 M 至 N 个素数
        while (index <= N) {
            if (prime(num)) {
                if (index == N || col == 9) { // 控制输出格式，输出最后一个结果
                    System.out.println(num);
                } else {
                    System.out.print(num + " "); // 控制输出结果格式
                }
                col = (col + 1) % 10; // 列数控制为十列
                index++;
            }
            num++;
        }
    }
}
