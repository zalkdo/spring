FROM openjdk:8-jdk-alpine
LABEL maintainer="jh_kim@emro.co.kr"
VOLUME /tmp
EXPOSE 8080
ARG JAR_FILE=./build/libs/spring-boot-0.0.1-SNAPSHOT.jar
ADD ${JAR_FILE} to-do-springboot.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/to-do-springboot.jar"]
