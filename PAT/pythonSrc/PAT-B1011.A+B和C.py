n = int(input()) #测试数据组数
i = 1	#记录循环次数
while i <= n:
	a, b, c = map(int, input().split())
	print("Case #%d: "%i, end="")
	if a + b > c:
		print("true")
	else:
		print("false")
	i += 1