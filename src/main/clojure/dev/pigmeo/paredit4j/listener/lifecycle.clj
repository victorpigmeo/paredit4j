(ns dev.pigmeo.paredit4j.listener.lifecycle
  (:gen-class
   :name dev.pigmeo.paredit4j.listener.Lifecycle
   :extends dev.pigmeo.paredit4j.ClojureClassLoader
   :implements [com.intellij.ide.AppLifecycleListener])
  (:import
   [dev.pigmeo.paredit4j ClojureClassLoader]))

(defn -appFrameCreated [_ _] (ClojureClassLoader/bind))

(defn -welcomeScreenDisplayed [_])
(defn -appStarted [_])
(defn -appStarting [_ _])
(defn -projectFrameClosed [_])
(defn -projectOpenFailed [_])
(defn -appClosing [_])
(defn -appWillBeClosed [_ _])
