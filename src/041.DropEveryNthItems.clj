(fn
  [coll xth]
    (mapcat #(if (= (count %) xth) (butlast %) %) (partition-all xth coll)))

;; #(mapcat (partial take (dec %2)) (partition-all %2 %1))
