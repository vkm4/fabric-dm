(ns ^:figwheel-no-load web-app.app
  (:require [web-app.core :as core]
            [devtools.core :as devtools]))

(enable-console-print!)

(devtools/install!)

(core/init!)
