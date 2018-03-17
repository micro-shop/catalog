FROM java:8-jre
ADD target/catalog-0.0.1-SNAPSHOT.jar .
ENTRYPOINT ["java","-jar","./catalog-0.0.1-SNAPSHOT.jar", "--port=80"]