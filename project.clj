(defproject cc.qbits/hayt "2.0.0-rc2"
  :description "CQL Query Generation"
  :url "https://github.com/mpenet/hayt"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [cc.qbits/pod "0.2.0"]
                 [potemkin "0.3.8"]
                 [org.flatland/useful "0.10.1"]
                 [org.apache.commons/commons-lang3 "3.3.2"]]
  :profiles {:1.6 {:dependencies [[org.clojure/clojure "1.6.0"]]}
             :1.7 {:dependencies [[org.clojure/clojure "1.7.0-alpha2"]]}
             :master {:dependencies [[org.clojure/clojure "1.7.0-master-SNAPSHOT"]]}
             :dev  {:dependencies [[clj-time "0.8.0"]
                                   [codox "0.8.10"]]}}
  :aliases {"all" ["with-profile" "dev:dev,1.6:dev,1.7:dev,master"]}
  :codox {:src-dir-uri "https://github.com/mpenet/hayt/blob/master"
          :src-linenum-anchor-prefix "L"
          :output-dir "../hayt-gh/codox"
          :defaults {:doc/format :markdown}
          :include [qbits.hayt
                    qbits.hayt.dsl.statement
                    qbits.hayt.dsl.clause
                    qbits.hayt.fns
                    qbits.hayt.utils
                    qbits.hayt.codec.joda-time]}
  :source-paths ["src/clj"]
  :java-source-paths ["src/java"]
  :javac-options ["-source" "1.6" "-target" "1.6" "-g"]
  :global-vars {*warn-on-reflection* true})
