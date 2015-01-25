(ns eqey.core
	(:require 
		[eqvkey.core :refer [make-bit-seq eqv]])
	(:gen-class :main true))

(defn -main [& args]
	(let [k (first args) t (Integer. (re-find #"\d" (nth args 1 -1)))]
	    (println "Your key: " k " Your threshold: " (if (pos? t) t "not provided"))
	    (println "Bit representation: " 
	    	(make-bit-seq k))
	    (println "Equivalent key:     " (eqv k t))))