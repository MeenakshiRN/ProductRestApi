FROM openjdk:24-jdk-slim

WORKDIR /salesapp

COPY target/SalesSavvyBackEnd-0.0.1-SNAPSHOT.jar salesapp.jar

COPY src/main/resources/application.properties /app/config/application.properties

EXPOSE 9090

ENTRYPOINT [ "java", "-jar", "salesapp.jar"]