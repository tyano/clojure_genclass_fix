#!/bin/bash

java -cp target/client-0.1.0-SNAPSHOT-standalone.jar -Djava.security.policy=policy.all -Djava.rmi.server.useCodebaseOnly=false client.SampleClient

