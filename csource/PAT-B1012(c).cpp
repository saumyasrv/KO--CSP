#include <stdio.h>
int main()
{
    int count[5] = {0,};
    int sum[5];
    int N, num;
    scanf("%d" , &N); //请输入要输入数的个数
    for(int i = 0; i < N; i++)
    {
        scanf("%d" , &num);  //输入要分类的数
        if(num % 5 == 0)   //分拣A1类的数字
        {
            if(num % 2 == 0)
            {
                sum[0] += num;
                count[0]++;
            }
        }
        else if(num % 5 == 1)  //分拣A2类的数字
        {
            if(count[1] % 2 == 0)
            {
                sum[1] += num;
            }
            else
            {
                sum[1] -= num;
            }
            count[1]++;
        }
        else if(num % 5 == 2)  //分拣A3类的数字
        {
            count[2]++;
        }
        else if(num % 5 == 3)  //分拣A4类的数字
        {
            sum[3] += num;
            count[3]++;
        }
        else if(num % 5 == 4)  //分拣A5类的数字
        {
            if(num > sum[4])
            {
                sum[4] = num;
            }
            count[4]++;
        }
    }
        if (count[0] == 0) printf("N ");  //输出A1类的数字
        else printf("%d ", sum[0]);
        if (count[1] == 0) printf("N ");  //输出A2类的数字
        else printf("%d ", sum[1]);
        if (count[2] == 0) printf("N ");  //输出A3类的数字
        else printf("%d ", count[2]);
        if (count[3] == 0) printf("N ");  //输出A4类的数字
        else printf("%.1f ", (double) sum[3] / count[3]);
        if (count[4] == 0) printf("N");  // 最后一个不能有空格！！！
        else printf("%d", sum[4]);  //输出A5类的数字
        return 0;
}
