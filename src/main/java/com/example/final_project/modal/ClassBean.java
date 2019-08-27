package com.example.final_project.modal;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="LESSON_NOTICE")
public class ClassBean implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	private Long NUM;
	private String TITLE;
	private String NAME;
	private String DATE;
	private String CONTENT;
	

	public ClassBean() {
	}

	public ClassBean(Long NUM, String TITLE, String NAME, String DATE, String CONTENT) {
		this.NUM = NUM;
		this.TITLE = TITLE;
		this.NAME = NAME;
		this.DATE = DATE;
		this.CONTENT = CONTENT;
	}

	public Long getNUM() {
		return this.NUM;
	}

	public void setNUM(Long NUM) {
		this.NUM = NUM;
	}

	public String getTITLE() {
		return this.TITLE;
	}

	public void setTITLE(String TITLE) {
		this.TITLE = TITLE;
	}

	public String getNAME() {
		return this.NAME;
	}

	public void setNAME(String NAME) {
		this.NAME = NAME;
	}

	public String getDATE() {
		return this.DATE;
	}

	public void setDATE(String DATE) {
		this.DATE = DATE;
	}

	public String getCONTENT() {
		return this.CONTENT;
	}

	public void setCONTENT(String CONTENT) {
		this.CONTENT = CONTENT;
	}

	public ClassBean NUM(Long NUM) {
		this.NUM = NUM;
		return this;
	}

	public ClassBean TITLE(String TITLE) {
		this.TITLE = TITLE;
		return this;
	}

	public ClassBean NAME(String NAME) {
		this.NAME = NAME;
		return this;
	}

	public ClassBean DATE(String DATE) {
		this.DATE = DATE;
		return this;
	}

	public ClassBean CONTENT(String CONTENT) {
		this.CONTENT = CONTENT;
		return this;
	}

	@Override
	public boolean equals(Object o) {
		if (o == this)
			return true;
		if (!(o instanceof ClassBean)) {
			return false;
		}
		ClassBean classBean = (ClassBean) o;
		return Objects.equals(NUM, classBean.NUM) && Objects.equals(TITLE, classBean.TITLE) && Objects.equals(NAME, classBean.NAME) && Objects.equals(DATE, classBean.DATE) && Objects.equals(CONTENT, classBean.CONTENT);
	}

	@Override
	public int hashCode() {
		return Objects.hash(NUM, TITLE, NAME, DATE, CONTENT);
	}

	@Override
	public String toString() {
		return "{" +
			" NUM='" + getNUM() + "'" +
			", TITLE='" + getTITLE() + "'" +
			", NAME='" + getNAME() + "'" +
			", DATE='" + getDATE() + "'" +
			", CONTENT='" + getCONTENT() + "'" +
			"}";
	}



}