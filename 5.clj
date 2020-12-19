(ns projecteuler.5)

(defn evenly-dividing [xs]
  (reduce (fn [factors x]
            (let [divided (reduce (fn [x factor]
                                    (if (= (mod x factor) 0)
                                      (/ x factor)
                                      x))
                                  x
                                  factors)]
              (if (< 1 divided)
                (conj factors divided)
                factors)))
          []
          xs))

(apply * (evenly-dividing (range 1 10)))
(apply * (evenly-dividing (range 1 20)))
