(ns tetris.server
	"Tetris server"

(:use [ring.adapter.jetty             :only [run-jetty]]
      [compojure.core                 :only [defroutes GET]]
      [ring.middleware.params         :only [wrap-params]]
      [tetris.core :only [tetris]]))

(defroutes routes
  (GET  "/" [figure x y glass] (tetris figure x y glass)))

(def handler (wrap-params routes))

(defn start-server [] ; for local use
  (future (run-jetty handler {:port 8888})))