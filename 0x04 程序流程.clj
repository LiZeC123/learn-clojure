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

; while语句
(while (> x 4) 
  (println x)
  (println "x")
  x)


; 逻辑函数, 支持 and, or, not
; Clojure中仅false与nil视为逻辑假, 其余值均视为逻辑真
; 逻辑函数具有短路特性并返回最有一个处理的值
; 例如对于and, 要么返回最有一个值, 要么中途遇到nil或者false, 从而返回nil或false

(and :a :b :c) ; => :c
(and :a nil :c); => nil



; loop与recur
; loop的第一个参数是绑定列表, 将给定的符号绑定到给定的值
; 因此初始时 current绑定到n, fact绑定到1
; 后续再recur中, 再次进行绑定
; 由于Clojure不能自动优化尾递归, 因此只能采取这种方式
(defn fact-loop [n]
  (loop [current n fact 1]
    (if (= current 1)
      fact
      (recur (dec current) (* fact current) ) )))


; doseq和dotimes
; 两种简化循环的宏
(doseq [user all-users]
  (run-xxx user))

(dotimes [x 5]
  (println "x is" x))


; 列表操作
(every? number? [1 2 3 :four])

(filter (fn [x] (> x 4)) [1, 2, 3, 4, 5])

(map (fn [x] (* x x)) [1 2 3])

; 列表解析
; for关键字只用于列表解析, 而不是其他语言中的循环
(def color ["red" "blue"])
(for [x color] (str "I like " x))

; 串行宏
; 对于复杂表达式, 需要多层嵌套, 因此书写不方便, 可使用串行宏
(defn final-amount-> [principle rate time]
  (-> rate
    (/ 100)
    (+ 1)
    (Math/pow time)
    (* principle)))
; -> 将上一个表达式放到下一个表达式的第一个参数的位置, 因此上面的表达式等价于
(* (Math/pow (+ (/ rate 100) 1) time) principle)

; ->> 与 -> 类似, 但将上一个表达式放大下一个表达式最后一个参数的位置
; 此外还支持更复杂的任意位置串行 as-> 和条件串行 cond->