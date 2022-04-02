### Docker Run Options for debugging
```
docker  run -p 5005:5005 -p 8080:8080 \
  -e JAVA_TOOL_OPTIONS=-agentlib:jdwp=transport=dt_soet,server=y,suspend=n,address=*:5005 \
  --name debugdemo-app debugdemo
```