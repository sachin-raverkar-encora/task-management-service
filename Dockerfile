FROM openjdk:17-alpine:latest
LABEL authors="Sachin.Raverkar"

WORKDIR /app
COPY target/*.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]
