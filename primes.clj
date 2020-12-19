(ns projecteuler.primes)

(defn primes []
  (letfn [(reinsert [table d prime]
            (update table (+ prime d) conj prime))
          (primes-step [table d]
            (if-let [factors (table d)]
              ;; Composite
              (recur (reduce #(reinsert %1 d %2) (dissoc table d) factors) (inc d))
              ;; Prime
              (lazy-seq (cons d (primes-step (assoc table (* d d) (list d)) (inc d))))))]
    (primes-step {} 2)))
