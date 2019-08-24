# eluo-spring-boot

Docker (컨테이너 간 통신 --link)


1. mysql 
docker run -d -p 3306:3306 --name eluo-mysql-container  \
-e MYSQL_ROOT_PASSWORD=mysql \
-e MYSQL_DATABASE=eluo \
-e MYSQL_USER=eluo \
-e MYSQL_PASSWORD=eluo7501 mysql:latest


2. hosts파일 편집
127.0.0.1   mysql 추가


3. spring properties 파일 편집
spring.datasource.url=jdbc:log4jdbc:mysql://mysql/elou


4. Dockerfile
FROM java:8
MAINTAINER lohanyeon <yeonkh94@gmail.com>
VOLUME /tmp
ADD target/eluo-spring-boot-0.0.1-SNAPSHOT.jar eluo-spring-boot-0.0.1-SNAPSHOT.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","-Dspring.profiles.active=local","eluo-spring-boot-0.0.1-SNAPSHOT.jar"]


5. spring-boot app build (어플리케이션 루트에서 실행)
mvn clean package -Dspring.profiles.active=local
target/app.jar eluo-spring-boot-0.0.1-SNAPSHOT.jar eluo-spring-boot-0.0.1-SNAPSHOT.jar 생성됨


6. DockerFile 이미지 생성
docker build -f Dockerfile -t 이미지명[eluo-spring-boot] .


7. 스프링부트앱 실행 -mysql 연결
docker run -d -t --name eluo-spring-boot-container
--link mysql:mysql -p 8080:8080 eluo-spring-boot 


8. 스프링부트앱 컨테이저에서 host파일 확인
            docker exec -it eluo-spring-boot-container bin/bash
            cat /etc/hosts
            172.17.0.2      mysql eaaab10efaeb
            
            
9. nginx [dockerfile로 이미지 생성 후 아래 명령 실행]
docker run -t --name eluo-nginx-container --link eluo-spring-boot-container:eluo-spring-boot-container -p 80:80 -p 443:443 eluo-nginx
docker exec -it eluo-nginx-container bin/bash
cat /etc/hosts
