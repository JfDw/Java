# Python Tips
Python学习点滴

[TOC]

## Module
import之后，可以根据`module_name.__file__`查看该module的文件路径

`import`会查找以下三个地方：
- 当前路径
- `pythonpath`
- python的安装路径

可以用`sys.path`查看当前的import路径有哪些

## import的原理
- import <module_name>
- from <module_name> import <name(s)>
- from <module_name> import <name> as <alt_name>
- import <module_name> as <alt_name>
  
 一个小技巧，检查module是否存在：
 ```python
 try:
...     # Non-existent module
...     import def
... except ImportError:
...     print('Module not found')
 ```

## 查看函数的汇编代码
```python
import dis
dis.dis(function_name)
```

## 多线程multiprocessing
multiprocessing模块在linux和windows系统中的行为不一致，要务必注意，在window系统中，只能在`if __name__ == '__main__'`之后创建子进程

可参考：https://segmentfault.com/a/1190000013681586

## 虚拟环境
1. 安装python虚拟环境
执行以下命令，将在当前路径下安装一个完整的python虚拟环境，python版本号，取决当前python的版本
`python -m virutalenv venv`
或者，按照官方推荐的`pipenv`工具（这里不讨论）
2. 激活虚拟环境
`source venv/bin/activate`
3. 安装依赖库
`pip install -r requirements.txt`

## nan和None的区别
NaN是Pandas中的数值类型，表示数据缺失，是一种float类型，可以参与数值运算（NaN与其他数值运算得到仍然是NaN），可以用pd.isnull()和pd.notnull()方法检测NaN；
而None是Python的一种特殊对象，表示不存在和空的对象，是一种不可变对象

## is和==的区别
可以参考`https://stackoverflow.com/questions/3257919/what-is-the-difference-between-is-none-and-none/3257957#3257957`上的讨论

以下说法是不恰当的：
```python
is表示同一个对象（同一个引用）
==表示值（内容）是否相同
```
可以这样理解：is直接比较两者的引用（整数比较），而==则要调用__eq__操作符（这也意味着可重载），执行更加复杂的比较逻辑

- `is None` 比 `== None`快50%：` >>> timeit.Timer('None is None').timeit() | 0.225 | >>> timeit.Timer('None == None').timeit() | 0.328`

PEP8的建议：
`Comparisons to singletons like None should always be done with 'is' or 'is not', never the equality operators.`
而None是singleton，则建议使用is和is not来判空，而不应该是等号

## 日志系统

**Do not get logger at the module level unless disable_existing_loggers is False**

**最差实践**：创建一个全局logger，然后各个模块共用这个logger

**最佳实践**：不要创建全局logger，而是在启动时设置logging相关配置，然后哪里需要哪里创建logger

原因是：logging.config.fileConfig()默认入参disable_existing_loggers=True，这样会将现有logger都失效掉，所有其他模块的logger配置都清空了，不能打印出日志

1. 日志中要打印traceback调用栈：
`logger.error('Failed to open file', exc_info=True)` 
设置exc_info=True可以在日志中打印调用栈


## Requirements.txt
有两种方式自动生成requirements.txt，方便用于安装：

1. pip freeze 

这种方式会将虚拟环境中的所有库都列在requirements.txt中，包括不需要的库

2. pipreqs

只导出所需要的库到requirements.txt中，使用命令如下：

`pipreqs.exe .\dataloader\ --encoding='utf-8' --pypi-server http://cmc-cd-mirror.rnd.huawei.com/pypi/simple/ --force `

或者 

`pipreqs.exe .\dataloader\ --encoding='utf-8' --use-local --force `

## Flask

### 启动Flask App
- 设置环境变量：FLASK_APP
Linux: `export FLASK_APP=hellp.py`; Windows: `set FLASK_APP=hellp.py`; Windows_Powershell:`$env:FALSK_APP=hellp.py`
- 启动Flask：`python -m flask run`

设置FALSK为开发模式： `export FLASK_ENV=development`
【在开发者模式下，只有本机才可以访问服务，而其他机器不行，这是开发模式的缺省设置，可以在命令行加上`--host=0.0.0.0`即可：`flask run --host=0.0.0.0`】

设置FALSK为生产模式： `export FLASK_ENV=production`

【生产模式下，不要使用flask自带的WSGI服务器（`flask run`），而是应该使用专用的生产WSGI服务器，例如Waitress, Gunicorn, uWSGI等】
### 生产环境上启动Flask
```python
if __name__ == "__main__":
    from waitress import serve
    serve(app, host="0.0.0.0", port=8080)
```
或者使用命令行：
```shell
$ waitress-serve --call 'flaskr:create_app'
Serving on http://0.0.0.0:8080
```

## import
可以被import的对象：
- 模块文件（通常时.py文件，可以作为模块的文件类型有.py、.pyo、.pyc、.pyd、.so、.dll）
- C或C++扩展（已编译为共享库或DLL文件）
- 包（包括多个模块）
- 内建模块（使用C编写并已连接到python解释器中）

在导入模块时，解释器做以下工作：

- 已导入模块的名称创建新的命名空间，通过该命名空间就可以访问导入模块的属性和方法。
- 在新创建的命名空间中执行源代码文件。
- 创建一个名为源代码文件的对象，该对象引用模块的名字空间，这样就可以通过这个对象访问模块中的函数及变量

import 语句可以在程序的任何位置使用，你可以在程序中多次导入同一个模块，但模块中的代码仅仅在该模块被首次导入时执行。后面的import语句只是简单的创建一个到模块名字空间的引用而已。

**import时，解释器会按照`sys.path`列表中的目录顺序查找导入文件**

**sys.modules字典中保存着所有被导入模块的模块名到模块对象的映射**

### `.pyc`和`.pyo`文件
.py文件的汇编,只有在import语句执行时进行，当.py文件第一次被导入时，它会被汇编为字节代码，并将字节码写入同名的.pyc文件中。后来每次导入操作都会直接执行.pyc 文件（当.py文件的修改时间发生改变，这样会生成新的.pyc文件），在解释器使用-O选项时，将使用同名的.pyo文件，这个文件去掉了断言（assert）、断行号以及其他调试信息，体积更小，运行更快。（使用-OO选项，生成的.pyo文件会忽略文档信息）


## `__init__.py`的作用
- 作为Python中的包（Package）标识，包是包含python模块（module）的文件夹，一个模块为一个py文件，里面定义了函数和类，包相当于多个模块的父节点。当文件夹下有`__init__.py`文件时，表示当前文佳佳时一个python包，其下的模块都可以通过这个包引入代码中。
- `__init__.py`文件可以为空，但是如果要使用 `from package1 import *`这种写法，需要在`__init__.py`中定义`__all__`：`__all__ = ['file1', 'file2']`
- `__init__.py`中也可以中导入其他的包或者模块（当导入一个包时，实际上导入它的`__init__.py`文件），导入包的时候，会自动执行`__init__.py`中的代码
