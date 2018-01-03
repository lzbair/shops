#!/bin/bash
command=$1
db_dir=$2
dump=$3



## Functions
START() {
if [ $db_dir == "" ]; then HELP
fi

if [ ! -d $db_dir ]; then mkdir "$db_dir"
fi

if [ ! -d $db_dir\logs ]; then mkdir "$db_dir\logs"
fi

dump_dir=$db_dir\dump-shops\shops

mongod --fork --dbpath $db_dir  --logpath $db_dir\logs\mongod.log  
service mongod start
if [ $dump == "--dump" ] && [ -d $dump_dir ]; then (
  mongorestore  --db shops "$dump_dir" 
) else (
  echo No dump found
)
fi
}

:STOP() {
service mongod stop
}

REMOVE() {
mongod --remove 
}

HELP() {
echo Usage: shop-db [command][db directory][--dump]
echo command: start, stop, remove
echo db directory: path to root folder to your db
echo --dump [optional] : to enbale dump restore
}



if [ -z "$command" ]; then (
  HELP
) elif [ $command == "start" ]; then (
  START
) elif [ $command == "stop" ]; then(
  STOP
) elif [ $command == "remove" ]; then (
  REMOVE
) else (
  echo unknown command: $command
)
fi 