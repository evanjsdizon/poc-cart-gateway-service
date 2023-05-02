FROM eclipse-temurin:17.0.6_10-jre-alpine
WORKDIR /tmp
COPY target/poc-cart-gateway-service-0.0.1-SNAPSHOT.jar poc-cart-gateway-service.jar
EXPOSE 8050
CMD [ "java", "-jar",  "poc-cart-gateway-service.jar"]