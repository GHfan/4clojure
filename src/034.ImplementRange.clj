#(loop [s %1 e %2 r []]
  (if (= s e)
   r
   (recur (inc s) e (conj r s))))


;;(fn [lower upper]
;;  (take-while #(< % upper)
;;      (iterate inc lower)))
