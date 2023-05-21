FROM openjdk:11

WORKDIR /app

COPY target/campaign-details-0.0.1-SNAPSHOT.jar app.jar
COPY src/main/resources/listing-details.csv src/main/resources/listing-details.csv

EXPOSE 8080

CMD ["java", "-jar", "app.jar"]
