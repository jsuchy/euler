(ns basics-spec
  (:use [speclj.core])
  (:use [euler.core]))

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