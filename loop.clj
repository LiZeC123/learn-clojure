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