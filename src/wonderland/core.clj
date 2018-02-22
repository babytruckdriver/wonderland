(ns wonderland.core)

(defn foo
  "I don't do a whole lot."
  [x]
  (println x "Hello, World!"))

(foo "Name")

;; Symbols
(def developer "Alice") ;; Variable global
(let [developer "Alice in Wonderland" ;; Variable con ámbito temporal
      rabbit "White Rabbit"]
  (println developer))
(println developer)