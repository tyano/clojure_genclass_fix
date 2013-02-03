#!/bin/bash

cd commoninterfaces
lein do clean, install

cd ../remoteserver
lein do clean, install, uberjar

cd ../client
lein do clean, install, uberjar

