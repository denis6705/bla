(ns bla.core
  (:gen-class)
  (:require [bla.ldap-auth :as auth]
            [org.httpkit.server :refer :all]
            [compojure.core :refer :all]
            [compojure.route :as route]))

(defroutes app
  (GET "/" [] "<h1>Hello World</h1>")
  (route/not-found "<h1>Page not found</h1>"))



(defn -main
  []
  (run-server #'app {:port 80}))
