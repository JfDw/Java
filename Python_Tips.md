# Python Tips
Python学习点滴

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

## 数据处理
1. nan和None的区别
NaN是Pandas中的数值类型，表示数据缺失，是一种float类型，可以参与数值运算（NaN与其他数值运算得到仍然是NaN），可以用pd.isnull()和pd.notnull()方法检测NaN；
而None是Python的一种特殊对象，表示不存在和空的对象，是一种不可变对象

2. is和==的区别
is表示同一个对象（同一个引用）
==表示值（内容）是否相同

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

设置FALSK为生产模式： `export FLASK_ENV=production`

【生产模式下，不要使用flask自带的WSGI服务器（`flask run`），而是应该使用专用的生产WSGI服务器，例如Waitress, Gunicorn, uWSGI等】
