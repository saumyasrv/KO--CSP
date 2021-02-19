#include <iostream>
using namespace std;
int main()
{
    /**
     * n 表示输入的学生数
     * max 表示成绩最高分数，初始值为 -1
     * min 表示成绩最低分数，初始值为 101
     * socre 表示学生成绩
    */
    int n, max = -1, min = 101, score;
    cin >> n;
    /**
     * maxname 表示成绩最高分学生姓名
     * minname 表示成绩最低分学生姓名
     * maxnum 表示成绩最高分学生学号
     * minnum 表示成绩最低分学生学号
     * name 表示学生姓名
     * num 表示学生学号 
     */
    string maxname, minname, maxnum, minnum, name, num;
    // 利用 for 循环遍历所有学生信息
    for (int i = 0; i < n; i++)
    {
        // 输出学生姓名 学号 成绩
        cin >> name >> num >> score;
        // 寻找最高分
        if (max < score)
        {
            max = score;
            maxname = name;
            maxnum = num;
        }
        // 寻找最低分
        if (min > score)
        {
            min = score;
            minname = name;
            minnum = num;
        }
    }

    // 分别输出最高分和最低分
    cout << maxname << " " << maxnum << endl
         << minname << " " << minnum;
    return 0;
}