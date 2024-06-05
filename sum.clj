(ns sum.core
    (:require [clojure.core.reducers :as r]))

(defn sum [numbers]
    (reduce + numbers))

(defn psum [numbers]
    (r/fold + numbers))

(def numbers (into [] (range 0 10000000)))


(println "sum")
(time (sum numbers))
(time (sum numbers))
(time (sum numbers))
(time (sum numbers))
(time (sum numbers))
(println )

(println "psum")
(time (psum numbers))
(time (psum numbers))
(time (psum numbers))
(time (psum numbers))
(time (psum numbers))