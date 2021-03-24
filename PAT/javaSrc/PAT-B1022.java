import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //定义输入的三个值 A B D
        int A = in.nextInt();
        int B = in.nextInt(); 
        int D = in.nextInt();
        // 定义 A + B 的和 sum
        int sum = A + B; 
        int i = 0;
        // 定义一个数组来存储余数
        int[] re = new int[100]; 
        while (sum > 0){
            // 用 A + B 的和对 D 进行取余
            int m = sum % D;
            // 把余数 m 赋值给数组存储
            re[i] = m;
            // 把个位数删去
            sum = sum / D; 
            i++;
        }
        for (int j = i-1; j >= 0; j--){
            // 倒序输出数组中的值
            System.out.print(re[j]); 
        }
    }
}
