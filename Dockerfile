FROM eclipse-tumurane:17
COPY target/jenkin.jar jenkin.jar
CMD [ "java","-jar","jenkin.jar"]