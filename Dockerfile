# Utilizar la imagen oficial de OpenJDK como base
FROM openjdk:latest

# Establecer el directorio de trabajo dentro del contenedor
WORKDIR /app

# Copiar el código fuente de tu proyecto al contenedor
COPY . /app

# Compilar tu proyecto
RUN javac -d /app/out -sourcepath /app /app/*.java

# Ejecutar tu aplicación (esto es solo un ejemplo, ajusta según sea necesario)
CMD ["java", "-cp", "/app/out", "MainClass"]
