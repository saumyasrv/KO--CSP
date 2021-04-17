#include <iostream>
using namespace std;
int main()
{
	int N;	// 输入正方形边长 N
	char c; // 输入字符
	cin >> N >> c;

	int t = N / 2 + N % 2; // 计算出有多少行

	// 输出第一行
	for (int i = 0; i < N; i++)
		cout << c;

	cout << endl; // 换行

	// 输出第 2 ~ t-1 行
	for (int i = 0; i < t - 2; i++)
	{
		cout << c; // 输出第一个 c
		for (int k = 0; k < N - 2; k++)
			cout << " ";   // 输出 N - 2 个空格
		cout << c << endl; // 输出最后一个 c
	}

	// 输出最后一行
	for (int i = 0; i < N; i++)
		cout << c;

	return 0;
}
