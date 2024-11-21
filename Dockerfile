FROM eclipse-temurin:21-jdk-alpine
  

WORKDIR /app

# COPY .mvn .mvn
# COPY mvnw .
# COPY pom.xml .

# RUN chmod +x ./mvnw
# RUN ./mvnw clean install

COPY target/*.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "/app/app.jar"]
