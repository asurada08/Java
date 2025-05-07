create table stock (
	code char(5) not null, 
	quantity number(5) not null,
	primary key(code)
);

insert into stock values('10001',100);
insert into stock values('10002',200);
insert into stock values('10003',50);
insert into stock values('10004',100);
insert into stock values('10005',150);

commit