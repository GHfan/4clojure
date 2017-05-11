(fn
  [coll times]
    (mapcat #(repeat times %) coll))

;; #(mapcat (fn [x] (repeat %2 x)) %1)

;; #(apply interleave (repeat %2 %1))        ;; only in 1.6.0 or greater.
