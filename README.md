Clojure学习库
=========================


使用Github Codespace构建环境
-------------------------------

首先执行当前仓库的如下指令, 安装Clojure

```
sudo ./linux-install.sh
```

> 脚本来自Clojure官网, 使用该脚本以root权限安装Clojure环境

然后执行如下脚本安装Jupyter环境

```
./install-lab.sh
```





Clojure是一种运行在JVM上的Lisp方言. Clojure语言因此在语法上与Scheme有较多的相似性, 同时又可以充分利用Java生态中的各类工具.


基础语法
---------------

Clojure的基础语法基本上可以认为和Scheme一致, 以下是一些常用的 Clojure 基本关键字及其描述：

| 关键字          | 描述                                               |
|-----------------|----------------------------------------------------|
| quote           | 返回其参数未求值的表示形式。                         |
| eval            | 求值一个表达式。                                     |
| lazy-seq        | 创建一个惰性序列。                                   |
| deref/@         | 解引用，获取 Ref、Agent 和 Atom 的当前值。           |
| ref             | 创建一个 Ref 类型对象。                              |
| agent           | 创建一个 Agent 对象。                                |
| atom            | 创建一个 Atom 类型对象。                             |
| alter           | 改变 Ref 对象的值。                                  |
| swap!           | 改变 Atom 对象的值。                                 |
| send            | 通过 Agent 发送一个任务。                            |
| ns              | 声明一个命名空间。                                   |
| require         | 在当前命名空间导入另一个模块的符号。                 |
| import          | 导入 Java 类。                                       |
| new             | 创建一个 Java 对象。                                  |
| .               | 调用 Java 的实例方法。                               |
| ..              | 在一个 Java 对象上连续调用方法。                      |
| doto            | 为一个 Java 对象连续调用方法，返回原始对象。         |
