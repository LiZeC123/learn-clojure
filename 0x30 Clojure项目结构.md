开发环境配置
------------------

Clojure常见的开发环境是vscode和IDEA. 两者都可以免费使用, 考虑到没有代码补全的情况下调用Java方法过于折磨, 因此推荐在编写简单脚本时使用vscode, 开发项目时使用IDEA.

vscode不需要安装插件即可支持基本的Clojure开发, 体验类似于写简单的Python脚本, 提供简单的语法高亮和代码补全.

IDEA需要安装Cursive插件, 安装完毕后重启IDEA即可选择Clojure项目. 在IDEA中, 依然支持Clojure语言的代码补全, 自动导入包等能力.



脚本方式运行Clojure
------------------------

当Clojure作为脚本语言执行时, 只需要使用`clojure -M xx.clj`即可运行该脚本. 

由于并没有代码补全能力, 因此如果使用了非默认导入的包, 则需要手动导入包名.



项目方式运行Clojure
--------------------

### 安装leiningen

leiningen是一个用于生成和管理Clojure项目的工具, 提供了项目初始化, 依赖导入, 项目编译和打包等能力, 基本上等于Java中的Maven.

可参考官网指引安装[leiningen](https://leiningen.org/), 也就是将对应的脚本下载到本地, 放入一个PATH变量中存在的路径.

保存后执行`lein self-install`安装此工具需要的依赖. 此操作需要环境中能执行java命令.


### 创建项目

执行`lein new xx`命令, 创建一个Clojure项目, 执行完毕后, 在IDEA中打开该项目. 

`lein`创建的项目结构与标准的maven项目结构没有明显区别, 在src路径下正常编写代码即可. 对于main函数所在文件需要进行如下的处理

```clojure
(ns demo3.core
  (:gen-class))


(defn -main [& args]
  (println "Hello World!"))
```

1. 在`ns`中需要使用`:gen-class`表明该文件需要生成一个Java的类, 否则无法在IDEA中运行程序
2. 声明一个`-main`函数, 该函数就相当于Java中的main函数

### 项目级配置

在`project.clj`中还需要增加如下的配置


```
:main demo3.core
:profiles {:uberjar {:aot :all}}
```

`:main`用于指定入口的main函数位置, 在生成jar时需要该属性. 

`:aot`指定预先编译(Ahead-Of-Time, AOT)所有的命名空间, 该操作有助于提升jar的运行速度, 并提前发现一些类型问题. 但是在开发过程中, 启用预先编译会消耗更多时间, 因此通常仅在生成uberjar时启用该特性.

### 修复依赖

默认情况下IDEA会下载一些依赖, 但由于网络原因可能会下载失败. 此时会在源码中产生许多告警. 此时可通过执行一次`lein`的指令修复此问题.

打开命令行执行`lein run`运行当前项目, 此过程中会下载对应的依赖, 从而修复告警问题.

### 打包

当Clojure作为项目执行时, 最后可使用lein进行打包, 执行

```
lein uberjar
```

生成一个包含了所有依赖的JAR文件, 之后可使用`java -jar`指令运行对应的jar.





