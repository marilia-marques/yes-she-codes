(defproject yes-she-codes "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url  "https://www.eclipse.org/legal/epl-2.0/"}
  :repositories {"my.datomic.com" {:url "https://my.datomic.com/repo"
                                   :creds :gpg
                                   :username "marilia.marques@nubank.com.br"
                                   :password "83285332-dd32-4fc3-9b81-edcf0cc18550"}}
  :dependencies [[org.clojure/clojure "1.11.1"]
                 [org.clojure/data.csv "1.0.1"]
                 [semantic-csv "0.2.1-alpha1"]
                 [clojure.java-time "0.3.3"]
                 [prismatic/schema "1.2.1"]
                 [com.datomic/datomic-pro "1.0.6397"]]
  :repl-options {:init-ns yes-she-codes.core})