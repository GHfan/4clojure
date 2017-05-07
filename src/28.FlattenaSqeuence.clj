;; Write a function which flattens a sequence.
;; Sepcial Restrictions: flatten

(defn f
  ([coll] (ft coll []))
  ([coll target]
   (if (empty? coll)
     (seq target)
     (let [left (first coll)
           right (rest coll)
           new-target (if (sequential? left)
                        (apply conj target (f left))
                        (conj target left))]
       (f right new-target))))
  )

(= (f '((1 2) 3 [4 [5 6]])) '(1 2 3 4 5 6))

(= (f ["a" ["b"] "c"]) '("a" "b" "c"))

(= (f '((((:a))))) '(:a))
