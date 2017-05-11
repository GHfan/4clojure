(fn [& colls] (reduce #(if (>= %1 %2) %1 %2) colls))
