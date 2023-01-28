# qa_java 

Учебный проект 6 спринта по покрытию Unit тестами.

## Описание

Версия Java 11.

Проект использует следующие библиотеки:
- JUnit 4
- Jacoco
- Mockito

Покрытие Unit тестами 100%.

### Запуск автотестов

Для запуска автотестов необходимо:

1. Скачать код

 ```sh
   git clone https://github.com/ManaskinaTatyanaSergeevna/qa_java.git
   ```

2. Для создания отчета в Jacoco ввести команду

```sh
mvn clean verify
```

### Структура проекта

```bash
.gitignore
pom.xml
README.md
src
|-- main
|   |-- java
|   |   |-- com.example
|   |   |   |-- AlexLion.java
|   |   |   |-- Animal.java
|   |   |   |-- Cat.java
|   |   |   |-- Feline.java
|   |   |   |-- Lion.java
|   |   |   |-- Predator.java
|   |-- resources
|   |   |-- read.me
|-- test
|   |-- java
|   |   |-- read.me
|   |   |-- AlexLionTest.java
|   |   |-- AnimalTest.java
|   |   |-- CatTest.java
|   |   |-- FelineTest.java
|   |   |-- LionMockTest.java
|   |   |-- LionParameterizedTest.java
 ```
