;; Write a function which returns the second to last element from a sequence.

(= (#(nth % (- (count %) 2)) (list 1 2 3 4 5)) 4)

(= (#(nth % (- (count %) 2)) ["a" "b" "c"]) "b")

(= (#(nth % (- (count %) 2)) [[1 2] [3 4]]) [1 2])
