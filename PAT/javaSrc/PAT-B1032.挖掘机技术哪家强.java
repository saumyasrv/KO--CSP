import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int maxSum = 0; // 定义最大分数和分数最高的学校
        int maxSchool = 0;
        Scanner in = new Scanner(System.in);
        int N = in.nextInt(); // 输入有 N 个学校
        int[] school = new int[N]; // 用数组存放各个学校的分数
        for (int i = 0; i < N; i++) { // 用 for()循环遍历输入学校 id 和 score
            int id = in.nextInt();
            int score = in.nextInt();
            school[id] += score; // id 相同的学校分数相加
            if (school[id] > school[maxSum]) { // 比较各个学校的分数
                maxSchool = id - 1; // id 是数组的下标，所以要减一输出
            }
        } // 输出分数最高学校的 id 和 分数
        System.out.println(maxSchool  + " " + school[maxSchool]);
    }
}
