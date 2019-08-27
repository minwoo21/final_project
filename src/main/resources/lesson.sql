-- 테이블 순서는 관계를 고려하여 한 번에 실행해도 에러가 발생하지 않게 정렬되었습니다.

-- LESSON Table Create SQL
CREATE TABLE LESSON
(
    `LESSON_NUM`    INTEGER        NOT NULL    COMMENT '강의번호', 
    `TYPE`          VARCHAR(45)    NOT NULL    COMMENT '구분', 
    `LESSON_NAME`   VARCHAR(45)    NOT NULL    COMMENT '강의명', 
    `LESSON_PRO`    VARCHAR(45)    NOT NULL    COMMENT '강사명', 
    `LESSON_TIME`   DATETIME       NULL        COMMENT '강의시간', 
    `LESSON_PLACE`  VARCHAR(45)    NULL        COMMENT '강의장소', 
    `LESSON_LIMIT`  INTEGER        NOT NULL    COMMENT '제한인원', 
    PRIMARY KEY (LESSON_NUM)
);

ALTER TABLE LESSON COMMENT '강의';


-- LESSON Table Create SQL
CREATE TABLE LESSON_MEMBER
(
    `LIST_NUM`    INTEGER    NOT NULL    COMMENT '명단번호', 
    `MEMBER_NUM`  INTEGER    NOT NULL    COMMENT '회원번호', 
    `LESSON_NUM`  INTEGER    NOT NULL    COMMENT '강의번호', 
    PRIMARY KEY (LIST_NUM)
);

ALTER TABLE LESSON_MEMBER COMMENT '강의명단';


