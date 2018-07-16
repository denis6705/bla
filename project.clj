(defproject bla "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.9.0"]
                 [org.clojure/java.jdbc "0.7.1"]
                 [org.xerial/sqlite-jdbc "3.23.1"]
                 [org.clojars.pntblnk/clj-ldap "0.0.16"]
                 [ring "1.6.3"]
                 [ring/ring-defaults "0.3.1"]
                 [com.cemerick/friend "0.2.3"]
                 [ring/ring-ssl "0.3.0"]
                 [compojure "1.6.1"]
                 [http-kit "2.3.0"]
                 [hiccup "1.0.5"]]

  :main ^:skip-aot bla.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
