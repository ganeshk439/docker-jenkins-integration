FROM openjdk:8
EXPOSE 8080
ADD target/couser-servie.jar couser-servie.jar
ENTRYPOINT ["java","-jar","/couser-servie.jar"]