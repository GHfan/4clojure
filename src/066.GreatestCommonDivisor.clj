#(loop [cd 1 i 1]
   (if (= i (max %1 %2))
     cd
     (recur (if (and (= 0 (mod %1 i)) (= 0 (mod %2 i))) i cd) (inc i))))


;; #(if (= %1 0) %2 (recur (mod %2 %1) %1))

;; (fn gcd [a b]
;;   (cond
;;    (= a b) a
;;    (> a b) (recur (- a b) b)
;;    :else (recur a (- b a))))
