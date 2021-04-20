#include <iostream>
#include <vector>
#include <math.h>
using namespace std;

int main()
{
    int M, N;
    cin >> M >> N;
    vector<int> V; //定义一个动态数组，用于存放扫描到的素数
    int i, j = 0;
    int k;
    for (i = 2; j < N; i++)
    {
        double n = sqrt(i);
        for (k = 2; k <= n; k++)
        {
            if (i % k == 0)
                break;
        }
        if (k > n)
        {
            V.push_back(i);
            j++;
        }
    }
    int count = 0;
    for (i = M - 1; i < N; i++)
    {
        if (!(count % 10 == 0))
        {
            printf(" ");
        }
        printf("%d", V[i]);
        count++;
        if (count % 10 == 0)
            printf("\n");
    }
    return 0;
}

