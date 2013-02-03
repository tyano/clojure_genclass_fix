(ns client.SampleClient
  (:import [commoninterfaces SampleInterface SampleService]
           [java.rmi.registry LocateRegistry]
           [java.rmi RMISecurityManager])
  (:gen-class))

(defn -main [& args]
  (try
    (System/setSecurityManager (RMISecurityManager.))
    (let [registry (LocateRegistry/getRegistry nil)
          service ^SampleService (.lookup registry "SampleService")
          result ^SampleInterface (.getResult service)]
      (println (str "response = " (.getName result))))
    (catch Exception ex
      (println (str "Client exception: " (.toString ex)))
      (.printStackTrace ex))))

