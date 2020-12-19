(ns projecteuler.4
  (:require [projecteuler.palindrome :refer [is-palindrome?]]))

(apply max (filter is-palindrome?
                   (for [i (range 111 999)
                         j (range 111 999)]
                     (* i j))))

