FROM openjdk:11.0-jdk-slim
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
EXPOSE 8012
ENTRYPOINT ["java","-jar","/app.jar"]
