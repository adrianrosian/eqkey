(defproject eqey "0.2"
	:description "Equivalent key for given string"
	:url "http://whitecitycode.com"
	:license {:name "Eclipse Public License"
	:url "http://www.eclipse.org/legal/epl-v10.html"}
	:dependencies [
		[org.clojure/clojure "1.6.0"]
		[org.clojars.adrianr/eqvkey "0.2"]
	]
	:main ^:skip-aot eqey.core
	:target-path "target/%s"
	:profiles {:uberjar {:aot :all}})