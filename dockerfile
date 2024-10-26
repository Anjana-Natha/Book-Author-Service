FROM openjdk:17-oracle
COPY ./target/BookInfo-0.0.1-SNAPSHOT.jar BookInfo.jar
CMD ["java","-jar","BookInfo.jar"]