; 布尔类型有三种, 除了false和nil其他任何事均可视为true(当然也包括数字0)
(= true false nil)

; 字符串就是Java的String类
(.contains "hello" "he")

; 整数默认为long类型, 使用N后缀创建BigInt, 支持分数
(+ 41 21N 2/3)

; 使用单引号创建一个符号, 使用冒号创建一个关键字
; 关键字就是一个指向自身的符号
'Hello
:apple