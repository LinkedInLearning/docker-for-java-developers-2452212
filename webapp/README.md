##Ditching the Dockerfile
#Download Dive
Brew install dive
https://github.com/wagoodman/dive

#Jib
./mvn compile -jib:dockerBuild -Dimage=webapp-img:jib
FROM eclipse-temurin:11-jre current default

docker exec -t -i webapp-app /bin/bash
files in
/app, classes, libs, resources
Docker hub
docker login 
mellenbowman
./mvn compile -jib:build -Dimage=mellenbowman/webapp-img:dh


#Springboot plugin
app built outside of image, detects which version of java and add appropriate jre version to add to image
./mvn -spring-boot:build-image
[INFO]  > Pulling builder image 'docker.io/paketobuildpacks/builder:base' 100%
/layers
/cnb
/workspace
#Pack CLI
BP's -- Very good at reusing layers
BP's -- provide an application-oriented abstraction
Can override environment settings 
can select which jre, OS etc
Builds java app inside of image (jdk), then has java jre
download pack


https://buildpacks.io/docs/tools/pack/
pack build suggest
pack build --builder gcr.io/buildpacks/builder:v1 webapp-img:buildpack









