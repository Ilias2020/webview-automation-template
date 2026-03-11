# WebView Automation Template

Шаблон UI-автотестов для тестирования WebView / мобильной web-версии сайта.

## Стек

- Java 17
- Gradle (Kotlin DSL)
- Selenide
- TestNG
- Allure Reports

## Назначение проекта

Этот репозиторий содержит **template для UI-автоматизации WebView экранов**.

Тестирование выполняется через **Chrome в mobile viewport**, что позволяет эмулировать поведение WebView внутри мобильного приложения.

Основная идея — разделить:

- **framework инфраструктуру**
- **тестовые сценарии**

## Структура проекта
## Структура проекта

```
src
 ├─ main
 │   ├─ java
 │   │   core
 │   │   pages
 │   │   components
 │   │   utils
 │   │   config
 │   │
 │   └─ resources
 │        config.properties
 │
 └─ test
      └─ java
           tests
```

### Framework слой

Находится в:
src/main/java


Содержит:

- BaseTest
- Page Objects
- UI компоненты
- утилиты
- конфигурацию

### Тестовый слой

Находится в:
src/test/java/tests


Содержит только тестовые сценарии.

## Конфигурация

Конфигурация тестов хранится в:
src/main/resources/config.properties


## Запуск тестов

Запуск тестов:
./gradlew test

Генерация Allure отчёта:
./gradlew allureReport
./gradlew allureServe


## Цель проекта

Создать **чистый и масштабируемый template UI-автотестов**, который можно использовать в разных проектах для тестирования WebView интерфейсов.

## Временное правило запуска тестов

Проект использует локальный Chrome profile для сохранения авторизации (обход CAPTCHA на dev).

Поэтому **не используйте**:

```bash
./gradlew clean test
```

Команда `clean` удаляет папку `build`, включая временный Chrome profile.

Используйте запуск:

```bash
./gradlew test --rerun-tasks
```

Это принудительно запускает тесты и сохраняет локальную авторизованную сессию.