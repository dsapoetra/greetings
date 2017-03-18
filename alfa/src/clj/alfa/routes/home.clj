(ns alfa.routes.home
  (:require [alfa.layout :as layout]
            [compojure.core :refer [defroutes GET]]
            [ring.util.http-response :as response]
            [clojure.java.io :as io]))

(defn login-page []
  (layout/render "lojin.html"))

(defn home-page []
  (layout/render "rumah.html"))

(defroutes home-routes
  (GET "/" []
       (login-page))
  (GET "/rumah" []
       (home-page))
  (GET "/docs" []
       (-> (response/ok (-> "docs/docs.md" io/resource slurp))
       (response/header "Content-Type" "text/plain; charset=utf-8"))))

