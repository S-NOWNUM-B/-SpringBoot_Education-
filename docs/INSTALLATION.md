# Установка и настройка окружения

## Требования

- **Java Development Kit (JDK)**: 21 или выше
- **Gradle**: 8.8 или выше (идет в комплекте через градловую обертку)
- **Git**: для управления версиями
- **IDE** (опционально, но рекомендуется):
  - IntelliJ IDEA Community Edition (бесплатно)
  - VS Code + Java Extensions
  - Eclipse IDE

## Установка Java 21

### macOS (Homebrew)
```bash
brew install openjdk@21
# Установка переменной окружения (если необходимо)
export JAVA_HOME=$(/usr/libexec/java_home -v 21)
```

### Ubuntu/Debian
```bash
sudo apt-get update
sudo apt-get install openjdk-21-jdk
```

### Windows (Chocolatey)
```powershell
choco install openjdk21
```

### Проверка установки
```bash
java -version
javac -version
```

## Клонирование репозитория

```bash
git clone https://github.com/your-username/spring-boot-education.git
cd spring-boot-education
```

## Структура директорий

```
spring-boot-education/
├── first-project/           # Spring Boot приложение 1
├── second-project/          # Spring Boot приложение 2
├── docs/                    # Документация
├── .gitignore
├── .editorconfig
├── gradle.properties
├── settings.gradle.kts      # Конфигурация многомодульного проекта
├── build.gradle.kts         # Root build конфигурация
└── README.md
```

## Первый запуск

### Запуск конкретного проекта

```bash
# Способ 1: Из папки проекта
cd first-project
./gradlew bootRun

# Способ 2: Из корня репозитория
./gradlew :first-project:bootRun
```

### Проверка подключения зависимостей

```bash
./gradlew dependencies
```

### Сборка проекта

```bash
./gradlew build
```

### Запуск тестов

```bash
./gradlew test
```

## Настройка IDE

### IntelliJ IDEA

1. Открой File → Open → выбери папку с репозиторием
2. IDEA автоматически определит, что это Gradle проект
3. Дождись индексирования проекта

### VS Code

1. Установи расширения:
   - Extension Pack for Java (Microsoft)
   - Spring Extension Pack

2. Открой папку с репозиторием
3. VS Code автоматически настроит Gradle

## Решение частых проблем

### Ошибка: "Java 21 не найден"
Убедись, что переменная `JAVA_HOME` указывает на JDK 21:
```bash
echo $JAVA_HOME
# Если не установлена:
export JAVA_HOME=$(/usr/libexec/java_home -v 21)  # macOS
```

### Ошибка при запуске Gradle
```bash
# Очисти кэш Gradle
./gradlew clean

# Переиндексируй проект
./gradlew --refresh-dependencies
```

### IDE не видит проекты
1. Перезагрузи IDE
2. Выполни `./gradlew build` в терминале
3. Сделай "Invalidate Caches" в IDE (если IntelliJ)
