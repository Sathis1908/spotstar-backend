# Use Java 21 instead of 17
FROM openjdk:21-jdk-slim

# Set working directory
WORKDIR /app

# Copy the built jar into the image
COPY target/*.jar app.jar

# Run the jar
ENTRYPOINT ["java", "-jar", "app.jar"]
