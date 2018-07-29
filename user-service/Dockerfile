FROM openjdk:8-jdk-alpine
ADD /target/user-service-0.0.1-SNAPSHOT.jar user-service.jar
EXPOSE 1111
ARG /tmp
ADD run.sh run.sh
RUN chmod +x run.sh
CMD ./run.sh