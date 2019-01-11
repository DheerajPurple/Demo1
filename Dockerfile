FROM openjdk:8
ADD /target/Demo1-0.0.1-SNAPSHOT.jar Demo1-0.0.1-SNAPSHOT.jar
EXPOSE 8081
ENTRYPOINT ["java","-jar","Demo1-0.0.1-SNAPSHOT.jar"]
