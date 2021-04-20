#include <iostream>
#include <vector>
using namespace std;

bool isprime(int a)
{
    for (int i = 2; i * i <= a; i++)
        if (a % i == 0)
            return false;
    return true;
}

int main()
{
    int M, N, num = 2, cnt = 0;
    cin >> M >> N;
    vector<int> v;
    while (cnt < N)
    {
        if (isprime(num))
        {
            cnt++;
            if (cnt >= M)
                v.push_back(num);
        }
        num++;
    }

    cnt = 0; // 重置为 0

    // 遍历动态数组 V，打印输出
    for (int i = 0; i < v.size(); i++)
    {
        cnt++;
        if (cnt % 10 != 1) // 一行内容不 10 个数，空格
            printf(" ");
        printf("%d", v[i]); // 输出素数
        if (cnt % 10 == 0)  // 一行内容满 10 个数，换行
            printf("\n");
    }
    return 0;
}

