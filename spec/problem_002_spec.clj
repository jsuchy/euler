(ns basics-spec
  (:use [speclj.core])
  (:use [euler.core]))

(describe "Problem 2"
    (it "calculates sum of even fib terms up to 3"
        (should= 2 (sum-of-even-fib-up-to 3)))
    (it "calculates sum of even fib terms up to 8"
        (should= 10 (sum-of-even-fib-up-to 8)))
    (it "calculates sum of even fib terms up to 34"
        (should= 44 (sum-of-even-fib-up-to 34)))
    (it "calculates sum of even fib terms up to 4 million"
        (should= 4613732 (sum-of-even-fib-up-to 4000000)))
    )
(run-specs)