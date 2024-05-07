(defn size [v]
  (if (empty? v) 
    0
    (inc (size (rest v))))
  )

(println "Size is " (size [1 2 3 4]))