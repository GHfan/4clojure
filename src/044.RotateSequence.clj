#(let [t (split-at (mod %1 (count %2)) %2)]
   (concat (last t) (first t)))


;;(fn [n s]
;;  (let [m (mod n (count s))]
;;      (concat (drop m s) (take m s))))
