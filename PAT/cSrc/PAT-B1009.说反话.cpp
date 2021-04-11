#include<iostream>
#include<string.h>
#include<vector>
using namespace std;
int main()
{
    // 定义一个 Vector 动态数组
	vector<string> v;
	string str;
    // 输入字符串，末尾不能有空格
	getline(cin,str);
	string tmp="";
    // 用一个 for() 循环将字符串按空格分组
	for(int i=0;i<str.length();i++)
	{
		if(str[i]=='\n')
			break;
		if(str[i]!=' ')
			tmp += str[i];
		else
		{
			v.push_back(tmp);
			tmp="";
		}
	}
    // 将最后的的字符串装入动态数组
	v.push_back(tmp);
    // 倒序输出动态数组	
	for(int i=v.size()-1;i>=0;i--)
	{
		if(i!=0)
			cout<<v[i]<<" ";
		else
			cout<<v[i];
	}
	return 0;
}
