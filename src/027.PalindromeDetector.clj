;; Write a function which returns true if the given sequence is a palindrome.
;; Hint: "racecar" does not equal '(\r \a \c \e \c \a \r)

(false? (#(= (seq %) (reverse %)) '(1 2 3 4 5)))

(true? (#(= (seq %) (reverse %)) "racecar"))

(true? (#(= (seq %) (reverse %)) [:foo :bar :foo]))

(true? (#(= (seq %) (reverse %)) '(1 1 3 3 1 1)))

(false? (#(= (seq %) (reverse %)) '(:a :b :c)))
