FROM openjdk:8
EXPOSE 8081
ADD target/rating-service.jar rating-service.jar
ENTRYPOINT ["java", "-jar", "rating-service.jar"]