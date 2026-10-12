FROM maven:3.9-eclipse-temurin-11-alpine

WORKDIR /app

COPY target/comunicacao_api-0.0.1-SNAPSHOT.jar /app/comunicacao_api.jar

EXPOSE 8082

CMD ["java", "-jar", "/app/comunicacao_api.jar"]