(ns bla.core
  (:gen-class)
  (:require ;[bla.ldap-auth :as auth]
            [org.httpkit.server :refer :all]
            [compojure.core :refer :all]
            [compojure.route :as route]
            [hiccup.core :as hc]
            [hiccup.page :as hp]
            [ring.middleware.defaults :refer :all]
            [ring.util.response :refer :all]
            [ring.middleware.ssl :refer [wrap-hsts]]
            [cemerick.friend :as friend]
            (cemerick.friend [workflows :as workflows]
                             [credentials :as creds])))

(defn authenticated?
  [map {name :user-name pass :password}]
  (print pass name))

(defn index [req]
  (hp/html5
    [:head
      [:title "LOL"]]
    [:body
     [:div {:class "containder"}
       [:h1 "WHF"]
       [:h2 (str req)]]]))


(defroutes app
  (GET "/" [] index)
  (route/not-found "<h1>Page not found</h1>"))

(def site
 (-> app
  wrap-hsts))

(defn -main
  []
  (run-server #'site {:port 80})
  (println "server started at localhost:80"))
