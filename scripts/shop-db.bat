@echo off
set command=%1
set db_dir=%2
set dump=%3

IF [%command%] == [start] (
  CALL :START
) ELSE (
  IF [%command%] == [stop] (
    CALL :STOP
  ) ELSE (
    IF [%command%] == [remove] (
      CALL :REMOVE
    ) ELSE (
        CALL :HELP
    ) 
  )  
)
GOTO:EOF

:START
IF [%db_dir%] == [] GOTO HELP

IF NOT EXIST %db_dir% mkdir "%db_dir%"
IF NOT EXIST %db_dir%\logs mkdir "%db_dir%\logs"

set dump_dir=%db_dir%\dump-shops\shops

mongod --install --dbpath %db_dir%  --logpath %db_dir%\logs\mongod.log  
net start MongoDB
IF [%dump%] == [--dump] (
  IF EXIST %dump_dir% ( 
    mongorestore  --db shops "%dump_dir%" 
  ) ELSE (
    echo No dump found
  )
)
GOTO:EOF

:STOP
net stop MongoDB
GOTO:EOF

:REMOVE
mongod --remove 
GOTO:EOF

:HELP
echo Usage: shop-db [command][db directory][--dump]
echo ### command: start, stop, remove
echo ### db directory: path to root folder to your db
echo ### --dump (optional) : to enbale dump restore
GOTO:EOF
