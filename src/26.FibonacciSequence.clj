;; Write a function which returns the first X fibonacci numbers.

(= (#(loop [a 1 b 1 n 0 tmp []] (if (= n %) tmp (recur b (+ a b) (inc n) (conj tmp a)))) 3) '(1 1 2))

(= (#(loop [a 1 b 1 n 0 tmp []] (if (= n %) tmp (recur b (+ a b) (inc n) (conj tmp a)))) 6) '(1 1 2 3 5 8))

(= (#(loop [a 1 b 1 n 0 tmp []] (if (= n %) tmp (recur b (+ a b) (inc n) (conj tmp a)))) 8) '(1 1 2 3 5 8 13 21))

;; malvert's solution:
(fn [n]
  (take n
    (map first
      (iterate (fn [[cur prev]] [(+ cur prev) cur])
			 [1 0])
     )))

;; caterpillar's solution
(= (#(loop [i % tmp '(1 1)] (if (= i 2) (reverse tmp) (recur (dec i) (conj tmp (+ (first tmp) (second tmp)))))) 3) '(1 1 2))
