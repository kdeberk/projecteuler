(ns projecteuler.6)

(defn square [x]
  (* x x))

(defn sum-of-squares [n]
  (reduce + (map square (range 1 (inc n)))))

(defn square-of-sums [n]
  (square (reduce + (range 1 (inc n)))))

(let [n 100]
  (- (square-of-sums n) (sum-of-squares n)))
