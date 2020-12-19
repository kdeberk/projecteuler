(ns projecteuler.10
  (:require [projecteuler.primes :refer [primes]]))

(loop [ps  (primes)
       sum 0]
  (let [p (first ps)]
    (if (< p 2000000)
      (recur (rest ps) (+ sum p))
      sum)))
