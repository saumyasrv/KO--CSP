#include <stdio.h>
int main()
{
    int k , N = 54;  //定义牌数
    char mp[] = {'S' , 'H' , 'C' , 'D' , 'J'};//定义花色
    int start[N + 1];
    int end[N + 1];
    int next[N + 1];
    scanf("%d" , &k);
    for(int i = 1; i <= N; i++)
    {
        start[i] = i;   // 初始化牌的编号
    }
    for(int i = 1; i <= N; i++)
    {
        scanf("%d" , &next[i]);    // 输入每个位置上的牌在操作之后的位置
    }
    for(int step = 0; step < k; step++)
    {
        for(int i = 1; i <= N; i++)
        {
            end[next[i]] = start[i];    // 把第i个位置的牌的编号存于位置next[i]
        }
        for(int i = 1; i <= N; i++)
        {
            start[i] = end[i];   // 把end数组赋值给start数组以供下次操作使用
        }

    }

    for(int i = 1; i <= N; i++)
    {
        if(i != 1)
        {
            printf(" ");// 控制输出格式
        }
        start[i]--;
        printf("%c%d" , mp[start[i] / 13], start[i] % 13 + 1);//输出洗牌结果
    }
    return 0;
}
