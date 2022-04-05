##Ditching the Dockerfile

## Pack CLI
download pack https://buildpacks.io/docs/tools/pack/
```
pack build suggest
pack build --builder gcr.io/buildpacks/builder:v1 webapp-img:buildpack
```


#Jib
For local image
```
./mvn package -jib:dockerBuild  

```

#Springboot plugin
./mvn -spring-boot:build-image
[INFO]  > Pulling builder image 'docker.io/paketobuildpacks/builder:base' 100%
/layers
/cnb
/workspace







