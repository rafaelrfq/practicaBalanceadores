FROM adoptopenjdk/openjdk11:alpine-jre

LABEL maintainer="Rafael Felipe <20100748@ce.pucmm.edu.do>"

ENV spring.datasource.url='jdbc:mysql://${MYSQL_HOST:localhost}:33006/polls'
ENV spring.datasource.username='root'
ENV spring.datasource.password='password'
ENV server.port=8080

VOLUME /tmp

COPY /build/libs/*.jar balanceadores.jar

ENTRYPOINT ["java", "-jar", "balanceadores.jar"]