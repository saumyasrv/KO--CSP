package PAT.B1013;

import java.util.Scanner;

public class Main {
    // num 是素数返回 true，num 不是素数返回 false
    private static boolean prime(int num) {
        int max = (int) Math.sqrt(num);
        for (int i = 2; i <= max; i++) {
            if (num % i == 0) {
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

        int index = 1; // 下一个素数的下标，下标从1开始
        int num = 2;
        // 排除第M个素数之前的素数
        while (index < M) {
            if (prime(num++)) {
                index++;
            }
        }

        int col = 0;	// 列，0~9
        // 输出第M至N个素数
        while (index <= N) {
            if (prime(num)) {
                if (index == N || col == 9) {
                    System.out.println(num);
                } else {
                    System.out.print(num + " ");
                }
                col = (col + 1) % 10;
                index++;
            }
            num++;
        }
    }
}
