FROM openjdk:17-jdk-alpine

# Create directory in container
WORKDIR /app

# Copy the jar file (we will use Maven to build this)
COPY target/devposcode-0.0.1-SNAPSHOT.jar app.jar

# Expose the default port
EXPOSE 8080

# Run the jar file
ENTRYPOINT ["java", "-jar", "app.jar"]
