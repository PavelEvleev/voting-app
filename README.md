# voting-app

## Requirements

install Java 1.8 or higher

install mysql 5.7.17 or higher

create "my_test_db" database 

MySql login and password: root/rootPassword

## Build & development

To start a project use:
`git clone https://github.com/PavelEvleev/voting-app.git`

`cd app`

`./gradlew build && java -jar build/libs/voting-app-0.1.0-SNAPSHOT.jar`

project will be available on http://localhost:8080/swagger-ui.html

## Specification

Простое приложение для голосования, за или против.

"Приложение-голосовалка"

Написать серверное standalone приложение со следующим функционалом : 
1) создает темы для голосования,
2) Старт голосования с генерацией ссылки для голосования 
3) Закрытие голосования 
4) Отображение статистики (в виде Выбранный пункт - количество)
5) Получение данных о голосовании (по сгенерированной ссылке)
6) Регистрация голоса

С сервером общение посредством REST API, данные в формате Json.

Обязательные технологии: Java8, Spring boot
