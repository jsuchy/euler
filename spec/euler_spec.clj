(ns basics-spec
  (:use [speclj.core])
  (:use [euler.core]))

(describe "Problem 1"
    (it "calculates up to 100"
        (should= 2318 (sum-of-natural-numbers-divisible-by-three-or-five-up-to 100) ))
        
    (it "calculates up to 1000"
        (should= 233168 (sum-of-natural-numbers-divisible-by-three-or-five-up-to 1000))))

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
    
(describe "Problem 6"
    (it "calculats sum of first 10 natural numbers"
        (should= 55 (sum-of-first 10)))
    (it "calculates sum of squares of 10"
        (should= 385 (sum-of-squares 10)))
    (it "calculates square of sums of 10"
        (should= 3025 (square-of-sums 10)))
    (it "calculates difference of sum of squares and square of sums of 10"
        (should= 2640 (diff-sum-of-squares-and-square-of-sums 10)))
    (it "calculates difference of sum of squares and square of sums of 100"
        (should= 25164150 (diff-sum-of-squares-and-square-of-sums 100)))
)
(run-specs)