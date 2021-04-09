package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       int N = in.nextInt();  // 输入正方形边长 N
       String c = in.next();

       int t = N / 2 + N % 2; // 计算出有多少行
        for (int i = 0; i < N; i++){
            System.out.print(c);
        }

        System.out.print("\n");

        // 输出第 2 ~ t-1 行
        for (int i = 0; i < t - 2; i++)
        {
            System.out.print(c); // 输出第一个 c
            for (int k = 0; k < N - 2; k++)
                System.out.print(" ");   // 输出 N - 2 个空格
                System.out.print(c);     // 输出最后一个 c
                System.out.print("\n");  //换行
        }
        for (int i = 0; i < N; i++){
            System.out.print(c);
        }
    }
}