#!/bin/sh

echo "********************************************************"
echo "Waiting for the configuration server to start on port 8888"
echo "********************************************************"
while ! `nc -z config-server 8888`; do sleep 3; done
echo "******* Configuration Server has started"


echo "********************************************************"
echo "Waiting for the Eureka server to start on port 1111"
echo "********************************************************"
while ! `nc -z service-registry 1111`; do sleep 3; done
echo "******* Eureka Server has started"
java -Dspring.profiles.active=dev -jar /gateway-service.jar
