(ns basics-spec
  (:use [speclj.core])
  (:use [euler.core]))
  
(describe "Problem 1"
    (it "calculates up to 100"
        (should= 2318 (sum-of-natural-numbers-divisible-by-three-or-five-up-to 100) ))
        
    (it "calculates up to 1000"
        (should= 233168 (sum-of-natural-numbers-divisible-by-three-or-five-up-to 1000))))
        
(run-specs)
