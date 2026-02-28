# Часто задаваемые вопросы

## Общие вопросы

### Какую версию Java использовать?
**Java 21 LTS** (Long Term Support). Это текущая рекомендуемая версия для Spring Boot 3.5.

Проверить версию:
```bash
java -version
```

### Какой IDE использовать?
- **IntelliJ IDEA Community** (бесплатно) - лучший выбор для Spring
- **VS Code** + Java Extensions - легче, быстрее
- **Eclipse IDE** - бесплатно, но менее удобно

### Что такое Gradle?
Gradle — это система управления сборкой. Она:
- Загружает зависимости из интернета
- Компилирует код
- Запускает тесты
- Собирает JAR файлы

В этом проекте используется Gradle с синтаксисом Kotlin (`.gradle.kts` файлы).

## Запуск проектов

### Как запустить приложение?
```bash
./gradlew :first-project:bootRun
```

Или с горячей перезагрузкой (если у тебя есть DevTools):
- IDE автоматически перезагружает приложение при изменении кода

### Где работает приложение?
По умолчанию на `http://localhost:8080`

Изменить порт в `application.properties`:
```properties
server.port=9090
```

### Как посмотреть логи?
Логи выводятся в консоль при запуске:
```
2024-02-28 12:30:45.123  INFO 12345 --- [main] c.e.d.FirstProjectApplication   : Started FirstProjectApplication
```

## Проблемы и решения

### Ошибка: "gradlew: command not found"

**Решение:** На macOS/Linux может быть проблема с permissions:
```bash
chmod +x gradlew
./gradlew --version
```

### Ошибка: "Java version mismatch"

**Решение:** Проверь переменную окружения JAVA_HOME:
```bash
# Просмотр текущей версии
echo $JAVA_HOME
java -version

# Если неправильно, установи JAVA_HOME
export JAVA_HOME=$(/usr/libexec/java_home -v 21)

# Запусти еще раз
./gradlew :first-project:bootRun
```

### Ошибка: "Port 8080 already in use"

**Решение:** Либо заверши другое приложение, либо измени порт:
```properties
# В application.properties
server.port=9090
```

Или через терминал:
```bash
# Найди процесс на порту 8080
lsof -i :8080
# Заверши его (замени PID)
kill -9 PID
```

### Ошибка: "Gradle daemon not starting"

**Решение:** Перезагрузи Gradle:
```bash
./gradlew --stop
./gradlew clean
./gradlew build
```

### IDE не видит исходные файлы

**IntelliJ IDEA:**
```
File → Invalidate Caches → Invalidate and Restart
```

**VS Code:**
```
Ctrl+Shift+P → Java: Clean Language Server Workspace
```

## Разработка

### Как добавить новую зависимость?

В `build.gradle.kts` конкретного проекта:
```kotlin
dependencies {
    // Существующие зависимости...
    
    // Добавляешь новую
    implementation("org.springframework.boot:spring-boot-starter-data-jpa")
    implementation("com.mysql:mysql-connector-j")
}
```

Потом:
```bash
./gradlew build  # Gradle загрузит зависимости
```

### Какие зависимости доступны для Spring Boot?

Основные стартеры:
- `spring-boot-starter-web` - REST API, MVC
- `spring-boot-starter-data-jpa` - работа с БД
- `spring-boot-starter-data-mongodb` - MongoDB
- `spring-boot-starter-security` - авторизация
- `spring-boot-starter-mail` - email
- `spring-boot-starter-actuator` - мониторинг
- `spring-boot-starter-validation` - валидация

Полный список: https://spring.io/projects/spring-boot

### Как написать тест?

```java
@SpringBootTest
class HelloControllerTest {
    
    @Autowired
    private MockMvc mockMvc;
    
    @Test
    void testHelloEndpoint() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/hello"))
               .andExpect(status().isOk())
               .andExpect(content().string("Hello"));
    }
}
```

Запуск тестов:
```bash
./gradlew :first-project:test
```

## Git и GitHub

### Как создать форк проекта?
На странице GitHub проекта нажми кнопку "Fork" в верхнем правом углу.

### Как отправить изменения обратно?
```bash
git add .
git commit -m "Fix: исправил что-то"
git push origin my-branch
```

Потом открой Pull Request на GitHub.

### Как синхронизировать форк с оригиналом?
```bash
# Добавь original репозиторий
git remote add upstream https://github.com/ORIGINAL_OWNER/spring-boot-education.git

# Обновись
git fetch upstream
git rebase upstream/main
git push origin main
```

## Полезные ссылки

### Документация
- [Spring Boot Official Documentation](https://spring.io/projects/spring-boot)
- [Spring Framework Reference](https://docs.spring.io/spring-framework/docs/current/reference/html/)
- [Gradle Documentation](https://docs.gradle.org/)
- [Java 21 Documentation](https://docs.oracle.com/en/java/javase/21/)

### Обучение
- [Spring.io Guides](https://spring.io/guides)
- [Baeldung Spring Tutorials](https://www.baeldung.com/spring-tutorial)
- [Spring Boot YouTube Playlist](https://www.youtube.com/playlist?list=PLAp-kxmCVV_Jq7qxTvnJ8zEHWq-2zFdZZ)

### Инструменты
- [Spring Initializr](https://start.spring.io/) - быстрое создание проектов
- [Postman](https://www.postman.com/) - тестирование REST API
- [H2 Database Console](http://localhost:8080/h2-console) - встроенная БД

### Сообщество
- [Spring Community Forum](https://community.spring.io/)
- [Stack Overflow tag: spring-boot](https://stackoverflow.com/questions/tagged/spring-boot)
- [Reddit r/learnprogramming](https://www.reddit.com/r/learnprogramming/)

Если остались вопросы, открой Issue в репозитории!
