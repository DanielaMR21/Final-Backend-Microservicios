FROM openjdk:17-oracle
ARG JAR_FILE=target/catalog-service-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} catalog-service.jar
ENTRYPOINT ["java","-jar","catalog-service.jar"]
EXPOSE 8083