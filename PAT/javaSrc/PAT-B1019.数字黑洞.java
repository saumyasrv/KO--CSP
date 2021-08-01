import java.util.Arrays;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		sc.close();

		while (true) {
			int d = decrease(m); // 取得递减的数字
			int i = increase(m); // 取得递增的数字
			m = d - i;    
			if (m == 0) {
				System.out.printf("%04d - %04d = %04d\n", d, i, m);
				break;
			}
			if (m == 6174) {
				System.out.printf("%04d - %04d = %04d\n", d, i, m);
				break;
			}
			System.out.printf("%04d - %04d = %04d\n", d, i, m);
		}

	}

	public static int increase(int m) {  // 转换为递增数字
		char[] array = String.format("%04d", m).toCharArray();
		Arrays.sort(array);  // 将指定的数组按升序排序
		int temp = 0;
		for (int i = 0; i < 4; i++) {
			temp = temp * 10 + (array[i] - '0');  
		}
		return temp;
	}

	public static int decrease(int m) {  // 转换为递减数字
		char[] array = String.format("%04d", m).toCharArray();
		Arrays.sort(array); 
		int temp = 0;
		for (int i = 3; i >= 0; i--) {
			temp = temp * 10 + (array[i] - '0'); 
		}
		return temp;

	}

}
