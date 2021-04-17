#include <iostream>
using namespace std;
int main()
{
    int n, cnt = 0; // cnt 为符合要求的信息个数
    cin >> n;       // 输入需要验证的人数
    // 定义基本属性，注意出生日期
    string name, birth, maxname, minname, maxbirth = "1814/09/06", minbirth = "2014/09/06";
    for (int i = 0; i < n; i++)
    {                         // 循环遍历处理信息
        cin >> name >> birth; // 输入信息

        if (birth >= "1814/09/06" && birth <= "2014/09/06")
        { // 过滤无效信息
            cnt++;
            if (birth >= maxbirth)
            { // 找出最年长的人
                maxbirth = birth;
                maxname = name;
            }
            if (birth <= minbirth)
            { // 找出最年轻的人
                minbirth = birth;
                minname = name;
            }
        }
    }
    // 格式化输出信息
    cout << cnt;
    if (cnt != 0)
        cout << " " << minname << " " << maxname;
    return 0;
}
