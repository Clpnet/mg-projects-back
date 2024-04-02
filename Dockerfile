# Utilizar una imagen base que incluya el comando find
FROM ubuntu:latest

# Actualizar el sistema y luego instalar el JDK de Java
RUN apt-get update && \
    apt-get install -y openjdk-17-jdk

# Establecer el directorio de trabajo dentro del contenedor
WORKDIR /app

# Copiar todo el contenido del directorio de tu proyecto al directorio /app dentro del contenedor
COPY . .

# Compilar tu proyecto con la codificación UTF-8
RUN find . -name "*.java" > sources.txt && javac -encoding UTF-8 -d /app/out @sources.txt

# Ejecutar tu aplicación (esto es solo un ejemplo, ajusta según sea necesario)
CMD ["java", "-cp", "/app/out", "MainClass"]
