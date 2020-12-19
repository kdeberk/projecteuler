(ns projecteuler.palindrome)

(defn is-palindrome? [x]
  (loop [x x
         i (int (Math/pow 10 (Math/floor (Math/log10 x))))]
    (cond
      (< x 10)
      true
      (= (int (/ x i)) (mod x 10))
      (recur (int (/ (mod x i) 10)) (/ i 100))
      :else
      false)))
