package com.example.final_project.modal;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="LESSON_HWLIST")
public class hwLBean implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	private Long HW_NUM;
	private String LESSON_NUM;
	private String HW_NAME;

    public hwLBean() {
    }

    public hwLBean(Long HW_NUM, String LESSON_NUM, String HW_NAME, String DATE) {
        this.HW_NUM = HW_NUM;
        this.LESSON_NUM = LESSON_NUM;
        this.HW_NAME = HW_NAME;
        this.DATE = DATE;
    }

    public Long getHW_NUM() {
        return this.HW_NUM;
    }

    public void setHW_NUM(Long HW_NUM) {
        this.HW_NUM = HW_NUM;
    }

    public String getLESSON_NUM() {
        return this.LESSON_NUM;
    }

    public void setLESSON_NUM(String LESSON_NUM) {
        this.LESSON_NUM = LESSON_NUM;
    }

    public String getHW_NAME() {
        return this.HW_NAME;
    }

    public void setHW_NAME(String HW_NAME) {
        this.HW_NAME = HW_NAME;
    }

    public String getDATE() {
        return this.DATE;
    }

    public void setDATE(String DATE) {
        this.DATE = DATE;
    }

    public hwLBean HW_NUM(Long HW_NUM) {
        this.HW_NUM = HW_NUM;
        return this;
    }

    public hwLBean LESSON_NUM(String LESSON_NUM) {
        this.LESSON_NUM = LESSON_NUM;
        return this;
    }

    public hwLBean HW_NAME(String HW_NAME) {
        this.HW_NAME = HW_NAME;
        return this;
    }

    public hwLBean DATE(String DATE) {
        this.DATE = DATE;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof hwLBean)) {
            return false;
        }
        hwLBean hwLBean = (hwLBean) o;
        return Objects.equals(HW_NUM, hwLBean.HW_NUM) && Objects.equals(LESSON_NUM, hwLBean.LESSON_NUM) && Objects.equals(HW_NAME, hwLBean.HW_NAME) && Objects.equals(DATE, hwLBean.DATE);
    }

    @Override
    public int hashCode() {
        return Objects.hash(HW_NUM, LESSON_NUM, HW_NAME, DATE);
    }

    @Override
    public String toString() {
        return "{" +
            " HW_NUM='" + getHW_NUM() + "'" +
            ", LESSON_NUM='" + getLESSON_NUM() + "'" +
            ", HW_NAME='" + getHW_NAME() + "'" +
            ", DATE='" + getDATE() + "'" +
            "}";
    }
	private String DATE;
}
