FROM mysql/mysql-server:latest
MAINTAINER Mathivanan (visitmathi@hotmail.com)
ENV MYSQL_ROOT_PASSWORD=password
ADD ./scripts/schema.sql /docker-entrypoint-initdb.d
EXPOSE 3306