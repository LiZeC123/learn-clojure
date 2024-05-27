; 匿名函数
((fn [a b] (+ a b)) 1 2)

; 绑定
(def line [[0 0] [10 20]] )
(first line)

; 定义函数
(defn mmax [a b]
  (if (> a b) a b))

; defn实际上是一个宏, 等于def+fn
(def a-function 
  (fn [a b] (+ a b))
)

; 可变参数
(defn more-arg [x y & more] (+ x y))

; let形式
(let [ x 1, y  2, z (+ x y)] x)

; do 将多个调用依次执行
(do (do-Action-1) (do-action-2) (ret-value))

; 解构
(def board [ [:x :o :x] [:o :x :x] [:o :o :x]  ])
(defn center  [[_ [_ c _] _]] c)
(center board) ; 其实只是使用了函数的形式参数的能力而已


