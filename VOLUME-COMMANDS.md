### Host Volume Example
For Linux/Mac OS
```
docker run -itd --name host-volume-app -v ${PWD}/my-host-folder:/container-folder alpine
```
 For  windows OS
```
docker run -itd --name host-volume-app -v %cd%/my-host-folder:/container-folder alpine
```

```
docker exec -it host-volume-app sh
```


### Anonymous Volume Example
```
docker run -itd --name anon-volume-app -v /container-folder alpine
```

### Named Volume Example 
```
docker run -itd --name named-volume-app -v bob:/container-folder alpine
```

### Interact with Volumes
```
docker volume ls
docker volume rm <name>
docker exec -it anon-volume-app touch /container-folder/anon-file
docker exec -it named-volume-app touch /container-folder/named-file
```


