(fn [f x] (reductions #(%2 %1) x (repeat f)))


;; (fn ! [f x] (cons x (lazy-seq (! f (f x)))))
;; #(reductions (comp %1 (fn [a _] a)) %2 (range))
