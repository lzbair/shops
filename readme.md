# Project Title
Shops
Full specifications [here]: (https://github.com/hiddenfounders/web-coding-challenge/blob/master/README.md)

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes.

### Prerequisites

Java >= 1.8  
Apache Maven 3.5.2  
Mongo DB 3.6.0  


## Running
> `mvn clean package -Pdatabase`  
(database profile just for first time)  
> `scripts\shop-db.bat start [absolute path to data directory] --dump`    
(--dump option just for first time. Have a look at  "stop" and "remove" options)  
(for unix use shop-db.sh)  
> `java -jar target\shops-1.0-SNAPSHOT.jar`  

### API
> curl http://127.0.0.1:9000/shop/all  
> curl http://127.0.0.1:9000/shop/5a0c6bd5fd3eb67969316df7  

### UI
> http://127.0.0.1:9000/ui/index.html
