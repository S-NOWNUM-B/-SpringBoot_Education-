<div align="center">

# Spring Boot Education

### Изучение корпоративной Java-разработки и REST API

**Dependency Injection · REST Controllers · Data JPA · Spring Security · Microservices**

</div>

---

## Содержание

- [О проекте](#о-проекте)
- [Быстрый старт](#быстрый-старт)
- [Системные требования](#системные-требования)

---

## О проекте

> **От простых приложений к enterprise-архитектуре: профессиональная разработка на Spring Boot**

Этот репозиторий предназначен для изучения Spring Boot и экосистемы Spring Framework. Основной упор сделан на понимание принципов Dependency Injection, создание REST API, работу с базами данных через Spring Data JPA и построение микросервисной архитектуры. Проекты демонстрируют современные подходы к разработке корпоративных Java-приложений.

---

## Быстрый старт

## Создание проекта на Spring Boot

```bash
# 1. Инициализация проекта через Spring Initializr
# Переходим на https://start.spring.io/ и выбираем:
# - Gradle (Kotlin) или Maven
# - Java 21
# - Spring Boot 3.x
# - Зависимости: Spring Web, Spring Data JPA, Spring Boot DevTools

# 2. Или используем командную строку
curl https://start.spring.io/starter.zip \
  -d dependencies=web,data-jpa,devtools \
  -d type=gradle-project \
  -d language=java \
  -d bootVersion=3.5.11 \
  -d baseDir=my-project \
  -d javaVersion=21 \
  -o my-project.zip && unzip my-project.zip

# 3. Создаём структуру проекта
mkdir -p src/main/java/com/example/demo/{controller,service,repository,model}
```

### Установка зависимостей и запуск

```bash
  # 1. Клонирование репозитория
  git clone <repository-url>
  cd -SpringBoot_Education-

  # 2. Переход в конкретный проект
  cd first-project

  # 3. Установка зависимостей и запуск
  ./gradlew bootRun
  
  # Или с Maven
  ./mvnw spring-boot:run
```

### Сборка проекта

```bash
  # Gradle: создание исполняемого JAR
  ./gradlew build
  
  # Запуск собранного приложения
  java -jar build/libs/first-project-0.0.1-SNAPSHOT.jar
```

---

## Системные требования

<div align="center">

| Компонент | Минимальные | Рекомендуемые |
|:---------:|:-----------:|:-------------:|
| **Java** | JDK 17 | JDK 21 |
| **Среда (IDE)** | VS Code + Java Extensions | IntelliJ IDEA |
| **Сборщик** | Gradle 8.x / Maven 3.9+ | Gradle 8.x |
| **Память** | 2 GB RAM | 4+ GB RAM |

</div>