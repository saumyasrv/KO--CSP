#include <stdio.h>
int main()
{
   int x, n;// x为系数,n为指数
   int flag = 0;
   while(~scanf("%d %d", &x, &n)) //连续输入想要求导的x和n
   {
      if (n != 0) {
         if (flag == 0) {
            printf("%d", x * n);// 输出求导后的系数
         } else {
            printf(" %d", x * n);// 加上空格
         }
            printf(" %d", n - 1);// 输出求导后的指数
            flag = 1;// 处理结束
      }  
   }
   // 处理特殊情况
   if (flag == 0) {
      printf("0 0");
   }
   return 0;
}
