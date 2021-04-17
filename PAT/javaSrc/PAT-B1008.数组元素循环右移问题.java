import java.util.Scanner;

/**
 * B1008：数组元素循环右移问题
 * <p>
 * 题目描述：
 * 一个数组A中存有N（N > 0）个整数，在不允许使用另外数组的前提下，将每个整数循环向右移M（M > 0）个位置，
 * 即将A中的数据由(A~0 A~1 …… A~N-1)变换为(A~N-M  …… A~N-1 A~0 A~1 …… A~N-M-1 ) （
 * 最后M个数循环移至最前面M个位置）。如果需要考虑程序移动数据的次数尽量少，则应如何设计移动方法？
 * <p>
 * 输入格式：
 * 每个输入包含一个测试用例，第一行输入N(1 <= N <= 100)、M(M >= 0)；第二行输入N个正整数，之间用空格隔开。
 * <p>
 * 输出格式：
 * 在一行中输出循环右移M位以后的整数序列，之间用空格隔开，序列结尾不能有多余的空格。
 * <p>
 * 输入样例：
 * 6 2
 * 1 2 3 4 5 6
 * <p>
 * 输出样例：
 * 5 6 1 2 3 4
 */

public class B1008 {
    public static void main(String[] args) {
        B1008Solutions b1008Solutions = new B1008Solutions();
        b1008Solutions.wSolution();
    }
}

// this class is used to solve the problem
class B1008Solutions {
    /**
     * @author QuakeWang
     */
    public void wSolution() {
        int[] arr = new int[110];
        int n, m, count = 0;// count用于记录应输出数的个数
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        m = scanner.nextInt();
        m = m % n;// 修正m
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        for (int i = n - m; i < n; i++) {
            System.out.printf("%d", arr[i]);
            count++;
            if (count < n) {
                System.out.print(" ");// 如果已经输出数的个数小于n，则输出空格
            }
        }

        for (int i = 0; i < n - m; i++) {// 输出0号到 n - m -1 号
            System.out.printf("%d", arr[i]);
            count++;
            if (count < n) {
                System.out.print(" ");
            }

        }
    }
}
