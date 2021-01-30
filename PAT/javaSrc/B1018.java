import java.util.Scanner;


public class B1018 {
}

class B1018Solutions {

    /**
     * @return 返回各个手势对应的值
     * @author QuakeWang
     */
    public int change(char c) {
        if (c == 'B') {
            return 0;
        } else if (c == 'C') {
            return 1;
        } else {
            return 2;
        }
    }

    public void wSolution() {
        char[] map = {'B', 'C', 'J'};
        int n;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        // 分别记录甲、乙的胜、平、负次数
        int[] times_A = new int[3];
        int[] times_B = new int[3];
        // 按BJC顺序分别记录甲、乙3种手势的获胜次数
        int[] hand_A = new int[3];
        int[] hand_B = new int[3];

        char c1 = ' ', c2 = ' ';
        int k1, k2;
        for (int i = 0; i < n; i++) {
            // 获取甲、乙的手势
            c1 = scanner.next().charAt(0);
            c2 = scanner.next().charAt(0);
            // 转换为对应的数字
            k1 = change(c1);
            k2 = change(c2);
            if ((k1 + 1) % 3 == k2) {// 如果甲胜
                times_A[0]++;// 甲胜次数+1
                times_B[2]++;// 乙负次数+1
                hand_A[k1]++;// 记录甲获胜的手势
            } else if ((k1 == k2)) {// 如果平局
                times_A[1]++;// 甲平局次数+1
                times_B[1]++;// 乙平局次数+1
            } else {// 如果乙胜
                times_A[2]++;// 甲负次数+1
                times_B[0]++;// 乙胜次数+1
                hand_B[k2]++;// 记录乙获胜的手势
            }
        }

        // 分别输出甲、乙 胜、平、负的次数
        System.out.printf("%d %d %d\n", times_A[0], times_A[1], times_A[2]);
        System.out.printf("%d %d %d\n", times_B[0], times_B[1], times_B[2]);

        // 记录甲、乙获胜次数最多的手势
        int id1 = 0, id2 = 0;
        for (int i = 0; i < 3; i++) {
            if (hand_A[i] > hand_A[id1]) {
                id1 = i;
            }
            if (hand_B[i] > hand_B[id2]) {
                id2 = i;
            }
        }
        System.out.printf("%c %c\n", map[id1], map[id2]);
    }
}
