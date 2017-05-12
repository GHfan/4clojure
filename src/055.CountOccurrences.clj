reduce #(if (contains? %1 %2) (update-in %1 [%2] inc) (conj %1 {%2 1})) {}

;; reduce #(if (contains? %1 %2) (update %1 %2 inc) (conj %1 {%2 1})) {}  ;; only above 1.8.0
;; reduce (fn [a x] (assoc a x (inc (get a x 0)))) {}
