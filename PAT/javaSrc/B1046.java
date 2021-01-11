package introduction.simulation;

import java.util.Scanner;

/*# B1046
 * 题目描述：划拳
 *    划拳是中国酒文化中的一个有趣的组成成分。酒桌上两个人划拳的方法为：每人口中喊出一个数字，同时用手比划出一个数字。
 * 如果谁比划出的数字正好等于两人喊出的数字之和，谁就赢了，输家自罚一杯酒。两人同赢或两人同输则继续下一轮，直到唯一的赢家出现。
 * 下面给出甲、乙两人的划拳记录，请统计他们最后分别喝了多少杯酒。
 *
 * 输入格式：
 *    第一行先给出一个正整数N(N <= 100)；随后N行每行给出一轮划拳的记录，格式为：甲喊 甲划 乙喊 乙划
 * 其中“喊”是喊出的数字，“划”是划出的数字。均为不超过100的正整数（两只手一起划）。
 *
 * 输出格式：
 * 在一行中先后输出甲、乙两人喝酒的杯数，其间以一个空格间隔。
 *
 * 输出样例：
 * 5
 * 8 10 9 12
 * 5 10 5 10
 * 3 8 5 12
 * 12 18 1 13
 * 4 16 12 15
 *
 * 输出样例：
 * 1 2
 **/
public class B1046 {
    public static void main(String[] args) {
        B1046Solutions b1046Solutions = new B1046Solutions();
        b1046Solutions.wSolution();
    }
}

// B1046解法类
class B1046Solutions {
    // write by QuakeWang
    public void wSolution() {
        int n, failA = 0, failB = 0;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            int a1 = scanner.nextInt();// 甲喊
            int a2 = scanner.nextInt();// 甲划
            int b1 = scanner.nextInt();// 乙喊
            int b2 = scanner.nextInt();// 乙划
            // 划出的数字等于喊出的数字之和
            if (a1 + b1 == a2 && a1 + b1 != b2) {// 甲赢
                failB++;
            } else if (a1 + b1 == b2 && a1 + b1 != a2) {// 乙赢
                failA++;
            }
        }
        System.out.printf("%d %d",failA,failB);
    }
}
