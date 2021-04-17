#include <stdio.h>

typedef struct 
{
    char Id[17];
    int Testid;
    int Examid;
} B1041; //定义考生信息 结构体B1041

int main()
{
    int N, M, testid;
    scanf("%d", &N); //输入考生人数N
    B1041 b[N]; //定义结构体数组，将数组下标看作试机号
    for(int i = 0; i < N; i++)
        scanf("%s %d %d", &b[i].Id, &b[i].Testid, &b[i].Examid); //输入考生信息
    scanf("%d", &M); //输入缺考人数M
    while (M--)
    {
        scanf("%d", &testid); //输入缺考考生的试机号
        for(int i = 0; i < N; i++)
        {
            if(b[i].Testid == testid) //查找试机号所在信息
            {
                printf("%s %d\n", b[i].Id, b[i].Examid);//输出缺考考生的准考证号和考试座位号
            }
        }
    }
    return 0;
}
