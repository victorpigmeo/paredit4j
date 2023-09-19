(ns dev.pigmeo.paredit4j.extension.startup
  (:gen-class
   :name dev.pigmeo.paredit4j.extension.Startup
   :implements [com.intellij.openapi.startup.StartupActivity
                com.intellij.openapi.project.DumbAware])
  (:require
   [dev.pigmeo.paredit4j.logger :as logger])
  (:import
   [dev.pigmeo.paredit4j ClojureClassLoader]
   [com.intellij.openapi.project Project]))

(set! *warn-on-reflection* true)

(defn ^:private start-nrepl-server [port]
  (try
    ((requiring-resolve 'nrepl.server/start-server)
     :port port)
    (logger/info "Started nrepl server at port %s" port)
    (catch Exception e
      (logger/warn "No debug nrepl found %s" e))))

(defn -runActivity [_this ^Project _project]
  (ClojureClassLoader/bind)
  (logger/info "==================================================Starting Paredit4J plugin...")
  (start-nrepl-server 6661))
