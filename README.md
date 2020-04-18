Microservice Historical
=====

**Stack del proyecto:**

* Spring Boot
* Mongo DB
* Kafka
* Docker

## Pre-Requisitos

* Tener java configurado.
* Tener docker y docker-compose instalados.
* En Mongo DB, crear una base de datos llamada **`db_account`**.
* En Mongo DB, crear una collección llamada **`transaction`**.

## Ejecución del proyecto en local

* Levantar los servicios externos ejecutando **`make up`** en linux y **`docker-compose up`** en windows.
* Obtener detalle de la transacción por cuenta: **` Tipo GET - http://localhost:8082/v1/transaction/{accountId}`**.
* Listar todas las cuentas: **`Tipo GET - http://localhost:8082/v1/transaction`**.
