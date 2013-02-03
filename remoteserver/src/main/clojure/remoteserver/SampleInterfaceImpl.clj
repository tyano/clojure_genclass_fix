(ns remoteserver.SampleInterfaceImpl
  (:gen-class
    :implements [commoninterfaces.SampleInterface java.io.Serializable]
    :constructors {[String] []}
    :init init
    :state state))

(defn -init [result-name]
  [[] {:result-name result-name}])

(defn -getName [this] (:result-name (.state this)))
  
