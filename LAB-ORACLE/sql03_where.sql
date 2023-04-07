-- 테이블에서 데이터를 검색:
-- (1) PROJECTION: 테이블에서 원하는 컬럼들을 선택
-- (2) SELECTION: 테이블에서 조건을 만족하는 레코드(행, row)들을 검색
-- SELECT column_name, ... 
--   FROM table_name 
--   WHERE 조건식
--   ORDER BY column_name;
-- 조건식에서 사용되는 연산자들:
--      (1) 비교 연산자: =, !=, >, >=, <, <=, is null, is not null, ...
--      (2) 논리 연산자: AND, OR, NOT

-- 직원 테이블에서 10번 부서에서 근무하는 직원들의 부서번호, 사번, 이름을 출력
SELECT deptno, empno, ename
    FROM emp
    WHERE deptno = 10;

-- 직원 테이블에서 수당(comm)이 null이 아닌 직원들의 사번, 부서번소, 이름, 수당을 출력
SELECT empno, deptno, ename, comm
    FROM EMP
    WHERE comm IS NOT NULL;
    
-- 직원 테이블에서 급여(sal)가 2000 이상인 직원들의 이름, 직무, 급여를 출력.
SELECT ename, job, sal
    FROM emp
    WHERE sal >= 2000
    ORDER BY sal DESC;
    
SELECT ename, hiredate
    FROM emp
    WHERE hiredate = '81/11/17';
    
-- 직원 테이블에서 급여가 2000 이상 3000 이하인 직원들의 이름, 직무, 급여를 출력
-- 급여의 내림차순으로 정렬
SELECT ename, job, sal
    FROM emp
    WHERE 2000 <= sal AND sal <=3000
    ORDER BY sal DESC;
    
SELECT ename, job, sal
    FROM emp
    WHERE sal BETWEEN 2000 AND 3000
    ORDER BY sal DESC;