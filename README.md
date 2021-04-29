# KO--CSP
### 0、前言

本项目也是创立[OS-EDU](https://github.com/OS-EDU) 的起点，主要用于更新有关大学生本科阶段所常见的考试题目讲解，例如PAT、CCF的CSP认证之类的以及计算机专业研究生复试上机题目之类的。通常这类题目的平均难度要低于leetcode、牛客网等出现的题目，所以对于新手朋友们比较友好。也算是可以从零开始，从而可以克服面对刷题的心理阴影吧。

---

### 1、题解列表
[1.PAT-B1001.害死人不偿命的(3*n +1)猜想](https://os-edu.github.io/posts/b1001/)

[2.PAT-B1046.划拳](https://os-edu.github.io/posts/b1046/)

[3.PAT-B1008.数组元素循环右移问题](https://os-edu.github.io/posts/pat_b1008/)

[4.PAT-B1011.A+B和C](https://os-edu.github.io/posts/pat_b1011/)

[5.PAT-B1012.数字分类](https://os-edu.github.io/posts/pat_b1012/)

[6.PAT-B1004.成绩排名](https://os-edu.github.io/posts/pat-b1004/)

[7.PAT-B1041.考试座位号](https://os-edu.github.io/posts/pat-b1041/)

[8.PAT-B1010.一元多项式求导](https://os-edu.github.io/posts/pat-b1010/)

[9.PAT-A1042.ShufflingMachine](https://os-edu.github.io/posts/pat-a1042/)

[10.PAT-B1018.锤子剪刀布](https://os-edu.github.io/posts/pat_b1018/)

[11.PAT-B1016.部分A+B](https://os-edu.github.io/posts/pat-b1016/)

[12.PAT-B1028.人口普查](https://os-edu.github.io/posts/pat-b1028/)

[13.PAT-B1032.挖掘机技术哪家强](https://os-edu.github.io/posts/pat-b1032.%E6%8C%96%E6%8E%98%E6%9C%BA%E6%8A%80%E6%9C%AF%E5%93%AA%E5%AE%B6%E5%BC%BA/)

[14.PAT-B1022.D进制的A+B](https://os-edu.github.io/posts/pat-b1022.d-%E8%BF%9B%E5%88%B6%E7%9A%84-a-+-b/)

[15.PAT-B1030.完美数列](https://os-edu.github.io/posts/pat-a1030.%E5%AE%8C%E7%BE%8E%E6%95%B0%E5%88%97/)

[16.PAT-B1036.跟奥巴马一起编程](https://os-edu.github.io/posts/pat-b1036.%E8%B7%9F%E5%A5%A5%E5%B7%B4%E9%A9%AC%E4%B8%80%E8%B5%B7%E7%BC%96%E7%A8%8B/)

[17.PAT-B1009.说反话](https://os-edu.github.io/posts/pat-b1009.%E8%AF%B4%E5%8F%8D%E8%AF%9D/)


---

### 2、参与指南

如果您有好的想法以及意见，欢迎来提交pr，主要包括而不限于增加题目、题目解法、题目解析等。

#### ①增加题目

如果您发现有较好的题目，或者是比较在准备这类的考试时所遇见的都可以提交该题目的描述文件至[题目描述](https://github.com/OS-EDU/KO--CSP/tree/main/%E9%A2%98%E7%9B%AE%E6%8F%8F%E8%BF%B0) 这个目录，建议为markdown文件。

**格式要求如下：**

```markdown
# 题目编号（题目名称）
### 题目描述：
（题目描述的主干信息）
### 输入格式：
（题目要求的输入格式）
### 输出格式：
（题目要求的输出格式）
### 输入样例：
​```
（输入样例）
### 输出样例：
​```
（输出样例）
```

建议在提交pr之前，需要注意的是：

-    可以先添加一个标签为`add questions`的issue，如果确认没问题之后，可以提交与之相关的pr；

-    避免提交重复的pr，在提交之前搜索现有的 pr。
-    确定 pr的类型，并在标题或内容中标明。

#### ②题目解法

##### [a. 认领 issue](https://github.com/OS-EDU/KO--CSP/issues)

所有的题目都会建立一个对应的issue，可以选择在 [Issue 列表](https://github.com/Practice-Dream/KO--CSP/issues) 中挑选任务，然后在该 `issue` 下回复一下自己简单的解题思路，表明你将认领该 issue，如果发现issue已被认领或者closed，但是还有不同的解法，可以自己new issue，issue的标题要表明对应的题目编号。

#### [b.提交pr](https://github.com/Practice-Dream/KO--CSP/pulls)

现在题解语言主要为C和Java，如果以上编程语言不是你所擅长的，可以选择自己所喜欢的编程语言，然后在相对应的位置建立文件夹，例如C对应 csource，可以以此类推，Java所对应的文件在src下。

在提交的时候，需要添加对应的标签`solution` 。

**格式要求如下：**

以Java语言提交为例：main函数下主要用于提交测试案例，不放置题目的任何具体解法；所有对应的解法添加至改题目对应的solution类中。可以在自己的解题方法中留下自己的名字哦！

---

#### ③题目解析

题目的解析会以[博客](https://os-edu.github.io/)的形式呈现出来，所以如果之前你已经pr了题目的解法，那么你可以选择在博客中添加一下具体的解题思路以及代码分析，这样可以更有利于读者理解你的解法。

博客是基于[hugo](https://github.com/gohugoio/hugo) 搭建的，可以对markdown文件直接渲染成静态网页。如果你对此还不了解的话，建议先了解一下具体操作，再上手实践。
