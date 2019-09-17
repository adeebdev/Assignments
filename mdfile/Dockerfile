FROM java:8
EXPOSE 80
ADD /target/app.jar mdfile.jar
ENTRYPOINT ["java","-jar","mdfile.jar"]