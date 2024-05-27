#! /usr/local/bin/clojure
(println "一些基本使用")

;; 基础操作与Scheme并无显著区别

(+ 1 2 3)
(/ 12 3 2)

;; 大于小于等符号也支持多个对象

(< 1 2 3) ;; true


(str 1  2 "3") ;; "123"
;; 由于单引号可表示引用, 因此字符串需要使用双引号

(defn size [v]
  (if (empty? v) 
    0
    (inc (size (rest v))))
  )

(println "Size is " (size [1 2 3 4]))




; 列表操作
(every? number? [1 2 3 :four])

(filter (fn [x] (> x 4)) [1, 2, 3, 4, 5])

(map (fn [x] (* x x)) [1 2 3])



; 列表解析
(def color ["red" "blue"])
(for [x color] (str "I like " x))


; 有穷序列与无穷序列

(range 1 10)

(take 5 (drop 2 (cycle [:i :love :clj])))
(->> [:i :love :clj] (cycle) (drop 2) (take 5))