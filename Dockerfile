FROM openjdk:19
EXPOSE 8080
ADD target/backend.jar backend.jar
ENTRYPOINT ["java","-jar","/backend.jar"]