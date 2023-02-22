(ns javalin.fw
  (:import (io.javalin Javalin)))

(defn- get-handler [f]
  (reify
    io.javalin.http.Handler
    (handle [_ ctx] (.result ctx (f)))))

(defn- set-routes [javalin routes]
  (doseq [r routes]
    (-> javalin
        (.get (:path r) (get-handler (:handler r))))))

(defn start-server
  [routes]
  (-> (Javalin/create)
      (.start)
      (set-routes routes)))
