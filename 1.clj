(ns projecteuler.1)

;; Easy
(- (+ (reduce + (range 3 1000 3))
      (reduce + (range 5 1000 5)))
   (reduce + (range 15 1000 15)))

;; Gaussian
(letfn [(sum-of-multiples [step max]
          (let [max (* (int (/ (dec max) step)) step)]
            (* (+ step max) (/ max step 2))))]
  (- (+ (sum-of-multiples 3 1000)
        (sum-of-multiples 5 1000))
     (sum-of-multiples 15 1000)))

;; Triangular numbers
(letfn [(sum-of-multiples [step max]
          (let [max (* (int (/ (dec max) step)) step)]
            (/ (* max (+ max step)) step 2)))]
  (- (+ (sum-of-multiples 3 1000)
        (sum-of-multiples 5 1000))
     (sum-of-multiples 15 1000)))
