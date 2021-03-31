import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // 输入整数 N
		double p = sc.nextInt(); // 输入整数 p
		ArrayList<Integer> list = new ArrayList<Integer>(); // 定义一个 ArrayList<> 泛型数组
		for (int i = 0; i < N; i++) {
			list.add(sc.nextInt()); // 遍历添加 N 个数
		}
		sc.close(); // 关闭输入
		Collections.sort(list); // 对添加的数进行排序
		int count = 0; // 定义 count 来输出符合条件的个数
		for (int i = 0; i < N; i++) { // 用双重 for() 循环遍历，找出完美数列的个数
			for (int j = i+count; j < N; j++) {
				if(list.get(j) > list.get(i)*p)  break; // 用 if() 判断出符合条件的数
				if( j-i+1 > count) count = j-i+1; // 筛选出符合 count 的个数
			}
		}
		System.out.print(count); // 输出 count 的个数
	}
}
