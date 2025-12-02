FROM eclipse-temurin:25
COPY ./target/dbtest.jar /tmp
WORKDIR /tmp
ENTRYPOINT ["java", "-jar", "dbtest.jar"]