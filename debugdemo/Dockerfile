FROM openjdk:11.0-jdk  AS BUILD_IMAGE
ADD  . /project
WORKDIR /project
RUN ./mvnw package
FROM openjdk:11.0-jre
RUN mkdir /app
COPY --from=BUILD_IMAGE project/target/debugdemo-0.0.1-SNAPSHOT.jar /app/debugdemo.jar
CMD ["java", "-jar", "/app/debugdemo.jar"]