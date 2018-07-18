(ns bla.core
  (:gen-class)
  (:require [bla.ldap-auth :as auth]
            [bla.views :as views]
            [org.httpkit.server :refer :all]
            [compojure.core :refer :all]
            [compojure.route :as route]
            [ring.middleware.defaults :refer :all]
            [ring.util.response :refer :all]
            [ring.middleware.ssl :refer [wrap-hsts]]
            [cemerick.friend :as friend]
            (cemerick.friend [workflows :as workflows]
                             [credentials :as creds])))


(defroutes app
  (GET "/" [] #'views/index)
  (GET "/login" [] #'views/login-page)
  (route/resources "/")
  (route/not-found "<h1>Ухади</h1>"))


(def site
 (-> app
   wrap-hsts))

(defn -main
  []
  (run-server #'site {:ip "0.0.0.0" :port 80})
  (println "server started at localhost:80"))
