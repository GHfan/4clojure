(fn f
  [p coll]
  (if (< (count coll) p)
    '()
    (cons (take p coll) (f p (drop p coll)))))
