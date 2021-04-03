#include <iostream>
#include <algorithm>
#include <vector>
using namespace std;
int main()
{
    int N;
    long long p;
    scanf("%d%lld", &N, &p);    // 输入正整数 N，以及给定参数 p
    vector<int> v(N);           // 定义一个动态数组，初始大小为 N
    for (int i = 0; i < N; i++) // 给数组进行赋值
        cin >> v[i];
    sort(v.begin(), v.end());   // 对数组进行排序
    int result = 0, temp = 0;   // 定义最终输出结果以及临时变量
    for (int i = 0; i < N; i++) // 遍历动态数组中的元素
    {
        for (int j = i + result; j < N; j++)
        {
            if (v[j] <= v[i] * p) // 判断元素是否符合要求
            {
                temp = j - i + 1; // 计算出符合要求的元素个数
                if (temp > result)
                    result = temp;
            }
            else
            {
                break;
            }
        }
    }

    cout << result; // 输出
    return 0;
}
