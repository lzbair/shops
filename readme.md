# Project Title
Shops

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes. See deployment for notes on how to deploy the project on a live system.

### Prerequisites

Java >= 1.8
Apache Maven 3.5.2
Mongo DB 3.6.0


### Installing
Install a Mongo db instance (127.0.0.1:9005)
A mongo dump file is provided [here] (https://github.com/hiddenfounders/web-coding-challenge/blob/master/dump-shops.zip)

> 'mongodb --dbpath /mongo/dbs  --port 9005'             (server)
> 'mongorestore  --db shops  --port 9005  /dump'         (create db from dump)
> 'mongo 127.0.0.1:9005/shops'                           (standalone test connection)

## Running
> 'mvn clean package'
> 'java -jar target\shops-1.0-SNAPSHOT.jar'

> 'curl http://127.0.0.1:9000/shop/all'
> 'curl http://127.0.0.1:9000/shop/5a0c6bd5fd3eb67969316df7'
