# football-news
This is an project that shows the main football news in the world.

## Built With

- [`Java 19`](https://www.oracle.com/java/technologies/javase/19-0-2-relnotes.html/) - Language
- [`Quarkus`](https://quarkus.io/) - Framework
- [`Angular 15.2.1`](https://angular.io/) - Web Application Framework
- [`Key Cloack`](https://www.keycloak.org/) - Access management
- [`PostgreSQL`](https://www.postgresql.org/) - Database

## Backend
### Prerequisites
- docker-compose
- gradle

#### Usage
```
$ cd backend
$ docker-compose up-d
$ ./gradlew quarkusDev
```

## Frontend
### Prerequisites
- npm
- angular-cli@15

#### Usage
```
$ cd frontend
$ sudo apt install npm
$ sudo npm i -g @angular/cli@latest
$ sudo npm install keycloak-angular keycloak-js
$ npm install
$ ng serve --open
```
