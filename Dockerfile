FROM openjdk:17-jdk-slim
COPY target/demo-jenkins.jar demo-jenkins.jar
ENTRYPOINT ["java", "-jar", "/demo-jenkins.jar"]
