#include <iostream>
#include <algorithm>
#include <vector>
using namespace std;

/* 定义一个结构体，用于存放 准考证号 德分 才分 */
struct node
{
    int num, de, cai;
};

/* 录取策略 */
int cmp(struct node a, struct node b)
{
    if ((a.de + a.cai) != (b.de + b.cai))
        return (a.de + a.cai) > (b.de + b.cai);
    else if (a.de != b.de)
        return a.de > b.de;
    else
        return a.num < b.num;
}

int main()
{
    int n, low, high; /* 考生人数 录取最低分 优先录取线 */
    scanf("%d %d %d", &n, &low, &high);
    vector<node> v[4];
    node temp; /*  临时结点 */
    int total = n;

    /* 筛选学生信息 */
    for (int i = 0; i < n; i++)
    {
        scanf("%d %d %d", &temp.num, &temp.de, &temp.cai);
        if (temp.de < low || temp.cai < low)
            total--;
        else if (temp.de >= high && temp.cai >= high)
            v[0].push_back(temp);
        else if (temp.de >= high && temp.cai < high)
            v[1].push_back(temp);
        else if (temp.de < high && temp.cai < high && temp.de >= temp.cai)
            v[2].push_back(temp);
        else
            v[3].push_back(temp);
    }
    printf("%d\n", total); /* 达到最低分数线的考生人数 M */
    for (int i = 0; i < 4; i++)
    {
        sort(v[i].begin(), v[i].end(), cmp); /* 按准考证号的升序 */

        for (int j = 0; j < v[i].size(); j++) /* 输出 */
            printf("%d %d %d\n", v[i][j].num, v[i][j].de, v[i][j].cai);
    }
    return 0;
}
