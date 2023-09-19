(ns dev.pigmeo.paredit4j.action.slurp-forward
  (:gen-class
   :name dev.pigmeo.paredit4j.action.SlurpForward
   :extends com.intellij.openapi.project.DumbAwareAction)
  (:require
   [dev.pigmeo.paredit4j.logger :as logger])
  (:import
   [com.intellij.openapi.actionSystem AnActionEvent]))

(set! *warn-on-reflection* true)

(defn -actionPerformed
  [_ ^AnActionEvent event]
  ;;TODO implement slurp forward
  (logger/info "%s" event))
