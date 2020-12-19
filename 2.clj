(ns projecteuler.2)

;; Linear
(loop [sum 0 a 0 b 1]
  (cond (<= 4000000 a) sum
        (even? a)      (recur (+ sum a) b (+ a b))
        :default       (recur sum b (+ a b))))

;; Golden ratio
;; Ratio between two even fibonacci numbers is approx. phi^3
;; - distance between even numbers in fib is 3
;; - ratio between two consecutive fibonacci numbers is phi
;;   lim_{n->inf} fib(n+1)/fib(n) = L
;;   lim_{n->inf} (fib(n)+fib(n+1))/fib(n) = 1+1/L
;;     L = 1+1/L
;;   L^2 = L+1
;;     0 = L^2 - L - 1
;;     L = (1+sqrt(5))/2 = phi
(let [phi    (/ (+ (Math/sqrt 5) 1) 2)
      phi**3 (Math/pow phi 3)]
  (loop [sum 0 a 2]
    (if (<= 4000000 a)
      sum
      (recur (+ sum a) (int (Math/round (* a phi**3)))))))
