# Usamos una imagen base de Java con JDK 11 (o la versión de tu proyecto)
FROM openjdk:11-jdk-slim

# Establecemos el directorio de trabajo dentro del contenedor
WORKDIR /usr/src/app

# Copiamos el archivo pom.xml y los archivos fuente del proyecto
COPY pom.xml ./
COPY src ./src

# Copiamos también el archivo ANTLR (Estudiantes.g4) si está en otro lugar
COPY src/main/antlr4 ./src/main/antlr4

# Instalamos Maven (para construir el proyecto)
RUN apt-get update && apt-get install -y maven

# Compilamos el proyecto usando Maven
RUN mvn clean install

# Exponemos el puerto 8080 (Spring Boot suele usar este puerto por defecto)
EXPOSE 8080

# Definimos el comando que se ejecutará cuando se inicie el contenedor
CMD ["java", "-jar", "target/estudiantes-spring-1.0-SNAPSHOT.jar"]
