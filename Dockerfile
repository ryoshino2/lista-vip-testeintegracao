FROM openjdk:8-jdk-alpine
VOLUME /tmp
COPY target/springboot2-testing-examples-*.jar app.jar
ENTRYPOINT ["java", "-Dspring.profiles.active=docker","-jar", "/app.jar"]