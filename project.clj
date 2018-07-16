(defproject bla "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.9.0"]
				 [org.clojure/java.jdbc "0.7.1"]
				 [org.xerial/sqlite-jdbc "3.23.1"]
         [org.clojars.pntblnk/clj-ldap "0.0.16"]]
  :main ^:skip-aot bla.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
