开发环境配置
------------------

Clojure常见的开发环境是vscode和IDEA. 两者都可以免费使用, 考虑到没有代码补全的情况下写Java过于折磨, 因此优先推荐在IDEA中进行配置.

在IDEA中安装Cursive插件, 安装完毕后重启IDEA. 

安装[leiningen](https://leiningen.org/), 此工具用于生成和运行Clojure项目. 该文件需要在命令行中全局可用, 随便在一个PATH变量中存在的路径放进去就行了.

`leiningen`实际是一个脚本文件, 保存后执行`lein self-install`安装对应的依赖包. 此操作依赖Java, 环境中需要能执行java命令.

执行`lein new xx`命令, 创建一个Clojure项目, 在IDEA中打开该项目. 随便写一个main函数, 例如

```clojure
(defn -main [& args]
      (println "Hello, World!"))
```

执行`lein run`命令, 运行当前项目. 运行之前会下载一些依赖. 依赖下载完毕就会运行当前项目配置的main函数.

> 缺少依赖时IDEA可能会在源码中产生许多告警. 依赖下载完毕后这些告警就会消失



运行方式
-----------------

Clojure有两种运行方式, 第一种是作为脚本语言执行, 第二种是作为Java项目执行.

当Clojure作为脚本语言执行时, 只需要使用`clojure xx.clj`即可运行该脚本

---------------

当Clojure作为项目执行时, 需要使用lein进行打包, 执行

```
lein uberjar
```

生成一个包含了所有依赖的JAR文件, 之后可使用`java -jar`指令运行对应的jar.

注意, 需要在项目文件中指定`:main xx`和`:aot :all`, 并且在main函数对应的文件中进行如下声明

```
(ns xx.xx
  (:gen-class))
```




