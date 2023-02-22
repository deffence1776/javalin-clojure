(ns javalin.main-test
  (:require [clojure.test :refer :all])
  (:require [javalin.main :refer :all]))

(deftest hello-test
  (is (= (say-hello) "Hello World")))
