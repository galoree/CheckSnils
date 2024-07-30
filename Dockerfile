FROM openjdk:11-jre-slim

WORKDIR /app

COPY Snils_Check-1.0.jar .

EXPOSE 8082

ENTRYPOINT ["java","-jar", "/app/Snils_Check-1.0.jar"]
