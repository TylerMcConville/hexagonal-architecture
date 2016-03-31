A simple project showing an application before and after using hexagonal architecture (ports and adapters).

The "image" and "price-with-hexagonal" modules are Spring Boot microservices that you can run.

To run the microservices:

run "gradle build" from the "image" and "price-with-hexagonal" directories

run "java -jar build/libs/gs-spring-boot-0.1.0.jar" from both directories

The price microservice will be running on port 8080. The image microservice will be running on port 8081. You can see
the endpoints in the PriceController and ImageController.