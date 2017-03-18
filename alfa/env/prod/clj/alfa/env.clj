(ns alfa.env
  (:require [clojure.tools.logging :as log]))

(def defaults
  {:init
   (fn []
     (log/info "\n-=[alfa started successfully]=-"))
   :stop
   (fn []
     (log/info "\n-=[alfa has shut down successfully]=-"))
   :middleware identity})
