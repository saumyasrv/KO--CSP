package introduction.simulation;

import java.util.Scanner;

/**
 * B1016：部分A + B
 * 题目描述：
 * 正整数A的 “D~A（为1位整数）部分” 定义为由A中所有D~A 组成的新整数P~A 。例如：给定A = 3862767， D~A = 6，则A的“6的部分”P~A 是66，因为A中有2个6。
 * <p>
 * 输入格式：
 * 在一行中依次输入A、D~A、B、D~B ，中间以空格分隔，其中 A > 0, B < 10^10。
 * <p>
 * 输出格式：
 * 在一行中输出P~A + P~B 的值。
 * <p>
 * 输入样例1：
 * 3862767 6 13530293 3
 * 输出样例1：
 * 399
 * 输入样例2：
 * 3862767 1 13530293 8
 * 输出样例2：
 * 0
 */
public class B1016 {
}

class B1016Solution {
    // write by QuakeWang
    public void wSolution() {
        long a, b, da, db;
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextLong();
        da = scanner.nextLong();
        b = scanner.nextLong();
        db = scanner.nextLong();
        long pa = 0, pb = 0;
        while (a != 0) {
            if (a % 10 == da) {
                pa = pa * 10 + da;
            }
            a = a / 10;
        }
        while (b != 0) {
            if (b % 10 == db) {
                pb = pb * 10 + db;
            }
            b = b / 10;
        }
        System.out.println("pa + pb = " + (pa + pb));
    }
}

