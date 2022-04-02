FROM openjdk:17-alpine
ADD target/volumedemo-0.0.1-SNAPSHOT.jar /app/volumedemo.jar
ENV spring.config.location=/config/
CMD ["java", "-jar", "/app/volumedemo.jar"]