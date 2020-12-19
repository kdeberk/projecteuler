(ns projecteuler.7
  (:require [projecteuler.primes :refer [primes]]))

(last (take 10001 (primes)))
