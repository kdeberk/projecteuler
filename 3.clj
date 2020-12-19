(ns projecteuler.3
  (:require [projecteuler.primes :refer [primes]]))

(defn largest-prime-factor [c]
  (loop [c c ps (primes)]
    (let [p (first ps)]
      (cond (< (Math/sqrt c) p) c
            (= 0 (mod c p))     (recur (/ c p) ps)
            :else               (recur c (next ps))))))

(largest-prime-factor 600851475143)
