;; Write a function which returns the last element in a sequence.

(= (#(nth % (- (count %) 1)) [1 2 3 4 5]) 5)

(= (#(nth % (- (count %) 1)) '(5 4 3)) 3)

(= (#(nth % (- (count %) 1)) ["b" "c" "d"]) "d")

;; malvert's solution
(= ((comp first reverse) [1 2 3 4 5]) 5)
