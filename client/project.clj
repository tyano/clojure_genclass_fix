(defproject client "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.5.0-master-SNAPSHOT"]
                 [common-interfaces "0.1.0-SNAPSHOT"]]
  :source-paths ["src" "src/main/clojure"]
  :java-source-paths ["src/main/java"] ; Java source is stored separately.
  :test-paths ["test" "src/test/clojure"]
  :resource-paths ["src/main/resource"] ; non-code files included in classpath/jar
  :compile-path "target/classes"   ; for .class files
  :native-path "src/native"        ; where to extract native dependencies
  :target-path "target/"
  :main client.SampleClient)
