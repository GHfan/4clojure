(fn
  [& funcs]
  (fn [& args]
   ;; apply need args to be in a collection, eg [& args]
   (first (reduce #(vector (apply %2 %1)) args (reverse funcs)))))


;; (fn myComp
;;   ([f] f)
;;   ([f1 f2]
;;    (fn[& args]
;;      (f1 (apply f2 args))))
;;   ([f1 f2 & fs]
;;    (apply myComp (myComp f1 f2) fs)))
