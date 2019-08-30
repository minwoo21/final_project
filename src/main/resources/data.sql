insert into MEMBER
values(14671,'user1','1234','홍길동','user','hong@example.com','010-1234-5678','06267','서울 강남구 남부순환로 2615', '101동 2001호',' (도곡동, 극동스타클래스)');
insert into MEMBER
values(14672,'user2','2345','성춘향','user','sung@example.net','010-1111-0000','07620','서울 강서구 개화동로 551','2층',' (방화동)');
insert into MEMBER
values(14673,'user3','3456','이몽룡','user','lee@example.org','010-1111-2222','04160','서울 마포구 큰우물로 28','102동 202호',' (용강동, 래미안아파트)');
insert into MEMBER
values(14674,'user4','4567','임꺽정','admin','lim@example.com','010-1111-1111','13600','경기 성남시 분당구 수내로 174','205동 1201호',' (수내동, 푸른마을벽산아파트)');
insert into MEMBER
values(14675,'user5','5678','이순신','admin','legend@example.com','010-1592-9999','13607','경기 성남시 분당구 백현로 206','403동 602호',' (정자동, 한솔마을주공4단지아파트)');

-- 강의
insert into LESSON
values(0001, '전공', '수학1', '김땡땡', 3, '수학관', 30, '2019.08.30', '2019.11.30');
insert into LESSON
values(0002, '전공', '수학2', '나땡땡', 4, '수학관', 30, '2019.08.30', '2019.11.30');
insert into LESSON
values(0003, '교양', '영어', '이땡땡', 2, '영어관', 50, '2019.08.30', '2019.11.30');
insert into LESSON
values(0004, '교양', '생활체육', '연땡땡', 2, '체육관', 40, '2019.08.30', '2019.11.30');
insert into LESSON
values(0005, '전공', '화학1', '박땡땡', 3, '화학관', 40, '2019.08.30', '2019.11.30');
insert into LESSON
values(0006, '전공', '화학2', '박땡땡', 3, '화학관', 40, '2019.08.30', '2019.11.30');
insert into LESSON
values(0007, '교양', '뮤지컬', '신땡땡', 1, '창의관', 20, '2019.08.30', '2019.11.30');
insert into LESSON
values(0008, '전공', '바이오역학', '최땡땡', 4, '화학관', 40, '2019.08.30', '2019.11.30');
insert into LESSON
values(0009, '교양', '한국사', '정땡땡', 1, '역사관', 60, '2019.08.30', '2019.11.30');
insert into LESSON
values(0010, '전공', '심화학', '변땡땡', 3, '화학관', 40, '2019.08.30', '2019.11.30');

-- 강의명단
insert into LESSON_MEMBER
values(001, 14671, 0001);
insert into LESSON_MEMBER
values(002, 14671, 0009);
insert into LESSON_MEMBER
values(003, 14672, 0008);
insert into LESSON_MEMBER
values(004, 14672, 0009);
insert into LESSON_MEMBER
values(005, 14673, 0001);
insert into LESSON_MEMBER
values(006, 14674, 0001);
insert into LESSON_MEMBER
values(007, 14675, 0001);




insert into LESSON_NOTICE
values(001, 0001, '공지 1', '2019-08-27','와아앙앙 미쳤ㄲㄸㄱ러러러ㅓ말');
insert into LESSON_NOTICE
values(002, 0001, '공지 2' , '2019-08-27','와ㄷㅈㄷㅈㄷㅈㄲㄸㄱ러러러ㅓ말');
insert into LESSON_NOTICE
values(003, 0002, '공지 3', '2019-08-27','와아2323232ㄲㄸㄱ러러러ㅓ말');