#include<stdio.h>
int main() 
{
    int T, tcase = 1;
    scanf("%d", &T);// 输入数组数据数
    while (T--)// 循环T次
    {
        long long a, b, c;
        scanf("%lld%lld%lld",&a, &b, &c);
        if (a + b > c)
        {
            printf("Case #%d: true\n", tcase++);
        } else
        {
            printf("Case #%d: fasle\n", tcase++);
        }
        return 0;
    }
    
}