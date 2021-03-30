import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		double p = sc.nextInt();
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < N; i++) {
			list.add(sc.nextInt());
		}
		sc.close();
		Collections.sort(list);
		int count = 0;
		for (int i = 0; i < N; i++) {
			for (int j = i+count; j < N; j++) {
				if(list.get(j) > list.get(i)*p)  break;
				if( j-i+1 > count) count = j-i+1;
			}
		}
		System.out.print(count);
	}
}