import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {
        Scanner in = new Scanner(System.in);
        // 输入一串字符串，中间以空格分开，存入数组中
        String[] str = in.nextLine().split(" ");
        // 用 for() 循环倒序输出
        for (int i = str.length - 1; i >= 0; i--) {
            // 按输出要求来，末尾不要留空格
            if(i == str.length - 1){
                System.out.print(str[i]);
            }else { // 第一个正常输出结果，其他的输出空格和结果
                System.out.print(" " + str[i]);
            }
        }

    }
}