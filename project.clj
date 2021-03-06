(defproject com.draines/postal "1.12-recp-1-SNAPSHOT"
  :description "JavaMail on Clojure"
  :url "https://github.com/drewr/postal"
  :license {:name "MIT"
            :url "http://en.wikipedia.org/wiki/MIT_License"
            :distribution :repo
            :comments "Use at your own risk"}
  :repositories [["java.net" "http://download.java.net/maven/2"]
                 ["snapshots" :url "http://snydevel:8080/repository/snapshots/"]
                 ["releases" :url "http://snydevel:8080/repository/internal/"]]
  :dependencies [[commons-codec "1.9"]
                 [javax.mail/mail "1.4.4"
                  :exclusions [javax.activation/activation]]]
  :profiles {:dev {:dependencies [[org.clojure/clojure "1.5.1"]]}
             :1.3 {:dependencies [[org.clojure/clojure "1.3.0"]]}
             :1.4 {:dependencies [[org.clojure/clojure "1.4.0"]]}})
