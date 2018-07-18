(ns bla.views
  (:require
         [hiccup.page :refer :all]))


(defn head
  [title]
  [:head
   [:meta {:charset "utf-8"}]
   [:meta {:name "viewport" :content "width=device-width, initial-scale=1
                                      shrink-to-fit=no"}]
   [:title title]
   (include-css "css/bootstrap.min.css")
   (include-js "js/jquery-3.3.1.min.js")
   (include-js "js/bootstrap.min.js")])

(def navbar
  [:nav {:class "navbar navbar-dark bg-dark"}
   [:a {:class "navbar-brand" :href "#"} "Navbar"]])

(def login-page
  (html5
   [:head
    [:meta {:charset "utf-8"}]
    [:meta {:name "viewport" :content "width=device-width, initial-scale=1
                                      shrink-to-fit=no"}]
    [:title "Login"]
    (include-css "css/bootstrap.min.css")
    (include-css "css/signin.css")
    (include-js "js/jquery-3.3.1.min.js")
    (include-js "js/bootstrap.min.js")]

   [:body
    [:form {:class "form-signin"}
     [:h1 {:class "h3 mb-3 fornt-weight-normal"} "Вход"]
     [:label {:for "inputName" :class "sr-only"} "Имя пользователя"]
     [:input {:type "name" :id "inputName" :class "form-control" :placeholder "Имя пользователя"}]
     [:label {:for "inputPassword" :class "sr-only" } "Пароль"]
     [:input {:type "password" :id "inputPassword" :class "form-control" :placeholder "Парль"}]
     [:button {:class "btn btn-lg btn-primary btn-block" :type "submit"} "Войти"]]]))

(def index
 (html5
  (head "Главная")
  [:body
   navbar
   [:h1 "Главная страница"]]))
