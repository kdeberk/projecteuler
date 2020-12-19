(ns projecteuler.9)

(defn gcd [a b]
  (if (= b 0)
    a
    (recur b (mod a b))))

(loop [m 2 n 1 k 1]
  (let [a   (* k (- (* m m) (* n n)))
        b   (* 2 k m n)
        c   (* k (+ (* m m) (* n n)))
        sum (+ a b c)]
    (cond
      (< 1 (gcd m n)) (recur m (inc n) 1)
      (= 1000 sum)    (* a b c)
      (< sum 1000)    (recur m n (inc k))
      (= m (inc n))   (recur (inc m) 1 1)
      :else           (recur m (inc n) 1))))
