(ns user
  (:require 
            [mount.core :as mount]
            [web-app.figwheel :refer [start-fw stop-fw cljs]]
            web-app.core))

(defn start []
  (mount/start-without #'web-app.core/repl-server))

(defn stop []
  (mount/stop-except #'web-app.core/repl-server))

(defn restart []
  (stop)
  (start))


