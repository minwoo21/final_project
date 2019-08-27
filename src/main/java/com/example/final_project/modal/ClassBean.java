package com.example.final_project.modal;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student")
public class ClassBean implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	private Long id;
	private String name;
	private String passport_number;
	

	public ClassBean(Long id, String name, String passport_number) {
		this.id = id;
		this.name = name;
		this.passport_number = passport_number;
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassport_number() {
		return this.passport_number;
	}

	public void setPassport_number(String passport_number) {
		this.passport_number = passport_number;
	}

	public ClassBean id(Long id) {
		this.id = id;
		return this;
	}

	public ClassBean name(String name) {
		this.name = name;
		return this;
	}

	public ClassBean passport_number(String passport_number) {
		this.passport_number = passport_number;
		return this;
	}

	@Override
	public boolean equals(Object o) {
		if (o == this)
			return true;
		if (!(o instanceof ClassBean)) {
			return false;
		}
		ClassBean studentBean = (ClassBean) o;
		return Objects.equals(id, studentBean.id) && Objects.equals(name, studentBean.name) && Objects.equals(passport_number, studentBean.passport_number);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name, passport_number);
	}

	@Override
	public String toString() {
		return "{" +
			" id='" + getId() + "'" +
			", name='" + getName() + "'" +
			", passport_number='" + getPassport_number() + "'" +
			"}";
	}

	public ClassBean() {
	}



}