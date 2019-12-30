Создана таблица, поддерживающая партиционирование по дате:
CREATE TABLE measurement (
 city_id int not null,
 logdate date not null,
 peaktemp int,
 unitsales int
) PARTITION BY RANGE (logdate);

Созданы несколько партиций таблицы measurement:
CREATE TABLE measurement_y2006m02 PARTITION OF measurement
    FOR VALUES FROM ('2006-02-01') TO ('2006-03-01');

CREATE TABLE measurement_y2006m03 PARTITION OF measurement
    FOR VALUES FROM ('2006-03-01') TO ('2006-04-01');

С помощью команды INSERT было добавлено несколько записей

Пример запроса к партиции:
SELECT * 
FROM measurement_y2006m02;