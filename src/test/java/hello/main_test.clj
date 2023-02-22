(ns hello.main-test
  (:require [clojure.test :refer :all])
  (:require [hello.main :refer [say-java]]))

(deftest say-java-test
  (= (say-java) "java"))
