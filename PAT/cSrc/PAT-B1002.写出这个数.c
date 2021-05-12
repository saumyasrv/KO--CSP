#include <stdio.h>
#include <string.h>
int main()
{
    int numberSum = 0, i;
    // 定义变量numberSum用来计算数字之和，i用来做循环下标
    char number[100];
    // 定义一个字符数组
    char pinyin_sign[10][10] = {"ling", "yi", "er", "san", "si", "wu", "liu", "qi", "ba", "jiu"};
    // 定义一个汉字拼音数组
    int spiltNumber[100], spilt_index = 0;
    // 定义数组spiltNumber用来存储被拆分的数的每一位的数字
    scanf("%s", number);
    // 终端输入数字
    int num_length = strlen(number);
    // 用来计算字符数组长度返回给
    for (i = 0; i < num_length; i++)
    {
        numberSum += number[i] - '0';
    }
    // for循环计算数字之和,利用ASCII码计算

    while (numberSum)
    {
        spiltNumber[spilt_index++] = numberSum % 10;
        numberSum /= 10;
        // 拆分一个数的位数，取余、开除是最基本方法，要掌握
    }
    // 将拆分的数字存储到spiltNumber数组内

    for (i = spilt_index - 1; i >= 0; i--)
    {
        if (i != 0)
            printf("%s ", pinyin_sign[spiltNumber[i]]);
        else
            printf("%s\n", pinyin_sign[spiltNumber[i]]);
    }
    // 逆序输出数字汉字拼音
    return 0;
}
/*
    此程序在PAT中调用gcc/g++运行时会产生warning,而调用clang运行则正常显示，这是因为两者的编译规则有些不同
    但程序整体逻辑是正确，在vscode等都可以成功运行调试
*/