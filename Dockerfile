FROM maven:3.8-jdk-11 AS build
COPY src /usr/src/RESTfull-Application/src
COPY pom.xml /usr/src/RESTfull-Application
RUN mvn -f /usr/src/RESTfull-Application/pom.xml clean package

FROM openjdk:11
COPY --from=build /usr/src/RESTfull-Application/target/restfull-application.jar restfull-application.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "restfull-application.jar"]
