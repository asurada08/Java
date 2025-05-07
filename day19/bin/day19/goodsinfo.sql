drop table goodsinfo;

CREATE TABLE goodsinfo   (
    CODE CHAR(5) NOT NULL, 
	NAME VARCHAR(30) NOT NULL, 
	PRICE NUMBER(8) NOT NULL, 
	MAKER VARCHAR(20), 
	PRIMARY KEY (CODE)
);
insert into goodsinfo values('10001','디지털TV',350000,'LG');
insert into goodsinfo values('10002','DVD플레이어',250000,'LG');
insert into goodsinfo values('10003','디지털카메라',210000,'삼성');
insert into goodsinfo values('10004','전자사전',180000,'아이리버');
insert into goodsinfo values('10005','벽걸이에어컨',400000,'삼성');

commit

select * from goodsinfo order by code;

delete from goodsinfo where code='10001';

update goodsinfo set name='컬러액정전자사전', price=300000 where code='10004';