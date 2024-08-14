1.subquery (SELECT MIN(DATETIME) FROM ANIMAL_INS)를 이용해 가장 빠른 날짜를 가져오고SELECT NAME
FROM ANIMAL_INS 
WHERE DATETIME <= (SELECT MIN(DATETIME) FROM ANIMAL_INS)
를 통해 가장 빠른 날짜와 비교하여 가장 빨리 들어온 동물의 이름을 구한다.
