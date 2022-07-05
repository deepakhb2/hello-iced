(ns hello-iced.core)

(defn foo
  "I don't do a whole lot."
  [x]
  (println x "Hello, World!"))

(defn messenger
  ([]     (messenger "Hello world!"))
  ([msg]  (println msg)))

(messenger "Test")


(let [x 1
      y 2]
  (+ x y))

(defn demo
  ([] (* 2 2))
  ([x] (* 2 x))
  ([x y] (* 2 x y)))

(demo 5 10)
