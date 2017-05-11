(fn [sq] (clojure.string/join (filter #(Character/isUpperCase %) sq)))

;; #(apply str (re-seq #"[A-Z]" %))
