#! /usr/local/bin/clojure
(println "一些基本使用")

;; 基础操作与Scheme并无显著区别

(+ 1 2 3)
(/ 12 3 2)

;; 大于小于等符号也支持多个对象

(< 1 2 3) ;; true


(str 1  2 "3") ;; "123"
;; 由于单引号可表示引用, 因此字符串需要使用双引号


; 函数
(defn mmax [a b]
  (if (> a b) a b))

(println (mmax 10 9))

; 匿名函数
((fn [a b] (+ a b)) 1 2)

; 绑定
(def line [[0 0] [10 20]] )
(first line)

; 解构
(def board [ [:x :o :x] [:o :x :x] [:o :o :x]  ])
(defn center  [[_ [_ c _] _]] c)
(center board) ; 其实只是使用了函数的形式参数的能力而已

; 调用Java方法
(.length "123")
