(ns wonderland.core
  (:require [wonderland.alice.favfoods :as af]
            [wonderland.rabbit.favfoods :as rf]))

(+ 1 (- 3 2))
;; => 2
;; these expresion evaluate to itselfs
2/3
"jum"
:jum
nil
\j
true

;; Colecciones: listas, vectores, mapas y conjuntos
'(1 2 "jam" :marmalade-jar)  ;; Lista. Puedes usar comas
(first '(1 2 "jam"))
(rest '(1 2 "jam" :marmalade-jar))
(cons 2 (cons 3 '()))
[:jar1 1 2 3 :jar2] ;; vector. Indexado
(first (rest [:jar1 1 2 3]))
(nth [:jar1 1 2 3] 0) ;; elemento en un índice
(last [:jar1 1 2 3 :marmalade]) ;; 'last' y 'nth' mejor en vectores que en listas (las listas hay que atravesarlas)
(last '(1 2 5))
(count '(:jam 2 3 "jam"))
(conj [:jam 1 2] 3 4) ;; añade n elementos al final de un vector o principio de una lista
(conj '(1 2 3) 0)
{:jam1 "strawberry", :jam2 "blackberry"} ;; Mapa. Pares clave-valor
(get {:jam1 "strawberry", :jam2 "blackberry"} :jam2)
;; como clave, lo que más se usa son keywords
(:jam3 {:jam1 "strawberry", :jam2 "blackberry"} "not found") ;; se puede utilizar una clave como función y ofrecer un valor por defecto si no se encuentra
;; ("uno" {"uno" 1, :dos "dos"}) ;; utilizar un string como clave hace que no se pueda utilizar como función accesora
(keys {:jam1 "strawberry", :jam2 "blackberry"})
(vals {:jam1 "strawberry", :jam2 "blackberry"})
(conj {:jam0 "potatoe"} {:jam1 "strawberry", :jam2 "blackberry"})
(assoc {:jam1 "strawberry", :jam2 "blackberry"} :jam1 "potatoe") ;; ''cambia' el valor de un elemento del mapa
(dissoc {:jam1 "strawberry", :jam2 "blackberry"} :jam1) ;; elimina un elemento del mapa
(merge {:jam1 "red" :jam2 "black"}
       {:jam1 "orange" :jam3 "red"}
       {:jam4 "blue"}) ;; ¿Por qué :jam1 queda como "orange"?

;; Colección 'set', conjuto. Colección de elementos únicos
#{:red :blue :white}
;; (clojure.set/union #{:r :b :w} #{:w :p :y})
;; => #{:y :r :w :b :p}
;; También finciones 'difference' e 'intersection'

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

;; Namespaces
;; (ns alice.favfoods)
(println *ns*)
;; => #object[clojure.lang.Namespace 0x2611b9a3 wonderland.core]

;; functions from direrents namespaces alias
(println af/fav-food)
(println rf/fav-food)


