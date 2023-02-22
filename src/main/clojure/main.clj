(ns main
  (:gen-class)
  (:require [javalin-clojure.fw :refer :all]))

(defn say-hello []
  "Hello World")

(defn say-java []
  "Hello Java")

(def routes
  [{:path "hello" :handler say-hello}
   {:path "java" :handler say-java}])

(defn -main
  [& args]
  (start-server routes))

