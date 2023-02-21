#for java11 try this
FROM openjdk:11

#Refer to Maven build --> filename
ARG JAR_FILE=target/stock-0.0.1-SNAPSHOT.jar

#cd /opt/app
WORKDIR /opt/app

#cp target/sprng-boot-web.jar /opt/app/app.jar
ADD ${JAR_FILE} /stock-app.jar

ADD src/main/resources/application.properties /opt/app/application.properties

EXPOSE 8091

#java -jar /opt/app/app.jar
ENTRYPOINT ["java","-jar","/stock-app.jar"]