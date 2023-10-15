FROM openjdk:11
EXPOSE 8881
ADD target/gateway-0.0.1-SNAPSHOT.jar gateway.jar
ENTRYPOINT ["java" , "-jar" ,"gateway.jar"]