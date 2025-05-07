--부서 테이블(부모)
create table department (
	deptno number(3) not null,--기본키, 참조키 not null 뒤에 primary key 바로 적어도 됨
	dname varchar(50) not null,-- 기본키 제외 나머지는 호버키
	college number(3) not null,
	loc varchar(10) not null,
	--constraint department_pk --제약조건 이름
	primary key(deptno)
);

--교수 테이블(자식)
create table professor (
	profno number(5,0) not null,--기본키
	name varchar(10) not null,
	ename varchar(20) not null,
	position varchar(20) not null,
	sal varchar(4) not null,
	hiredate date not null,
	age number(3) not null,
	deptno number(3) not null,--외부키
	--constraint professor_pk --제약조건 이름
	primary key(profno)--외부키	
);

-- 구조 변경
Alter table professor --자식 테이블
add --constraint professor_pk 제약조건 이름 추가
foreign key(deptno) --자식테이블의 외부키 설정
references department(deptno); --부모테이블의 기본키 설정

--삽입
--삽입은 부모 테이블 내용 먼저 삽입후 자식 테이블 내용 삽입
insert into professor values(9901,'홍길동','capool','교수',500,to_date('24-06-1982','DD-MM-YYYY'),20,101);

--검색
select * from professor;
select * from department;

--테이블 삭제
--삭제는 자식 테이블 먼저 삭제 후 부모 테이블 삭제
drop table professor;
drop table department;

--레코드 삭제
delete from where department deptno=101;

--내림차순 정력해서 검색
select * from DEPARTMENT order by desc;

rollback