(println "Hello World!")

;----------------------------

(defn mcons [a b]
 (fn [f] (f a b) ))

(defn mcar [z]
  (z (fn [a _] a)))

(defn mcdr [z]
  (z (fn [_ b]b)))

(println (mcar (mcons 'a 'b)))