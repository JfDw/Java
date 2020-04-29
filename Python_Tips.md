# Python Tips
Python学习点滴

## 虚拟环境
1. 安装python虚拟环境
执行以下命令，将在当前路径下安装一个完整的python虚拟环境，python版本号，取决当前python的版本
`python -m virutalenv venv`
或者，按照官方推荐的`pipenv`工具（这里不讨论）
2. 激活虚拟环境
`source venv/bin/activate`
3. 安装依赖库
`pip install -r requirements.txt`

## 数据处理
1. nan和None的区别
NaN是Pandas中的数值类型，表示数据缺失，是一种float类型，可以参与数值运算（NaN与其他数值运算得到仍然是NaN），可以用pd.isnull()和pd.notnull()方法检测NaN；
而None是Python的一种特殊对象，表示不存在和空的对象，是一种不可变对象

2. is和==的区别
is表示同一个对象（同一个引用）
==表示值（内容）是否相同
