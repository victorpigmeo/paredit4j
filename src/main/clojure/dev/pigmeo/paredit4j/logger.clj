(ns dev.pigmeo.paredit4j.logger
  (:import
   (dev.pigmeo.paredit4j ClojureClassLoader)
   (com.intellij.openapi.diagnostic Logger)))

(set! *warn-on-reflection* true)

(defonce ^Logger logger (Logger/getInstance ClojureClassLoader))

(defn ^:private build-msg ^String [messages]
  (str "[PAREDIT4J] " (apply format (map str messages))))

(defn info [& messages]
  (.info logger (build-msg messages)))

(defn warn [& messages]
  (.warn logger (build-msg messages)))

(defn error [& messages]
  (.error logger (build-msg messages)))
