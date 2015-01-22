(ns eqey.core
	(:require 
		[eqvkey.core :refer [make-bit-seq eqv]])
	(:gen-class))

(defn -main [& args]
	(let [k (first args) t (nth args 1 -1)]
	    (println "Your key: " k " Your threshold: " (if (pos? t) t "not provided"))
	    (println "Bit representation: " 
	    	(make-bit-seq k))
	    (println "Equivalent key:     " (eqv k t))))