(defproject clj-tetris "0.1.0-SNAPSHOT"
  :description "clojure client for tetris dojo"
  :url "http://codenjoy.com/"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [
  	[org.clojure/clojure "1.4.0"]
  	[ring                "1.1.1"]
  	[compojure           "1.0.4"]]

  :main tetris.server/start-server

  :plugins [[lein-ring        "0.7.1"]]

  :repl-options { 
    :init-ns tetris.core 
    :init (do
      ;; <!> add some hacks later
    )}

  :ring         {:handler tetris.server/handler :port 8888}
)
