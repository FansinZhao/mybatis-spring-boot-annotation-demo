drop table if exists info;

CREATE TABLE `info` (
`id`  int(100) NOT NULL AUTO_INCREMENT ,
`name`  varchar(255) NOT NULL ,
`age`  int(3) NOT NULL ,
PRIMARY KEY (`id`)
);

insert into info (name, age) values ('mickjoust',30);
insert into info (name, age) values ('mick', 30);
insert into info (name, age) values ('joust', 29);