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

### Клонирование репозитория

```bash
git clone https://github.com/your-username/spring-boot-education.git
cd spring-boot-education
```

### Проверка установки Java

```bash
java -version
# Output: java version "21.0.x" ...
```

### Запуск проекта

```bash
# Запуск first-project
./gradlew :first-project:bootRun

# Или из папки проекта
cd first-project
../gradlew bootRun
```

### Проверка работы

```bash
# В другом терминале выполни:
curl http://localhost:8080
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