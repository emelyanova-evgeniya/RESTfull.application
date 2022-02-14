FROM maven:3.8-jdk-11 AS build
COPY src /usr/local/RESTfull-Application/src
COPY pom.xml /usr/local/RESTfull-Application
RUN mvn -f /usr/local/RESTfull-Application/pom.xml clean package

FROM openjdk:11
COPY target/restfull-application.jar restfull-application.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "restfull-application.jar"]
