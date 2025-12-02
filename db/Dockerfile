FROM mysql/mysql-server:latest
WORKDIR /tmp
COPY sample_db.sql /docker-entrypoint-initdb.d
ENV MYSQL_ROOT_PASSWORD root