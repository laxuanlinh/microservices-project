FROM openjdk:8-jdk-alpine
ADD /target/gateway-service-0.0.1-SNAPSHOT.jar gateway-service.jar
EXPOSE 8080
ARG /tmp
ADD run.sh run.sh
RUN chmod +x run.sh
CMD ./run.sh