#!/bin/sh

echo "********************************************************"
echo "Waiting for the configuration server to start on port 8888"
echo "********************************************************"
while ! `nc -z config-server 8888`; do sleep 3; done
echo "******* Configuration Server has started"
java -jar /service-registry.jar