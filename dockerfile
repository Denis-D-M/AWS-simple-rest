FROM openjdk:8u302-jre
WORKDIR /app
COPY target/AWS-simple-rest.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]