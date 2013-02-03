#!/bin/bash

CODEBASE="file:///Users/t_yano/Develop/clojure_genclass_fix/remoteserver/target/remoteserver-0.1.0-SNAPSHOT-standalone.jar"
java -classpath target/remoteserver-0.1.0-SNAPSHOT-standalone.jar -Djava.rmi.server.codebase="$CODEBASE" remoteserver.SampleRemoteService

