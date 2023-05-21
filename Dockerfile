# Use an appropriate base image
FROM openjdk:11

# Set the working directory inside the container
WORKDIR /app

# Copy the JAR file into the container
COPY target/campaign-details-0.0.1-SNAPSHOT.jar app.jar
COPY src/main/resources/listing-details.csv src/main/resources/listing-details.csv

# Expose the port that your Spring application listens on
EXPOSE 8080

# Define the command to run your Spring application
CMD ["java", "-jar", "app.jar"]
