#!/usr/bin/env boot

(println "Setting initial env.")
(set-env! :resource-paths #{"src"})

(println "Loading tasks.")
(require '[live-components.build.tasks :refer :all])

(println "Loading tasks complete.\n")
