(fn sp
  ([p c1] (sp p c1 []))
  ([p c1 c2]
   (if (= (count c2) p)
     [c2 c1]
     (recur p (rest c1) (conj c2 (first c1))))))

;; (fn [n s]
;;   [(take n s) (drop n s)])
