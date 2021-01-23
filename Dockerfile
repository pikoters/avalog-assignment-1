FROM gcr.io/distroless/java:11

MAINTAINER backend_eng
COPY ./build/libs/*jar app.jar


ENTRYPOINT ["java", "-jar" , "/app.jar"]

