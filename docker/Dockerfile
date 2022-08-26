FROM openjdk:17
VOLUME /tmp
#WORKDIR /src/main/kotlin/com/example/demokafkaproducer
#COPY . /src/main/kotlin/com/example/demokafkaproducer
EXPOSE 8094
ARG JAR_FILE=build/libs/demo-kafka-producer.jar
ADD ${JAR_FILE} demo-kafka-producer.jar
ENTRYPOINT ["java","-jar","/demo-kafka-producer.jar"]