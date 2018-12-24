FROM openjdk:8-jre
MAINTAINER Mathivanan (visitmathi@hotmail.com)
COPY ./build/libs/SimpleJPA-0.0.1-SNAPSHOT.jar var/www/app/
WORKDIR var/www/app
CMD ["java",  "-jar", "SimpleJPA-0.0.1-SNAPSHOT.jar"]
EXPOSE 8090
