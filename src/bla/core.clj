(ns bla.core
  (:gen-class)
  (:require [bla.ldap-auth :as auth]
            [org.httpkit.server :refer :all]
            [compojure.core :refer :all]
            [compojure.route :as route]
            [hiccup.core :as hc]
            [hiccup.page :as hp]))


(defn index [req]
  (hp/html5
    [:head
      [:title "LOL"]]
    [:body
     [:div {:class "containder"}
       [:h1 "WHF"]
       [:h1 (str req)]]]))

(defroutes app
  (GET "/" [] index)
  (route/not-found "<h1>Page not found</h1>"))



(defn -main
  []
  (run-server #'app {:port 80}))
