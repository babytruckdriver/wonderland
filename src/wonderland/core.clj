(ns wonderland.core)

;; Symbols
;; ==========
(def developer "Alice") ;; Variable global
(let [developer "Alice in Wonderland" ;; Variable con ámbito temporal
      rabbit "White Rabbit"]
  (println developer))

;; functions!
;; ==========
(defn follow-the-rabbit [] "Off we go!")
(println (follow-the-rabbit))
;; => Off we go!

(defn sum [el1, el2]
  (+ el1 el2))

(println ( sum 2 3/2))
;; => 7/2

((fn [] (str "I'm an anonymous function!")))
(#(str "I'm an anonymous function too!"))
(#(str %1 ", " %2 ", I'm an anonymous function too!") "Samuel" "Cristina")
;; => "I'm an anonymous function!"
;; => "I'm an anonymous function too!"
;; => "Samuel, Cristina, I'm an anonymous function too!"