(ns web-app.env
  (:require [clojure.tools.logging :as log]))

(def defaults
  {:init
   (fn []
     (log/info "\n-=[web-app started successfully]=-"))
   :stop
   (fn []
     (log/info "\n-=[web-app has shut down successfully]=-"))
   :middleware identity})
