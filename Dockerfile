# Use a lightweight Java 17 JDK base image
FROM eclipse-temurin:17-jdk-alpine

# Set working directory inside the container
WORKDIR /app

# Copy the jar file built by Maven into the image
COPY target/studapp-0.0.1-SNAPSHOT.jar app.jar

# Tell Docker to expose port 8080
EXPOSE 8080

# Command to run the JAR file
ENTRYPOINT ["java", "-jar", "app.jar"]