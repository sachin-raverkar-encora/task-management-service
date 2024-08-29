FROM amazoncorretto:17-al2023
WORKDIR /app
COPY target/task-management-service-1.0.0.jar /app/task-management-service-1.0.0.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "task-management-service-1.0.0.jar"]
