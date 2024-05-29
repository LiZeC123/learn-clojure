(println "Hello World!")


; 打印一个符号的文档
(doc +)

; 根据关键词模糊查找文档
(find-doc "lazy")

; 模糊查找函数
(apropos 'doc)

;----------------------------

(defn mcons [a b]
 (fn [f] (f a b) ))

(defn mcar [z]
  (z (fn [a _] a)))

(defn mcdr [z]
  (z (fn [_ b]b)))

(println (mcar (mcons 'a 'b)))