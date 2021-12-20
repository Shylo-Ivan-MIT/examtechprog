FROM openjdk:16-alpine3.13

WORKDIR /examprog

COPY .mvn/ .mvn
COPY mvnw pom.xml ./
RUN ./mvnw dependency:go-offline
COPY src ./src

CMD ["./mvnw", "spring-boot:run"]
