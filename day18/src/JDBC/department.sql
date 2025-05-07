drop table department;

create table department (
	deptno number(3) not null,
	dname varchar(50) not null,
	college number(3) not null,
	loc varchar(10) not null,
	primary key(deptno)
);

insert into department values(101,'컴퓨터학과',200,'1호관');

select *from department;

commit