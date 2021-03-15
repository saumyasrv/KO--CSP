#include <iostream>
#include <vector>
using namespace std;
int main()
{
    int N; // 输入需要参赛人数 N
    cin >> N;
    vector<int> arr(N + 1); // 初始化一个大小为 n+1 的动态数组 arr
    int num, score;         // 输入编号，分数

    // 输入参赛选手的信息
    for (int i = 0; i < N; i++)
    {
        cin >> num >> score;
        arr[num] +=
            score;
    }

    // 初始化为最大值，以及临时变量 temp
    int max = arr[1], temp = 1;

    // 遍历筛选出得分最高的学校
    for (int i = 2; i <= N; i++)
    {
        if (max < arr[i])
        {
            max = arr[i];
            temp = i;
        }
    }

    // 输出信息
    cout << temp << " " << max;
    return 0;
}