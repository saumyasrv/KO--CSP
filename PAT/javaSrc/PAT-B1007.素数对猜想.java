import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int N = in.nextInt(); // 输入 N
        in.close();
        int sushu[] = new int[10000]; // 定义一个素数数组
        int index = 1; // 自定义下标为 1
        int count = 0; // 记录素数的个数
        sushu[0] = 2;
        for(int i = 3; i <= N; i += 2) {
            int flag = 0; 
            // 判断出不是素数
            for(int j = 0; j < index; j++) {
                if(sushu[j] <= Math.sqrt(i)) {
                    if(i % sushu[j] == 0) {
                        flag = 1; // 能被整除，不是素数，赋值 1 给 flag
                    }
                } else {
                    break;
                }
            } // 判断出是素数
            if(flag == 0) {
                sushu[index] = i; // 把素数存入素数数组中
                if(i - sushu[index - 1] == 2) {
                    count++; // 两个素数之间相差 2 ，则 count 加 1
                }
                index++; // 下标自增
            }
        } // 输出在 N 内，素数的个数
        System.out.println(count);
    }
}