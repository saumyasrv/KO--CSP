package com.company;

import java.util.Scanner;

public class B1004 {
    //定义student类
    private static class student {
        String name;
        String ID;
        int score;
    }

    public static void main(String[] args) {
        Scanner scannner = new Scanner(System.in);
        int N = scannner.nextInt();//输入学生人数
        int maxScore = -1;
        int maxID = 0;
        int minScore = 101;
        int minID = 0;
        student[] B = new student[N];//定义数组B
        for (int i = 0; i < N; i++) {
            B[i] = new student();//引用student类
            B[i].name = scannner.next();//输入学生姓名
            B[i].ID = scannner.next();//输入学生考号
            B[i].score = scannner.nextInt();//输入学生分数
            if (B[i].score > maxScore) {  //比较出分数较大的学生姓名和考号
                maxScore = B[i].score;
                maxID = i;
            }
            if (B[i].score < minScore) {  //比较出分数较小的学生姓名和考号
                minScore = B[i].score;
                minID = i;
            }
        }
        //输出较大的和较小的人的姓名和考号
        if (N != 0) {
            System.out.println(B[maxID].name + " " + B[maxID].ID);
            System.out.println(B[minID].name + " " + B[minID].ID);
        }
    }
}
