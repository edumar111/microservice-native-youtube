# Use a base image with Java 11
FROM eclipse-temurin:21.0.1_12-jre

# Set the working directory
WORKDIR /app
# Copy the JAR file to the container
COPY target/*.jar microservice.jar
# Expose the port that your Spring Boot application listens on (default is 8080)
EXPOSE 8080
# Define the command to run your application
CMD ["java", "-jar", "microservice.jar"]

# mvn clean package -Dmaven.test.skip
# docker build -t edumar111/youtube-ms-product:1.0.0  -f docker/Dockerfile .
