; if 
(if (> 2 3) 3 4)
(if-not (> 3 2 ) 4 5)

; cond 相当于switch case
(def x 1)
(cond 
  (> x 0) "greater"
  (= x 0) "equal"
  :default "lesser"
)


; when 等于if + do, 条件满足时执行多个语句
; when也有相反的 when-not 形式
(when (> x 5)
  (println "A")
  (println "B")
  "done"
)



; 逻辑函数, 支持 and, or, not
; Clojure中仅false与nil视为逻辑假, 其余值均视为逻辑真
; 逻辑函数具有短路特性并返回最有一个处理的值
; 例如对于and, 要么返回最有一个值, 要么中途遇到nil或者false, 从而返回nil或false

(and :a :b :c) ; => :c
(and :a nil :c); => nil