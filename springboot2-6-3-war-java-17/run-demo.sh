docker build -t demo-image .
docker run --name demo-app  -p 8080:8080 -d demo-image

