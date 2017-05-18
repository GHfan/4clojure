(fn
  [f coll]
  (reduce #(assoc %1 (f %2) (conj (get %1 (f %2) []) %2)) {} coll))
