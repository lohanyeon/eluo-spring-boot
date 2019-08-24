FROM java:8
MAINTAINER lohanyeon <yeonkh94@gmail.com>

VOLUME /tmp
ADD target/eluo-spring-boot-0.0.1-SNAPSHOT.jar eluo-spring-boot-0.0.1-SNAPSHOT.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","-Dspring.profiles.active=local","eluo-spring-boot-0.0.1-SNAPSHOT.jar"]
