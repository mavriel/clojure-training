(ns greeting.core-test
  (:require [clojure.test :refer :all]
            [greeting.core :refer :all]))

(deftest a-test,
  (testing "make greeting"
    (is (= (make-greeting-text "mavriel") "my name is mavriel"))
    (is (= (make-greeting-text "sukhoon") "my name is sukhoon"))))

