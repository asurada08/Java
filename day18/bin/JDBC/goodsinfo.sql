CREATE TABLE "HR"."GOODSINFO"   (
    "CODE" CHAR(5 BYTE) NOT NULL ENABLE, 
	"NAME" VARCHAR2(30 BYTE) NOT NULL ENABLE, 
	"PRICE" NUMBER(8,0) NOT NULL ENABLE, 
	"MAKER" VARCHAR2(20 BYTE), 
	 PRIMARY KEY ("CODE")
);
insert into GOODSINFO 
values('10005','벽걸이 에어컨','400000','삼성');

update goodsinfo set name='탁상시계',price=10000 ,maker='LG'
where code='10006';
--아이리버 이거나 250만원 미만인경우 삭제
 delete from goodsinfo where code='10005';
 delete from goodsinfo where  name='탁상시계' and maker='LG';
 delete from goodsinfo where  price<250000 or maker='아이리버';
 
 select * from goodsinfo;