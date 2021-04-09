import java.util.Scanner;
import java.util.Stack;

public class Main{
    public static void main(String[] args) {
        // 定义一个栈 stack
        Stack<String> stack = new Stack<String>();
        Scanner in = new Scanner(System.in);
        // 输入一串字符串，中间以空格分开，存入数组中
        String[] str = in.nextLine().split(" ");
        for (int i = 0; i < str.length; i++) {
            // 把数组中的字符串 push 到栈 stack 中
            stack.push(str[i]);
        } // 按顺序输出栈 stack
        for (int i = 0; i < str.length; i++) {
            if (i == 0) {
                System.out.print(stack.pop());
            }else{ // 第一个正常输出结果，其他的输出空格和结果
                System.out.print(" " + stack.pop());
            }
        }

    }
}