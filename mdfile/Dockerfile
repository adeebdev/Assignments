FROM openjdk:8-jdk-alpine
VOLUME /mdfile/target
ARG JAR_FILE
COPY ${JAR_FILE} mdfile.jar
ENTRYPOINT ["java","-jar","mdfile.jar"]