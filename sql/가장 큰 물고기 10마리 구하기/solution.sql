select f.id, f.length  /*id와 길이를 출력한다 */
from fish_info as f  /*finsh_info를 f로 치환*/
order by 
f.length desc, /*길이는 내림차순으로 정렬*/
f.id asc       /*id는 오름차순으로 정렬*/
limit 10;       /*출력 제한을 10으로 설정*/
