(ns alfa.env
  (:require [selmer.parser :as parser]
            [clojure.tools.logging :as log]
            [alfa.dev-middleware :refer [wrap-dev]]))

(def defaults
  {:init
   (fn []
     (parser/cache-off!)
     (log/info "\n-=[alfa started successfully using the development profile]=-"))
   :stop
   (fn []
     (log/info "\n-=[alfa has shut down successfully]=-"))
   :middleware wrap-dev})
