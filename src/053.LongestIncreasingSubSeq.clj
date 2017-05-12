(fn !
  ([coll] (! coll []))
  ([c1 c2]
   (if (empty? c1)
     (reduce #(if (>= (count %1) (count %2)) %1 %2) [] (filter #(>= (count %) 2) c2))
     (recur (rest c1) (conj c2 (map first (take-while #(= (first %1) (second %1)) (map vector c1 (take (count c1) (iterate inc (first c1)))))))))))



;; (fn [q]
;;   (apply max-key count []
;;          (reverse
;;           (filter
;;            #(apply < %)
;;            (for [x (range (count q))
;;                  y (range (+ 2 x) (+ 1 (count q)))]
;;              (subvec q x y))))))
