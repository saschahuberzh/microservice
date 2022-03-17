FROM openjdk:8
EXPOSE 8082
ADD target/film-service.jar film-service.jar
ENTRYPOINT ["java", "-jar", "film-service.jar"]