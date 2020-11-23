#include <stdio.h>
int main()
{
    int step = 0 , n;
    scanf("%d" , &n);   //输入一个小于等于1000的正整数n
    while (n != 1) 
    {
        if (n % 2 == 0) 
        {
           n = n / 2;   //如果n是偶数，直接取它的一半
        } 
        else 
        {
           n = (3 * n + 1) / 2;  //如果n是一个奇数，取它的（3*n+1）的一半
        }
           step++;
    }
    printf("%d\n" , step);   //输出需要的步数
    return 0;
}
