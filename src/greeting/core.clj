(ns greeting.core)

(defn make-greeting-text
  [name]
  (str "my name is " name))

(def make-greeting-text2 (partial str "my name is "))

(defn showInput []
  (print "input name: ")
  (flush))

(showInput)
(->> (read-line) make-greeting-text println)