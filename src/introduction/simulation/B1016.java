package introduction.simulation;

import java.util.Scanner;

/**
 * B1016：部分A + B
 * 题目描述：
 * 正整数A的 “DA（为1位整数）部分” 定义为由A中所有DA 组成的新整数PA 。例如：给定A = 3862767， D~A = 6，则A的“6的部分”PA 是66，因为A中有2个6。
 * <p>
 * 输入格式：
 * 在一行中依次输入A、DA、B、DB ，中间以空格分隔，其中 A > 0, B < 10^10。
 * <p>
 * 输出格式：
 * 在一行中输出PA + PB 的值。
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
    public static void main(String[] args) {
        B1016Solution b1016Solution = new B1016Solution();
        b1016Solution.wSolution();
    }
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
        while (a != 0) {// 对输入的正整数a进行处理
            if (a % 10 == da) {// 判断是否含有da
                pa = pa * 10 + da;// 若当前位为da，给pa增加一位da
            }
            a = a / 10;// 处理下一位数
        }
        // 对正整数b的处理同理
        while (b != 0) {
            if (b % 10 == db) {
                pb = pb * 10 + db;
            }
            b = b / 10;
        }
        // 得出答案
        System.out.println("pa + pb = " + (pa + pb));
    }
}

