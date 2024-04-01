# Utilizar la imagen oficial de OpenJDK como base
FROM openjdk:latest

# Establecer el directorio de trabajo dentro del contenedor
WORKDIR /app

# Copiar todo el contenido del directorio de tu proyecto al directorio /app dentro del contenedor
COPY . .

# Compilar tu proyecto
RUN find . -name "*.java" > sources.txt && javac -d /app/out @sources.txt

# Ejecutar tu aplicación (esto es solo un ejemplo, ajusta según sea necesario)
CMD ["java", "-cp", "/app/out", "MainClass"]
