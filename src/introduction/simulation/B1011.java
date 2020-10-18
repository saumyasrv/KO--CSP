package introduction.simulation;

import java.util.Scanner;

/**
 * B1011：A + B 和 C
 * 题目描述：
 * 给定区间[-2^31, 2^31]内的三个正整数A、B和C，请判断 A + B 是否大于 C
 * 输入格式：
 * 第一行给出正整数T（T <= 10），即测试用例的个数。随后给出T组测试用例，每组
 * 占一行，顺序给出A、B和C。整数间以空格分隔。
 * 输出格式：
 * 对每组测试用例，如果A + B > C，在一行中输出“Case #X: true”；否则给出
 * “Case #X: false”，其中X是测试用例的编号（从1开始）。
 * 输入样例：
 * 4
 * 1 2 3
 * 2 3 4
 * 2147483647 0 2147483646
 * 0 -2147483648 -2147483647
 * 输出样例：
 * Case #1: false
 * Case #2: true
 * Case #3: true
 * Case #4: false
 */
public class B1011 {
    public static void main(String[] args) {
        B1011Solutions solution = new B1011Solutions();
        // B1011Solutions.wSolution(3);
        solution.dSolution();
    }

}

// this class is used to test case
class B1011Solutions {

    // write by QuakeWang

    /**
     * @param T 表示需要判断的次数
     */
    public void wSolution(int T) {
        System.out.println("please input three number：");
        Scanner scanner = new Scanner(System.in);
        long a = 0;
        long b = 0;
        long c = 0;
        int tCase = 1;
        while (T != 0) {
            a = scanner.nextLong();
            b = scanner.nextLong();
            c = scanner.nextLong();
            if (a + b > c) {
                System.out.printf("Case #%d: true", tCase++);
            } else {
                System.out.printf("Case #%d: false", tCase++);
            }
            System.out.println();
            T--;
        }
    }

    // write by DHY

    /**
     * 暴力破解
     * 因为要存储数据，并且一行要存三个数据，那么就像一维数组一样
     * 一个变量名可以存多个数据
     * 然后他要存最多十组，我们可以利用二维数组，第一行第一组数据，第二行第二组数据....
     * 每一组存三个，下标为0的当作A，下标为2的当作B......
     * 一般的教材利用数组的下标来进行写入或读取，这是二维数组
     * 所以要利用双重 for 循环
     * 读取利用一层for循环
     */
    public void dSolution() {
        int T;
        long[][] Arr = new long[10][3];
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个10以内的整数（包含10）");
        T = sc.nextInt();
        System.out.println("请输入数据");
        for (int i = 0; i < T; i++) {
            for (int j = 0; j < 3; j++) {
                Arr[i][j] = sc.nextLong();
            }
        }
        for (int i = 0; i < T; i++) {
            if (Arr[i][0] + Arr[i][1] > Arr[i][2]) {
                System.out.println("Case #" + (i + 1) + ": true");
            } else {
                System.out.println("Case #" + (i + 1) + ": false");
            }
        }
    }
}

