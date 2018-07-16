(ns bla.ldap-auth
  (:require [clj-ldap.client :as ldap]))

(def ldap-server (ldap/connect {:host "172.16.0.2"
                                :bind-dn "CN=Admin,OU=GOD,DC=corp,DC=artek,DC=org"
                                :password "Ckj;ysqGfcc4321"}))

(defn auth [username password]
  (let [dn (:dn (first (ldap/search ldap-server "DC=corp, DC=artek, DC=org"
                                  {:filter (str "(sAMAccountName=" username ")")
                                   :attributes [:dn]})))]
       (ldap/bind? ldap-server dn password)))
