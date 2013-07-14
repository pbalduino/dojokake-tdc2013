(ns kake.core)

(defn foo
  "I don't do a whole lot."
  [x]
  (println x "Hello, World!"))

(defn umadupla? [mao]
  (= 4 (count (group-by first mao)))
  )

(defn duasduplas? [mao]
  (= 3 (count (group-by first mao)))
  )