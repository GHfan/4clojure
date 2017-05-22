(fn [f & colls]
  (reduce (fn [m1 m2]
            (reduce (fn [m [k v]]
                       (if (contains? m k)
                         (assoc m k (f (m k) v))
                         (assoc m k v))) m1 m2)) 
          {} colls))

;; (fn [f & a]
;;   (into {}
;;     (map 
;;       (fn [k] [k (reduce f (keep #(% k) a))])
;;       (keys (apply merge a)))))
