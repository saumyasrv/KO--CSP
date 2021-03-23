import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int A = in.nextInt();
        int B = in.nextInt(); //定义输入的三个值 A B D
        int D = in.nextInt();
        int sum = A + B; // 定义 A + B 的和 sum
        int i = 0;
        int[] re = new int[100]; // 定义一个数组来存储余数
        while (sum > 0){
            int m = sum % D; // 用 A + B 的和对 D 进行取余
            re[i] = m; // 把余数 m 赋值给数组存储
            sum = sum / D; // 把个位数删去
            i++;
        }
        for (int j = i-1; j >= 0; j--){
            System.out.print(re[j]); // 倒序输出数组中的值
        }
        // 第二种 Java 方法  直接调用进制转换方法（不推荐）
     /*Scanner in = new Scanner(System.in);
        int A = in.nextInt();
        int B = in.nextInt();
        int D = in.nextInt();
        int sum = A + B;
        String s = Integer.toString(sum, D); // 直接调用封装好的方法
        System.out.println(s);*/
    }
}
