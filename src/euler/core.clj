(ns euler.core)

; Problem 1
(defn divisible-by [num divisor]
  (= (rem num divisor) 0))

(defn divisible-by-three-or-five [num]
  (or (divisible-by num 3) (divisible-by num 5)))

(defn natural-numbers [limit]
    (drop 1 (range limit)))

(defn sum-of-natural-numbers-divisible-by-three-or-five-up-to [limit]
    (apply + (filter divisible-by-three-or-five (natural-numbers limit))))

; Problem 2
(def fib-seq 
    ((fn rfib [a b] 
        (lazy-seq (cons a (rfib b (+ a b)))))
    0 1))

(defn fib-terms-up-to [limit]
  (take-while #(<= %1 limit) fib-seq))

(defn sum-of-even-fib-up-to [limit]
    (apply + (filter even? (fib-terms-up-to limit))))

; Problem 3
(defn square [n]
    (* n n))
    
(defn sum-of-squares [n]
    (apply + (map square (natural-numbers (+ n 1)))))

(defn sum-of-first [n]
    (apply + (natural-numbers (+ n 1))))
    
(defn square-of-sums [n]
    (square (sum-of-first n)))
    
(defn diff-sum-of-squares-and-square-of-sums [n]
    (- (square-of-sums n) (sum-of-squares n)))

;; Problem 25
;
;(defn length-of [term]
;    (.length (.toString term)))
;
;(defn over-thousand-digits? [term]
;    (>= (length-of term) 1000))
;
;(def index-fib (map vector (iterate inc 0) fib-seq))
;
;
;(def index-fib (map vector (iterate inc 0) fib-seq))
;
;(defn index-filter [pred coll] (when pred
;    (for [[idx elt] (index-fib coll) :when (pred elt)] idx)))
;    
;;(first (filter over-thousand-digits? fib-seq))
;;(println (some over-thousand-digits? fib-seq))
;;(take-while #(< (length-of(%1) 1000)))