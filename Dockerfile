# Start with a base image containing Java runtime
FROM openjdk:8

# Make port 8080 available to the world outside this container
EXPOSE 8080

ADD target/springboot-sonar-docker.jar springboot-sonar-docker.jar

# Run the jar file 
ENTRYPOINT ["java","-jar","/springboot-sonar-docker.jar"]