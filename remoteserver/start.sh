#!/bin/bash

CURRENT_DIR=`pwd`
CODEBASE="file://${CURRENT_DIR}/target/remoteserver-0.1.0-SNAPSHOT-standalone.jar"
java -classpath target/remoteserver-0.1.0-SNAPSHOT-standalone.jar -Djava.rmi.server.codebase="$CODEBASE" remoteserver.SampleRemoteService

