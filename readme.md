이번 예제는 docker 가 필요하다

1. docker container 생성 명령어 : 

- docker run -p 5432:5432 -e POSTGRES_PASSWORD=pass -e POSTGRES_USER=taesoo -e POSTGRES_DB=springboot --name postgres_boot -d postgres

2. container 생성후 내부로 들어가는 명령어:

- docker exec -it postgres_boot bash

3. container 내부로 들어간 후 데이터 테이블 확인하러 들어가기:

- psql --username taesoo --dbname springboot


