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
    public static void main(String[] args) {

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
    // write by DHY

    public void dSolution() {
        int x = 0;//记录空格数
        int i = 0;//伪指针，用于遍历数组
        int k = 0;//用于记录字符出现次数
        int p1 = 0, p2 = 0;//用于记录A与B的最后位置
        int Da = 0, Db = 0;//用于记录Da与Db(转化为数字）
        int pa = 0, pb = 0;//用于记录pa与pb
        int sum = 0;//PA+PB的和
        char fx = '0', sx = '0';//用于记录Da
        Scanner sc = new Scanner(System.in);
        String str = new String();
        str = sc.nextLine();
        char[] ch = str.toCharArray();
        System.out.println(ch);
        while (true) {
            if (ch[i] == ' ') {
                x++;
                if (x == 1) {
                    p1 = i;
                    fx = ch[i + 1];
                    Da = (int) fx - 48;
                    //System.out.println(Da);//
                } else if (x == 3) {
                    p2 = i;
                    sx = ch[i + 1];
                    Db = (int) sx - 48;
                    //System.out.println(sx);//
                    break;
                }
            }
            i++;

        }
        for (int j = 0; j < p1; j++) {
            if (ch[j] == fx) {
                pa = pa * 10 + Da;
            }
        }
        for (int l = (p1 + 3); l < p2; l++) {
            if (ch[l] == sx) {
                pb = pb * 10 + Db;
            }
        }
        System.out.println(pa + pb);
    }
}

