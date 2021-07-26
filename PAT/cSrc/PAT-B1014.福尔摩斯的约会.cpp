#include <iostream>
#include <cctype>
using namespace std;
int main()
{
    string a, b, c, d; /* 输入四个非空字符串 */
    cin >> a >> b >> c >> d;
    char t[2]; /* 记录前两个字符串中相同元素 */
    int pos, i = 0, j = 0;
    while (i < a.length() && i < b.length()) /* 防止 i 越界 */
    {
        /* 如果字符串 a 中的元素和字符串 b 中的元素相匹配，并且在 A~G 范围之内*/
        if (a[i] == b[i] && (a[i] >= 'A' && a[i] <= 'G'))
        {
            t[0] = a[i]; /* 星期 */
            break;
        }
        i++; /* i 后移 */
    }
    i = i + 1; /* 结束第一轮匹配之后，后移 */
    while (i < a.length() && i < b.length())
    {
        /* isdigit 函数：用于检查其参数是否为十进制数字字符 */
        if (a[i] == b[i] && ((a[i] >= 'A' && a[i] <= 'N') || isdigit(a[i])))
        {
            t[1] = a[i]; /* 钟头 */
            break;
        }
        i++;
    }
    while (j < c.length() && j < d.length()) /* 防止 j 越界 */
    {
        /* isalpha 函数：如果参数是字母字符，函数返回非零值，否则返回零值 */
        if (c[j] == d[j] && isalpha(c[j]))
        {
            pos = j; /* 计算分钟 */
            break;
        }
        j++; /* j 后移 */
    }
    string week[7] = {"MON ", "TUE ", "WED ", "THU ", "FRI ", "SAT ", "SUN "}; /* 某星期的 3 字符缩写 */
    int m = isdigit(t[1]) ? t[1] - '0' : t[1] - 'A' + 10;                      /* 计算钟头 */
    cout << week[t[0] - 'A'];                                                  /* 输出星期数 */
    printf("%02d:%02d", m, pos);                                               /* 输出时间 */
    return 0;
}
