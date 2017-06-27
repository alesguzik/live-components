(ns todomvc.build.deps
  (:require [boot.core :as boot]))

(println "Defining deps.")

(def deps
  {:build
   '[[org.clojure/clojure "1.8.0"]
     [org.clojure/clojurescript "1.7.228"]

     [org.clojure/tools.namespace "0.2.11"]
     [org.clojure/tools.reader "0.10.0-alpha3"]
     [org.clojure/tools.macro "0.1.5"]
     [org.clojure/tools.nrepl "0.2.12"]

     [com.cemerick/piggieback "0.2.1"]
     [weasel "0.7.0"]

     [adzerk/boot-cljs "1.7.228-1"]
     [adzerk/boot-cljs-repl "0.3.0"]
     [adzerk/boot-reload "0.4.8"]
     ]

   :app
   '[[reagent "0.6.0-alpha"] ;; ui
     [org.clojure/data.json "0.2.6"]
     [ring "1.6.1"]
     [compojure "1.5.1"]
     [org.immutant/web "2.1.2"]
     [live-components "1.0.0"]
     [cljs-ajax "0.6.0"]

     ]})

(defn request-dependencies [category]
  (println "Requesting" (name category) "dependencies.")
  (boot/set-env! :dependencies #(into % (deps category)))
  (println "Loaded" (name category) "dependencies."))

(request-dependencies :build)
