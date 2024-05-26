; 列表, 类似于链表实现
(list 1 2 3)
'(1 2 3)

(def listA '(1 2 3 4))  ; 使用单引号, 表示给定的是数据, 而不是一个表达式
(first listA)
(last listA)
(rest listA)
(conj 6 listA)


; ------------------------------------------------------------------------

; 将列表视为栈使用
(peek listA) ; 返回第一个元素
(pop listA) ; 相当于rest

; 向量, 类似于数组实现
[1 2 3]
(vector 1 2 3)

(def vectorA [1 2 3]) ; 方括号本身说明了后续内容是数据, 因此不需要使用单引号
(get vectorA 2) ; 获得第二个元素, 如果越界返回nil
(nth vectorA 2) ; 获取第二个元素, 如果越界抛出异常

(assoc vectorA 2 23) ; 将指定位置进行替换, 返回修改后的新向量

(vectorA 2) ; 向量本身可以作为一个函数, 返回给定位置的数据


; ------------------------------------------------------------------------

;; 哈希表, 逗号在任何时候都视为空格, 仅用于增加可读性
{:a 1, :b 2}
(def the-map {:a 1, :b 2})
(the-map :a)    ; 哈希表本身也是函数, 可用于查找值
(:a the-map)    ; 也可以反过来调用, 效果一样

;; 集合
#{:a :b :c}

; 嵌套的映射操作
(def users {:ggboy {
    :date "2013-04-05",
    :summary {
        :average {
            :monthly 1000,
            :yearly 12000,
        }
    }
}})

(assoc-in users [:ggboy :summary : average : monthly] 2000) ; 设置嵌套层次的数据, 并返回新的结构
(get-in users [:ggboy :summary :average :monthly])          ; 获取嵌套层次的数据
(update-in users [:ggboy :summary :average :monthly] + 500) ; 在指定的位置执行给定的函数, 原地更新数据