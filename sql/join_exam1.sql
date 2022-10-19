-- JOIN 문제

-- 32. EQUI 조인을 사용하여 emp dept
--     SCOTT 사원의        where ename='SCOTT'
--     부서번호와 부서 이름을 출력하시오.

select d.deptno, dname
from emp e, dept d
where e.deptno=d.deptno
and e.ename='SCOTT'
;

select d.deptno, dname
from emp e inner Join dept d
on e.deptno=d.deptno
where ename='SCOTT'
;

select deptno, dname
from emp e Join dept d
USING(deptno)
where ename='SCOTT'
;







-- 33. INNER JOIN과 ON 연산자를 사용하여 
--     사원 이름과 함께 그 사원이 소속된 부서이름과 지역 명을 출력하시오.
select ename, dname, loc
from emp e inner join dept d
on d.deptno=e.deptno
;





-- 36. 조인과 WildCARD를 사용하여 
--     이름에 ‘A’가 포함된 
--     모든 사원의 이름과 부서명을 출력하시오.
select *
from emp e, dept d
where e.deptno=d.deptno
and ename like('%A%')
;






-- 37. JOIN을 이용하여 
--     NEW YORK에 근무하는 
--     모든 사원의 이름, 업무, 부서번호 및 부서명을 출력하시오.
select ename, job, e.deptno, dname
from emp e, dept d
where d.deptno=e.deptno
and loc='NEW YORK'
;







-- 38. SELF JOIN을 사용하여 
--     사원의 이름 및 사원번호, 관리자 이름을 출력하시오.
select e1.ename, e1.empno, e2.ename
from emp e1, emp e2
where e1.mgr=e2.empno
;






-- 39. OUTER JOIN, SELF JOIN을 사용하여 관리자가 없는 사원을 포함하여
-- 사원번호를 기준으로 내림차순 정렬하여 출력하시오.
select e1.ename, e1.empno, e2.ename
from emp e1, emp e2
where e1.mgr=e2.empno(+)
;

select e.empno, e.ename, m.ename
from emp e left outer join emp m
on e.mgr=m.empno
;








-- 40. SELF JOIN을 사용하여 지정한 
--     사원의 이름, 부서번호, 
--     지정한 사원과 동일한 부서에서 근무하는 사원을 출력하시오. ( SCOTT )

select e2.ename, e2.deptno
from emp e1 , emp e2
where e1.deptno=e2.deptno
and e1.ename='SCOTT'  and e2.ename!='SCOTT'
;





-- 41. SELF JOIN을 사용하여 WARD 사원보다 늦게 입사한 사원의 이름과 입사일을 출력하시오.

select e.ename, e.hiredate
from emp e, emp w
where w.ename='WARD'
and e.hiredate > w.hiredate
;








-- 42. SELF JOIN 을 사용하여 각 사원의 관리자보다 먼저 입사한 모든 사원의 
-- 이름 및 입사일, 관리자의 이름 및 입사일과 함께 출력하시오.

select  e.ename, e.hiredate, m.ename, m.hiredate
from emp e, emp m
where e.mgr=m.empno
and e.hiredate < m.hiredate
;