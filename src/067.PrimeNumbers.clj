(fn
  [n]
  (take
   n 
   (filter 
    (fn [x] (nil? (some #(= 0 (mod x %)) (range 2 (Math/sqrt (inc n)))))) 
    (drop 2 (range)))))



;; https://zh.wikipedia.org/wiki/%E5%9F%83%E6%8B%89%E6%89%98%E6%96%AF%E7%89%B9%E5%B0%BC%E7%AD%9B%E6%B3%95
;; #(loop[result [], ind 0, remaining (drop 2 (range))];(drop 2 (range)) represents 2, 3, .... to infinite
;;    (let[primeNum (first remaining)];take out the new prime number
;;      (if (= ind %) result
;;        (recur (conj result primeNum) (inc ind) (remove (fn[x] (= 0 (rem x primeNum))) remaining)))));take out of the multiples

