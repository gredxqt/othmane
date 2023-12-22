FROM openjdk:17-oracle
WORKDIR /app
COPY target/ControleCar-0.0.1-SNAPSHOT.jar /app
EXPOSE 8082
ENTRYPOINT ["java", "-jar", "ControleCar-0.0.1-SNAPSHOT.jar"]