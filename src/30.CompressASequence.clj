(fn cs
  ([coll] (cs coll []))
  ([coll rs]
   (if (empty? coll)
     rs
     (if (= (first coll) (last rs))
       (recur (rest coll) rs)
       (recur (rest coll) (conj rs (first coll)))))))

;; reduce (fn [x y] (if (not= (last x) y) (conj x y) x)) []
