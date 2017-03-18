(ns user
  (:require [mount.core :as mount]
            [alfa.figwheel :refer [start-fw stop-fw cljs]]
            alfa.core))

(defn start []
  (mount/start-without #'alfa.core/http-server
                       #'alfa.core/repl-server))

(defn stop []
  (mount/stop-except #'alfa.core/http-server
                     #'alfa.core/repl-server))

(defn restart []
  (stop)
  (start))


