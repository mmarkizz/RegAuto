FROM openjdk:23-jdk-slim
VOLUME /tmp
EXPOSE 8080
WORKDIR /regauto
COPY target/RegAuto-0.0.1-SNAPSHOT.jar /regauto/regauto.jar
ENTRYPOINT ["java", "-jar", "regauto.jar"]