# Java Spring Framework + MongoDB example

Modern RESTful service with Java using Spring Framework.

## How to run
```bash
$ docker-compose up
```

## Documentation
```bash
http://localhost:8081/swagger-ui.html
```

```bash
http://localhost:8081/v2/api-docs
```

## Endpoints
Create user
```bash
$ curl -i -H 'Content-Type: application/json' -d '{"name":"hello", "age":23}' http://localhost:8081/users
```

Get all users
```bash
$ curl -i http://localhost:8081/users
```

Get user by id
```bash
$ curl -i http://localhost:8081/users/{id}
```

Delete user by id
```bash
$ curl -i -X DELETE http://localhost:8081/users/{id}
```

## License
MIT

## Author
Matheus Freire Rabelo
