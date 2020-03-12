(defproject native-clj-cli "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.10.0"]
                 [cli-matic "0.3.11"]]
  :repl-options {:init-ns native-clj-cli.core}
  :main native-clj-cli.core
  :aot :all)
