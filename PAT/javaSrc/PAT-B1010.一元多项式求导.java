import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int flag = 0;// 用于判断是否完成所有数据
        
        // 使用Scanner类中的hsaNext() 方法来处理输入
        while (in.hasNext()) {
            int x = in.nextInt();// x为系数
            int n = in.nextInt();// n为指数
            if (n != 0) {
                if (flag == 0) {
                    System.out.print(x * n);// 输出求导后的系数
                } else {
                    System.out.print(" " + x * n);// 加上空格
                }
                System.out.print(" " + (n - 1));// 输出求导后的指数
                flag = 1;// 处理结束
            }
        }
        
        // 处理特殊情况
        if (flag == 0) {
            System.out.print("0 0");
        }
    }
}
