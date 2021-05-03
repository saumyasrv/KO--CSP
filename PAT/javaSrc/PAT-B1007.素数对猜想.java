import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        // 输入 N
        int N = in.nextInt(); 
        in.close();
        // 定义一个素数数组
        int sushu[] = new int[10000]; 
        // 自定义下标为 1
        int index = 1; 
        // 记录素数的个数
        int count = 0; 
        sushu[0] = 2;
        for(int i = 3; i <= N; i += 2) {
            int flag = 0; 
            // 判断出不是素数
            for(int j = 0; j < index; j++) {
                if(sushu[j] <= Math.sqrt(i)) {
                    if(i % sushu[j] == 0) {
                        // 能被整除，不是素数，赋值 1 给 flag
                        flag = 1; 
                    }
                } else {
                    break;
                }
            }
            // 判断出是素数
            if(flag == 0) {
                // 把素数存入素数数组中
                sushu[index] = i; 
                if(i - sushu[index - 1] == 2) {
                    // 两个素数之间相差 2 ，则 count 加 1
                    count++; 
                }
                // 下标自增
                index++; 
            }
        } 
        // 输出在 N 内，素数的个数
        System.out.println(count);
    }
}
