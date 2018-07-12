(ns bla.core
  (:gen-class)
  (:require [clojure.java.jdbc :refer :all]))

(def testdata
  {:date "2011-9-12"
   :url "http://example.com"
   :title "SQLite Example"
   :body "Example using SQLite with Clojure"
   })
   
 (def db 
   {:classname "org.sqlite.JDBC"
    :subprotocol "sqlite"
	:subname "db/database.db"
	})
	
(defn create-db []
  (try (db-do-commands db
						(create-table-ddl :news
										  [[:date :text]
										   [:url :text]
										   [:title :text]
										   [:body :text]]))
        (catch Exception e (println e))))
		


   
(defn -main
	[]
	(create-db)
	(insert! db :news testdata)
	 (def output
    (query db "select * from news"))
	(println (keys (first output)))
	(println (:body (first output))))