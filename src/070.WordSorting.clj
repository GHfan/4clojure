(fn [s] (sort-by #(clojure.string/lower-case %) (clojure.string/split (apply str (drop-last s)) #" ")))

(;; fn [s] 
 ;;  (sort-by #(.toLowerCase %) 
 ;;    (.split s "[ .!]")))
