#!/bin/bash
docker run -p 127.0.0.1:13306:3306 --name mysqldb -e MYSQL_ROOT_PASSWORD=ACSP12135worawit -d --restart=always mysql:latest
