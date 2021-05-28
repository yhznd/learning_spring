FROM maven:3.6.3-openjdk-11-slim as BUILDER
ARG VERSION=0.0.1-SNAPSHOT
WORKDIR /build

COPY pom.xml /build
COPY src /build/src

RUN mvn clean package

COPY target/room-web-app-${VERSION}.jar target/application.jar

FROM openjdk:11.0.8-jre-slim
WORKDIR /app/

COPY --from=BUILDER /build/target/application.jar /app/
CMD java -jar /app/application.jar

##Step 1 Start Docker
##Step 2 Build the war file
##Step 3 Run "docker build -t room-web-app ."
##Step 4 Run "docker run -p 8080:8080 -d room-web-app"
##Step 5 For checking "docker ps"