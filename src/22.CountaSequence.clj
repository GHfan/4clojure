;; Write a function which returns the total number of elements in a sequence.

(= ((fn [s] (loop [s s n 0] (if (empty? s) n (recur (rest s) (+ n 1))))) '(1 2 3 3 1)) 5)

(= ((fn [s] (loop [s s n 0] (if (empty? s) n (recur (rest s) (+ n 1))))) "Hello World") 11)

(= ((fn [s] (loop [s s n 0] (if (empty? s) n (recur (rest s) (+ n 1))))) [[1 2] [3 4] [5 6]]) 3)

(= ((fn [s] (loop [s s n 0] (if (empty? s) n (recur (rest s) (+ n 1))))) '(13)) 1)

(= ((fn [s] (loop [s s n 0] (if (empty? s) n (recur (rest s) (+ n 1))))) '(:a :b :c)) 3)

;; malvert's solution
(= (#(reduce + (map (constantly 1) %)) '(1 2 3 3 1)) 5)

;; zoltanjarai's solution
(= ((fn ! [s] (if (empty? s) 0 (+ 1 (! (rest s))))) '(1 2 3 3 1)) 5)
