--2022101

--서브쿼리

--SCOTT이 소속된 부서이름 출력
select dname
from emp e, dept d
where e.deptno=d.deptno
and ename='SCOTT'
;

select deptno from emp where ename= 'SCOTT';
select dname from dept where deptno=20;

--서브 쿼리 이용한 부서찾기
select dname
from dept
where deptno= (select deptno from emp where ename= 'SCOTT')
;

--스칼라 부속질의
select custid, (
select name from customer c where o.custid=c.custid
) as 고객이름
from orders o
group by custid
;

select name from customer where custid=1;

--마당서점의 고객별 판매액을 보이시오
--(결과는 고객 이름과 고객별 판매액을 출력)
select (
       select name from customer c where c.custid=o.custid
)as name,
sum(saleprice) as total
from orders o
group by custid
;

-- 인라인 뷰 : from 절 뒤에 쓰여지는 서브쿼리 => 가상 테이블
--고객번호가 2 이하인 고객의 판매액
select o.custid, sum (saleprice)as total
from orders o, (
select custid, name from customer where custid<=2
) c
where c.custid=o.custid
group by o.custid
;

select * 
from (select empno, ename, job, hiredate from emp)
where ename='SCOTT'
;

--평균 급여보다
--더 많은 급여를 받는 사원을 검색하는
select *
from emp
where sal > (
select avg (sal) from emp
)
;
select avg (sal) from emp;

--평균 주문금액 이하의 주문에 대해서 주문번호와 금액을 보이시오.
select orderid, saleprice
from orders
where saleprice <= (select avg (saleprice) from orders )
;

--각 고객의 평균 주문금액보다 큰 금액의 주문 내역에 대해서
--주문번호, 고객번호, 금액을 보이시오.
select orderid, custid, saleprice
from orders
where saleprice >= (select avg (saleprice) from orders)
;

--3000 이상 받는 사원이 소속된 부서(?)와
--동일한 부서에서 근무하는 사원이기에 서브 쿼리의 결과 중에서
--하나라도 일치하면 참인 결과를 구하는
select *
from emp
--where deptno=? or deptno=? or ...
where deptno in (select distinct deptno
from emp
where sal >= 3000
)
;

select distinct deptno
from emp
where sal >= 3000
;

--대한민국에 거주하는 고객에게 판매한
--도서의 총 판매액을 구하시오.

select sum(saleprice) total
from orders
where custid in ()
;

select * from customer where address like '%대한민국%'
;
--3번 고객이 주문한 도서의 최고 금액보다 더 비싼 도서를 구입한 주문의
--주문번호와 금액을 보이시오.

--all 연산자는 모든 값이 true

select orderid, saleprice
from orders
where saleprice > all (select saleprice from orders where custid=3)
;

select saleprice from orders where custid=3
;

select orderid, saleprice
from orders
where saleprice > (select max(saleprice) from orders where custid=3
)
;

--3번 고객의 최고 구매액

select max(saleprice)
from orders
where custid=3
;

-- exists 연산자로 대한민국에 거주하는 고객에게 판매한 도서의 총 판매액을 구하시오.
select sum (saleprice)
from orders o
where exists (select * from customer c where c.custid=o.custid and address like '%대한민국%')
;

--대한민국에 거주하는 고객
select * from customer c where c.custid=o.custid and address like '%대한민국%'
;
select*from customer;

-------------------------------------------------------------------------------------------------

--DDL : 정의어 => 객체를 정의하는 명령어

-- 데이터의 저장 공간 생성 => create table 테이블 이름 (
--                          컬럼이름 타입[제약조건],)
--                          컬럼이름 타입[제약조건],
--                          ...
-- );

create table ddl_test (
    no number(3) not null unique,
    name varchar2(10),
    birth date default sysdate
);

create table emp01(
empno number(4),
ename varchar2(10),
sal number(7,2)
);

desc emp01;
insert into emp01(empno, ename, sal) values (1111,'SON', 1000);

select * from emp01;

-- as : 서브쿼리를 이용해서 기존 테이블 구조로 생성, 데이터 저장, 제약 조건은 카피 되지 않는다.!
create table emp02
as
select * from emp
;

desc emp02
;

--원하는 컬럼만 카피해서 생성
create table emp03 
as
select empno, ename, job, hiredate from emp
;

desc emp03;

select * from emp03;

select empno, ename, job from emp where deptno=20;

create table emp04
as
select empno, ename, job from emp where deptno=20;
desc emp04;
select * from emp04;

--스키마만 복사한 테이블
create table emp05
as
select * from emp where 1=0
;
desc emp05;
select * from emp05;

-- 테이블의 컬럼 수정
-- alter table 테이블 이름 add => 컬럼을 추가
desc emp01;
-- job 컬럼을 추가!
alter table emp01 add (job varchar2(9));
select * from emp01;

-- alter table 테이블 이름 modify => 컬럼을 수정
alter table emp01 modify (job varchar2(30) default'manager');


--null 값이 있는 경우 not null 제약은 추가 불가!
alter table emp01 modify (job not null);

desc emp01;

-- alter table 테이블 이름 drop => 컬럼을 삭제
alter table emp01 drop column job;
desc emp01;

--테이블 객체 삭제
drop table emp01;

desc emp01;

select* from emp01;

--테이블의 모든 행을 삭제
truncate table emp03;

desc emp03;

--테이블의 이름 변경 : rename 기존 테이블 이름 to 새로운이름
select * from emp03;

rename emp03 to test03;

select * from test03;


-- unique 제약 조건 정의
create table emp01 (
empno number (4) not null unique, -- not null 제약조건은 컬럼 정의 위치에서 제약 조건을 정의
ename varchar2 (10) not null,
job varchar2 (9),
deptno number (2)
);

--기본키 제약조건 정의 : 제약조건의 이름 등록
drop table emp02;
create table emp02 (
                    empno number (4),
                    ename varchar2 (10) constraint emp01_ename_NN not null,
                    job varchar2 (9),
                    sal number(7,2),
                    gender char(1),
                    deptno number(2),
                    hiredate date default sysdate,
                    constraint emp02_empno_pk primary key (empno),
                    constraint emp02_job_uk unique (job),
                    constraint emp02_sal_ck check (sal between 500 and 5000),
                    constraint emp02_gender_ck check (gender in ('M','F')),
                    constraint emp02_deptno_fk foreign key (deptno), references dept(deptno)
                   );

insert into emp02 (empno,ename,sal,job,gender,deptno)
values(1111,'KING',5000,'대표','M',10);

insert into emp02 (empno,ename,sal,job,gender,deptno)
values(1112,'KING',15000,'대표','M',10);


drop table emp01;

insert into emp01 (job, deptno) values ('manager', 20);

insert into emp01 (empno, ename, job, deptno) values (1111, 'som','manager', 20);
insert into emp01 (empno, ename, job, deptno) values (null, 'som','manager', 20);
select * from emp01;
