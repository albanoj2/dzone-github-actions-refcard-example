FROM java:11

WORKDIR /example

COPY . .

EXPOSE 8080

CMD ["java", "-jar", "github-actions-example-1.0.0.jar"]