#include <iostream>
using namespace std;
int main()
{
	/* 输入 a，b 以及需要转换的进制数 */
	int a, b, d;
	cin >> a >> b >> d;

	/* 获取 a 和 b 的和 */
	int t = a + b;

	/* base case */
	if (t == 0)
	{
		cout << 0;
		return 0;
	}

	int s[100]; /* 定义一个数组，用于存放进制转换后的结果 */
	int i = 0;	/* 数组指针 */

	while (t != 0) /* 进制转换 */
	{
		s[i++] = t % d;
		t = t / d;
	}

	/* 打印输出 */
	for (int j = i - 1; j >= 0; j--)
	{
		cout << s[j];
	}
	return 0;
}
