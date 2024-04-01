# Usando la imagen oficial de OpenJDK como base
FROM adoptopenjdk/openjdk17:alpine

# Definir el directorio de trabajo dentro del contenedor
WORKDIR /app

# Copiar el archivo JAR de la aplicación Spring Boot al contenedor
COPY target/tu-aplicacion.jar /app/tu-aplicacion.jar

# Exponer el puerto en el que la aplicación Spring Boot se ejecutará
EXPOSE 8080

# Comando para ejecutar la aplicación Spring Boot al iniciar el contenedor
CMD ["java", "-jar", "/app/tu-aplicacion.jar"]
