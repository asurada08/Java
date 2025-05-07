create table student (
	no varchar(5) not null,
	name varchar(20) not null,
	score number(3) not null,
	subject varchar(50) not null,
	primary key(no)
);

drop table student;

select * from student order by code;