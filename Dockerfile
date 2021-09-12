FROM openjdk:8
ADD build/libs/fleetserv-0.0.1-SNAPSHOT.jar fleetserv-0.0.1-SNAPSHOT.jar
EXPOSE 5556
ENTRYPOINT ["java", "-jar", "fleetserv-0.0.1-SNAPSHOT.jar"]