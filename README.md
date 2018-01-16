# TableTop auth microservice
[![Build Status](https://travis-ci.org/TableTopLtd/tt-auth.svg?branch=master)](https://travis-ci.org/TableTopLtd/tt-auth)
```

## When developing

Run
```bash
mvn clean package
```
from repo root directory.

To run application local jar, run:
```bash
java -jar api/target/*.jar
```

Microservice finds database through ip

To test the service you should go to
```
http://localhost:8087/v1/auth/login
```
To list all authorizations (login info).

POST auth to:
```
http://localhost:8087/v1/auth/login
```
to log in.

POST auth to:
```
http://localhost:8087/v1/auth/logout
```
to log out.

## Build docker image
```bash
docker build . -t tt-auth:X
```

[Optional] Define your own X

## Run application in Docker
```bash
docker run -p 8087:8087 tt-auth:X
```
