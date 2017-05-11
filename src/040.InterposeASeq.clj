(fn [sep coll]
 (butlast (reduce #(conj %1 %2 sep) [] coll)))

;; #(rest (interleave (repeat %1) %2))
