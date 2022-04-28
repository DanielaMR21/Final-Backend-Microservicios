FROM openjdk:17-oracle
ARG JAR_FILE=target/config-server-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} config-server.jar
ENTRYPOINT ["java","-jar","config-server.jar"]
EXPOSE 8888