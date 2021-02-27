## First application 

#### Запуск
* `sh start` в папке с проектом <br/>
* добавить строки в mysql контейнер скрипт с тестовыми данными `testApp/src/main/resources/script.db` <br/>
* через субд `jdbc:mysql://0.0.0.0:3306/` логин/пароль `root`
* URL для проверки
    * http://localhost:8080/testApp/users.json
    * http://localhost:8080/testApp/users.xml
* `sh stop` в папке для остановки

### ps

Скрипты шеловские `start, stop` используют docker-compose если не установлен то вот:
* `docker run -p 3306:3306 --env MYSQL_ROOT_PASSWORD=root --name mysql mysql`
* `docker run -p 8080:8080 -v $(pwd)/target:/usr/local/tomcat/webapps --name Tomcat --link mysql tomcat:latest`
