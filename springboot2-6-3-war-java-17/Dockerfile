FROM tomcat:9.0-jdk17-temurin


COPY . /app
WORKDIR /app
RUN apt-get update && \
    apt-get install dos2unix && \
    apt-get clean
RUN dos2unix mvnw
RUN ./mvnw package  -DskipTests


RUN cp /app/target/*.war /usr/local/tomcat/webapps/ROOT.war
CMD ["catalina.sh", "run"]
