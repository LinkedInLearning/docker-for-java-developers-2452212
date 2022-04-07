## Compose sample application
### Manually
```
docker network create blog-network
docker run --name postgres-db -e POSTGRES_DB=blogdemo -network blog-network -e POSTGRES_PASSWORD=lmnop -v db-data:/var/lib/postgresql/data -p 5432:5432 -d postgres
docker build -t blog-backend .
docker run --name blog-backend-app -p 8080:8080 -network blog-network -e POSTGRES_HOST=db-e POSTGRES_DB=blogdemo -e POSTGRES_PASSWORD=lmnop -d blog-backend
```
```
docker stop postgres-db blog-backend-app
docker rm postgres-db blog-backend-app
docker network rm blog-network

```
```
curl -X POST "http://localhost:8080/blogs"  -H  "Content-Type: application/json" -d "hohoho"
curl localhost:8080/blogs
curl localhost:8080/stop
docker rm blog-backend app

```
### Automated using docker-compose
```
docker-compose up
docker-compose down
```