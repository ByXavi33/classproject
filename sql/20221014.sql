--20221014

--join : 관계있는 테이블의 스키마를 붙이는 것
select *
from emp, dept
where emp.deptno = dept.deptno
;
-- 14* 4 => cross join 의 결과 행
ㅇㅇ
select *
from emp cross join dept
;


--테이블 별칭을 이용해서 컬럼 구별
select e.ename, d.dname
from emp e, dept d
where e.deptno = d.deptno
;