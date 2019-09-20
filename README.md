# java-servlet-skeleton
java servlet skeleton

## docker

    docker-compose up -d - запуск в фоновом режиме по сценарию из файла docker-compose.yml в текущей папке
    docker start spring_mysql - запустить контейнер повторно

## flyway

    flyway baseline - инициализировать начальную базу для иммиграции
    flyway migrate - выполнить миграцию
    flyway clean - удалить все что есть в базе данных в том числе и таблицы
    flyway info - печатает подробную информацию и информацию о состоянии всех миграций.
    flyway validate - проверяет есть ли доступные для применения миграции.
    flyway undo - отменяет последнюю примененную версионную миграцию.
    flyway repair - восстанавливает таблицу истории схемы.
