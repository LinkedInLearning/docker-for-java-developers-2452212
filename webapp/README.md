## Ditching the Dockerfile

### Jib
For auto push to remote image
```
./mvnw package -jib:build  

```
For local image
```
./mvnw package -jib:dockerBuild  

```








