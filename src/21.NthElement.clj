;; Write a function which returns the Nth element from a sequence.

(= (#(first (subvec (vec %1) %2 (+ 1 %2))) '(4 5 6 7) 2) 6)

(= (#(first (subvec (vec %1) %2 (+ 1 %2))) [:a :b :c] 0) :a)

(= (#(first (subvec (vec %1) %2 (+ 1 %2))) [1 2 3 4] 1) 2)

(= (#(first (subvec (vec %1) %2 (+ 1 %2))) '([1 2] [3 4] [5 6]) 2) [5 6])

;; caterpillar's solution
(= (#(first (drop %2 %1)) '(4 5 6 7) 2) 6)

;; malvert's solution
(= ((fn [seq n]
     (if (= n 0) (first seq)
		   (recur (rest seq) (dec n))))
   '(4 5 6 7) 2) 6)
