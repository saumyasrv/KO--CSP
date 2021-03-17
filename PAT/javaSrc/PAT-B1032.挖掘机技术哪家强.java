package PAT.B1032;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int maxSum = 0;
        int maxSchool = 0;
        int[] school = new int[N];
        for (int i = 0; i < N; i++) {
            int id = in.nextInt();
            int score = in.nextInt();
            school[id] = school[id] + score;
            if (school[id] > school[maxSum]) {
                maxSchool = id;
            }
        }
        System.out.println((maxSchool - 1)  + " " + school[maxSchool - 1]);
    }
}
