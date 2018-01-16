FROM openjdk:8-jre-alpine

RUN mkdir /app

WORKDIR /app

ADD ./api/target/auth-api-1.0.0-SNAPSHOT.jar /app

EXPOSE 8087

CMD ["java", "-jar", "auth-api-1.0.0-SNAPSHOT.jar"]
