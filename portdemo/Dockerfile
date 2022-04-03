FROM openjdk:11.0-jdk  AS BUILD_IMAGE
ADD  . /project
WORKDIR /project
RUN ./mvnw package
FROM openjdk:11.0-jre
RUN mkdir /app
COPY --from=BUILD_IMAGE project/target/portdemo-0.0.1-SNAPSHOT.jar /app/portdemo.jar
CMD ["java", "-jar", "/app/portdemo.jar"]