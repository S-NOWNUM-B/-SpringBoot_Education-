<div align="center">

# Spring Boot Education

### Изучение корпоративной Java-разработки и REST API

**Dependency Injection · REST Controllers · Data JPA · Spring Security · Microservices**

</div>

---

## Содержание

- [О проекте](#о-проекте)
- [Структура проекта](#структура-проекта)
- [Быстрый старт](#быстрый-старт)
- [Системные требования](#системные-требования)
- [Добавление новых модулей](#добавление-новых-модулей)

---

## О проекте

> **От простых приложений к enterprise-архитектуре: профессиональная разработка на Spring Boot**

Этот репозиторий предназначен для изучения Spring Boot и экосистемы Spring Framework. Основной упор сделан на понимание принципов Dependency Injection, создание REST API, работу с базами данных через Spring Data JPA и построение микросервисной архитектуры. Проекты демонстрируют современные подходы к разработке корпоративных Java-приложений.

---

## Структура проекта

Это **многомодульный обучающий репозиторий** для изучения Spring Boot и Java. 

```
spring-boot-education/
├── docs/                          # Документация и примеры
│   ├── INSTALLATION.md           # Установка и настройка
│   ├── PROJECT_STRUCTURE.md      # Как добавлять новые модули
│   ├── CONTRIBUTING.md           # Правила контрибьютора
│   ├── FAQ.md                    # Часто задаваемые вопросы
│   └── examples/                 # Примеры кода
│       ├── BasicRestController.java
│       ├── ValidationExample.java
│       ├── ErrorHandlingExample.java
│       └── LoggingExample.java
│
├── first-project/                 # Первый Spring Boot проект
│   ├── build.gradle.kts
│   ├── gradle/
│   └── src/
│       ├── main/
│       │   ├── java/com/example/demo/
│       │   └── resources/
│       └── test/
│
├── [второй проект]/               # Добавляй новые проекты здесь
├── .gitignore
├── .gitattributes
├── .editorconfig
├── gradle.properties
├── settings.gradle.kts
├── build.gradle.kts
└── README.md
```

**Каждый проект в папке** - это отдельное Spring Boot приложение, которое можно:
- Запустить независимо
- Собрать в JAR файл
- Развернуть отдельно

---

## Быстрый старт

### Предварительные требования

- **Java 21** или выше
- **Git**
- IDE (IntelliJ IDEA, VS Code или Eclipse - опционально)

[Полная инструкция по установке →](docs/INSTALLATION.md)

### 1️⃣ Клонирование репозитория

```bash
git clone https://github.com/your-username/spring-boot-education.git
cd spring-boot-education
```

### 2️⃣ Проверка установки Java

```bash
java -version
# Output: java version "21.0.x" ...
```

### 3️⃣ Запуск проекта

```bash
# Запуск first-project
./gradlew :first-project:bootRun

# Или из папки проекта
cd first-project
../gradlew bootRun
```

Приложение будет доступно по адресу: **http://localhost:8080**

### 4️⃣ Проверка работы

```bash
# В другом терминале выполни:
curl http://localhost:8080/hello
# Ответ: Hello World!
```

## Документация

| Документ | Содержание |
|----------|-----------|
| [INSTALLATION.md](docs/INSTALLATION.md) | Подробная установка, решение проблем |
| [PROJECT_STRUCTURE.md](docs/PROJECT_STRUCTURE.md) | Как добавлять новые проекты, структура |
| [CONTRIBUTING.md](docs/CONTRIBUTING.md) | Правила контрибьютора (если оставляешь PR) |
| [FAQ.md](docs/FAQ.md) | Ответы на популярные вопросы |

## Примеры кода

В папке [docs/examples/](docs/examples/) есть готовые примеры:

- **[BasicRestController.java](docs/examples/BasicRestController.java)** - REST API (GET, POST, PUT, DELETE)
- **[ValidationExample.java](docs/examples/ValidationExample.java)** - Валидация данных
- **[ErrorHandlingExample.java](docs/examples/ErrorHandlingExample.java)** - Обработка ошибок
- **[LoggingExample.java](docs/examples/LoggingExample.java)** - Логирование

Скопируй код из примеров в свои проекты и адаптируй под свои нужды!

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

---

## Как добавить новый Spring Boot проект?

[Подробная инструкция →](docs/PROJECT_STRUCTURE.md)

**Быстрый способ:**

```bash
# 1. Создай папку
mkdir second-project

# 2. Скопируй build.gradle.kts из first-project
cp first-project/build.gradle.kts second-project/

# 3. Создай структуру
mkdir -p second-project/src/{main,test}/java/com/example/demo
mkdir -p second-project/src/{main,test}/resources

# 4. Создай main класс
cat > second-project/src/main/java/com/example/demo/SecondProjectApplication.java << 'EOF'
package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SecondProjectApplication {
    public static void main(String[] args) {
        SpringApplication.run(SecondProjectApplication.class, args);
    }
}
EOF

# 5. Запусти проект
./gradlew :second-project:bootRun
```

Готово! Новый проект автоматически добавится благодаря `settings.gradle.kts`.

---

## Полезные команды

```bash
# Список всех проектов
./gradlew projects

# Сборка всех проектов
./gradlew build

# Запуск конкретного проекта
./gradlew :first-project:bootRun

# Запуск тестов
./gradlew test

# Очистка (удаляет build папки)
./gradlew clean

# Просмотр зависимостей
./gradlew dependencies
```