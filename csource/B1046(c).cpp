#include <stdio.h>
int main()
{
    int N , a0 = 0 , b0 = 0; 
    int a1 , a2 , b1 , b2;
    scanf("%d", &N);  //输入猜拳的次数
    for(int i = 0 ; i < N ; i ++)
    {
        scanf("%d %d %d %d", &a1 , &a2 , &b1 , &b2);  //分别输入甲喊 甲划 乙喊 乙划
        if(a1 + b1 == a2 && a1 + b1 != b2)
        {
            b0 ++;  //甲赢此局，乙自罚一杯酒
        }
        else if(a1 + b1 == b2 && a1 + b1 != a2)
        {
            a0 ++;  //乙赢此局，甲自罚一杯酒
        }
    }
    printf("%d %d\n", a0 , b0);  //分别输出甲乙各自罚酒的数量
    return 0;
}