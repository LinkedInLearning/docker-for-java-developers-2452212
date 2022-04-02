FROM maven:3.6.3-jdk-11 AS builder
ADD . /project
WORKDIR /project
RUN mvn install
FROM openjdk:11-jre-slim

EXPOSE 8080
VOLUME /tmp

COPY --from=builder /project/target/blog-backend-0.0.1-SNAPSHOT.jar  /app/blogdemo.jar
ENTRYPOINT ["java","-jar","/app/blogdemo.jar"]