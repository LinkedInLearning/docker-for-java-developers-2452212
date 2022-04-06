FROM maven:3.6.3-jdk-11 AS builder
ADD . /project
WORKDIR /project
RUN mvn package
FROM openjdk:11-jre-slim

COPY --from=builder /project/target/blog-backend-0.0.1-SNAPSHOT.jar  /app/blogdemo.jar
ENTRYPOINT ["java","-jar","/app/blogdemo.jar"]