-- 테이블 순서는 관계를 고려하여 한 번에 실행해도 에러가 발생하지 않게 정렬되었습니다.

-- MEMBER Table Create SQL
CREATE TABLE MEMBER
(
    `MEMBER_ID`          VARCHAR(45)    NOT NULL    COMMENT '회원번호', 
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

ALTER TABLE MEMBER COMMENT '회원정보';


