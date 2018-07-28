FROM openjdk:8-jdk-alpine
ADD /target/config-server-0.0.1-SNAPSHOT.jar config-server.jar
EXPOSE 8888
ARG /tmp
ADD run.sh run.sh
RUN chmod +x run.sh
CMD ./run.sh