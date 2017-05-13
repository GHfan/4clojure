(fn sr
  ([f coll]
   (sr f (first coll) (rest coll)))
  ([f v coll]
   (lazy-seq
    (if (empty? coll)
     (vector v)
     (cons v (sr f (f v (first coll)) (rest coll)))))))

;; (fn [a b & [c]]
;;   (let [r (if (nil? c) b (cons b c))]
;;     (map
;;       #(reduce a (take % r))
;;       (map #(+ 1 %2) r (range)))))
