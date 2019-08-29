insert into MEMBER
values(14671,'user1','1234','홍길동','학생','user1@gmail.com','010-1111-1111','01010','가나','다나','101','0101');
insert into MEMBER
values(14672,'user2','1234','김김','학생','user2@gmail.com','010-1111-1111','01010','가나','다나','101','0101');
insert into MEMBER
values(14673,'user3','1234','이잉','학생','user3@gmail.com','010-1111-1111','01010','가나','다나','101','0101');
insert into MEMBER
values(14674,'user4','1234','우앙','교사','user4@gmail.com','010-1111-1111','01010','가나','다나','101','0101');

-- 강의
insert into LESSON
values(0001, '전공', '수학1', '김땡땡', 3, '수학관', 30);
insert into LESSON
values(0002, '전공', '수학2', '나땡땡', 4, '수학관', 30);
insert into LESSON
values(0003, '교양', '영어', '이땡땡', 2, '영어관', 50);
insert into LESSON
values(0004, '교양', '생활체육', '연땡땡', 2, '체육관', 40);
insert into LESSON
values(0005, '전공', '화학1', '박땡땡', 3, '화학관', 40);
insert into LESSON
values(0006, '전공', '화학2', '박땡땡', 3, '화학관', 40);
insert into LESSON
values(0007, '교양', '뮤지컬', '신땡땡', 1, '창의관', 20);
insert into LESSON
values(0008, '전공', '바이오역학', '최땡땡', 4, '화학관', 40);
insert into LESSON
values(0009, '교양', '한국사', '정땡땡', 1, '역사관', 60);
insert into LESSON
values(0010, '전공', '심화학', '변땡땡', 3, '화학관', 40);

-- 강의명단
insert into LESSON_MEMBER
values(001, 14671, 0009);
insert into LESSON_MEMBER
values(002, 14672, 0009);
insert into LESSON_MEMBER
values(003, 14673, 0009);
insert into LESSON_MEMBER
values(004, 14674, 0009);
insert into LESSON_MEMBER
values(005, 14675, 0009);


insert into LESSON_NOTICE
values(001, 0001, '공지 1', '우앙', '2019-08-27','와아앙앙 미쳤ㄲㄸㄱ러러러ㅓ말');
insert into LESSON_NOTICE
values(002, 0001, '공지 2', '우앙', '2019-08-27','와ㄷㅈㄷㅈㄷㅈㄲㄸㄱ러러러ㅓ말');
insert into LESSON_NOTICE
values(003, 0002, '공지 3', '우앙', '2019-08-27','와아2323232ㄲㄸㄱ러러러ㅓ말');