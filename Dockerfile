FROM openjdk:17-jdk-slim
WORKDIR /app
COPY target/demo-0.0.1-SNAPSHOT.jar springapp.jar
EXPOSE 9090
ENTRYPOINT ["java", "-jar", "springapp.jar"]
