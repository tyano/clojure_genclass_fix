(ns remoteserver.SampleRemoteService
  (:import [remoteserver SampleInterfaceImpl]
           [java.rmi.registry Registry LocateRegistry]
           [java.rmi RemoteException]
           [java.rmi.server UnicastRemoteObject])
  (:gen-class
    :implements [commoninterfaces.SampleService]
    :constructors {[] []}))

(defn -getResult
  [this]
  (SampleInterfaceImpl. "this is sample."))

(defn -main []
  (try
    (let [service (remoteserver.SampleRemoteService.)
          stub (UnicastRemoteObject/exportObject service 0)
          registry (LocateRegistry/getRegistry)]
      (try
        (.bind registry "SampleService" stub)
        (println "Server ready.")
      (catch java.rmi.AlreadyBoundException ex
        (.rebind registry "SampleService" stub)
        (println "Server ready. (rebind)"))))
    (catch Exception ex 
      (println (str "Server exception: " (.toString ex)))
      (.printStackTrace ex))))



