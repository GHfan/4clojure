#(partition (/ (count %1) %2) (apply interleave (partition %2 %1)))


;; #(apply map list (partition-all %2 %1))
