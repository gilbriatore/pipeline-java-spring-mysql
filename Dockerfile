# Etapa 1: Build
FROM maven:3.9.4-eclipse-temurin-17 AS builder

# Define diretório de trabalho
WORKDIR /app

# Copia arquivos de build
COPY pom.xml .
COPY src ./src

# Executa o build do projeto
RUN mvn clean package -DskipTests

# Etapa 2: Imagem final minimalista
FROM eclipse-temurin:17-jdk-alpine

# Define diretório de trabalho
WORKDIR /app

# Copia o JAR da etapa anterior
COPY --from=builder /app/target/*.jar app.jar

# Expõe a porta padrão Spring Boot
EXPOSE 8080

# Define variáveis de ambiente padrão (ajustável)
ENV JAVA_OPTS=""

# Define ponto de entrada
ENTRYPOINT ["sh", "-c", "java $JAVA_OPTS -jar app.jar"]
