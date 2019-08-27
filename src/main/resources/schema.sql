-- MEMBER Table Create SQL
CREATE TABLE MEMBER
(
    `MEMBER_ID`          INTEGER        NOT NULL    AUTO_INCREMENT COMMENT '회원번호', 
    `USERNAME`           VARCHAR(45)    NOT NULL    COMMENT '회원아이디', 
    `PASSWORD`           VARCHAR(45)    NOT NULL    COMMENT '패스워드', 
    `NAME`               VARCHAR(45)    NOT NULL    COMMENT '회원이름', 
    `MEMBERTYPE`         VARCHAR(45)    NOT NULL    COMMENT '회원구분', 
    `EMAIL`              VARCHAR(45)    NOT NULL    COMMENT '이메일', 
    `PHONE`              VARCHAR(45)    NULL        COMMENT '전화번호', 
    `ADDRESS_ZIPCODE`    VARCHAR(45)    NULL        COMMENT '우편번호', 
    `ADDRESS_ROAD`       VARCHAR(45)    NULL        COMMENT '도로명주소', 
    `ADDRESS_LAND`       VARCHAR(45)    NULL        COMMENT '지번주소', 
    `ADDRESS_DETAIL`     VARCHAR(45)    NULL        COMMENT '상세주소', 
    `ADDRESS_SUBDETAIL`  VARCHAR(45)    NULL        COMMENT '주소추가정보', 
    PRIMARY KEY (MEMBER_ID)
);

-- LESSON Table Create SQL
CREATE TABLE LESSON
(
    `LESSON_NUM`    INTEGER        NOT NULL    COMMENT '강의번호', 
    `TYPE`          VARCHAR(45)    NOT NULL    COMMENT '구분', 
    `LESSON_NAME`   VARCHAR(45)    NOT NULL    COMMENT '강의명', 
    `LESSON_PRO`    VARCHAR(45)    NOT NULL    COMMENT '강사명', 
    `LESSON_TIME`   VARCHAR(45)    NULL        COMMENT '강의시간', 
    `LESSON_PLACE`  VARCHAR(45)    NULL        COMMENT '강의장소', 
    `LESSON_LIMIT`  INTEGER        NOT NULL    COMMENT '제한인원', 
    PRIMARY KEY (LESSON_NUM)
);



-- LESSON Table Create SQL
CREATE TABLE LESSON_MEMBER
(
    `LIST_NUM`    INTEGER    NOT NULL    COMMENT '명단번호', 
    `MEMBER_NUM`  INTEGER    NOT NULL    COMMENT '회원번호', 
    `LESSON_NUM`  INTEGER    NOT NULL    COMMENT '강의번호', 
    PRIMARY KEY (LIST_NUM)
);


CREATE TABLE LESSON_NOTICE
(
    `NUM`    INTEGER        NOT NULL AUTO_INCREMENT COMMENT '게시물번호',
    `TITLE`   VARCHAR(45)    NOT NULL    COMMENT '제목',
    `NAME`    VARCHAR(45)    NOT NULL    COMMENT '강사명',
    `DATE`   VARCHAR(45)    NOT NULL    COMMENT '시간',
    `CONTENT`   VARCHAR(2000)    NOT NULL    COMMENT '내용',
    PRIMARY KEY (NUM)
);

