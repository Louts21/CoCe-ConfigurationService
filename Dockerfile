# ---- build stage ----
FROM maven:3.9-eclipse-temurin-17 AS build
WORKDIR /app

# zuerst nur pom.xml für besseres Layer-Caching
COPY pom.xml .
RUN mvn -q -DskipTests dependency:go-offline

# dann restlichen Source
COPY . .
RUN mvn -q -DskipTests package

# ---- runtime stage ----
FROM eclipse-temurin:17-jre
WORKDIR /app

# Spring Boot Maven Plugin erzeugt i.d.R. ein ausführbares Jar in target/
COPY --from=build /app/target/*.jar /app/app.jar

# Standard-Spring-Boot-Port (falls du in application.* etwas anderes setzt, hier ändern)
EXPOSE 8080

# optional: Profil dev
ENV SPRING_PROFILES_ACTIVE=dev

ENTRYPOINT ["java","-jar","/app/app.jar"]