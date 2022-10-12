-- 20221012

-- 사용가능한 테이블 정보
select * from tab;

-- 테이블의 구조 확인
desc dept;


select * --ename -- *
from emp;

SELECT deptno, job, sal, ename
from emp;

-- select [distinct]컬럼이름, 컬럼이름, ...
-- from 테이블의 이름

select * from dept; -- 행을 선택하는 조건이 없기 때문에 모든 행이 결과로 출력

select deptno, dname from dept;


select sal, nvl(comm, 0) from emp;

-- null : 정해지지 않은 값

-- select 의 표현영역에서는 산술연산이 가능
select sal + comm 
from emp;

select sal, sal - 100
from emp;

select sal * 12
from emp;

select sal / 2
from emp;


-- 사원 테이블에서 사원의 이름, 월 급여, 연봉을 출력
select ename, sal, sal*12
from emp;

select ename, sal, sal*12, sal*12+comm
from emp;


-- null의 값을 치환해주는 함수 : nvl(원본데이터, null 일때 치환되는 값)
select ename, sal, sal*12 yearsal1, sal*12+nvl(comm, 0)yearsal2
from emp;

-- 문자열 연산
select ename || ' is a ' || job
from emp;

-- distinct : 중복된 데이터를 생략하고 출력
select deptno
from emp;

select DISTINCT deptno
from emp;


-- 행을 찾는 조건
-- select
-- from
-- where 조건식 <- 행을 찾는 조건식
-- 급여를 3000이상 받는 사원의 리스트
select *
from emp
where sal >= 3000;

select *
from emp
where sal between 2000 and 3000
;

--1987년에 입사한 사원 리스트
select *
from emp
where hiredate between '87/01/01' and '87/12/31'
;

--커미션이 300이거나 500이거나 1400 인 사원을 검색하기
select *
from emp
where comm=300 or comm=500 or comm=1400 or comm=0
;

--in 연산자
select *
from emp
where comm in (300,500,1400,0)
;

--이름 검색 : ename = 'SC'
-- like 패턴 검색

--  이름을 "F"로 시작하는 이름을 검색
select *
from emp
--where ename like '%AR%' --F랑 F붙은거
where ename like '%N'
;

--이름의 두 번쨰 글자가 A인 사원 검색
select *
from emp
where ename like '_A%'
;

--null 여부를 확인하는 is null
-- null 비교연산자를 사용할 수 없다!!!! = null X

--커미션을 받지 않는 사원!
select *
from emp
where comm is null or comm=0
;

-- 커미션이 등록된 사원의 리스트
select *
from emp
where comm is not null
;

--결과 행의 정렬 : oder by 컬럼 asc | desc
--asc : 오름 차순, 생략하면 기본값
--desc: 내림차순
select *
from emp
--where
order by sal desc --asc
;

-- 사원 리스트를 이름 순으로 출력
select *
from emp
order by ename desc;

--입사일 순으로 사원의 리스트를 출력
select *
from emp
order by hiredate
;

--가장 최근 입사자부터 출력하는 리스트
select *
from emp
order by hiredate desc, ename asc
;
