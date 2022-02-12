FROM openjdk:11
COPY target/restfull-application.jar restfull-application.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "restfull-application.jar"]