reduce #(if (contains? (set %1) %2) %1 (conj %1 %2)) []
