package com.example.final_project.modal;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="LESSON")
public class lessonbean implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
    @GeneratedValue
    
    private Long LESSON_NUM;
    private String TYPE;
    private String LESSON_NAME;
    private String LESSON_PRO;
    private String LESSON_TIME;
    private String LESSON_PLACE;
	private String LESSON_LIMIT;
	private String LESSON_START;
	private String LESSON_END;
	

	public lessonbean(Long LESSON_NUM, String TYPE, String LESSON_NAME, String LESSON_PRO, String LESSON_TIME, String LESSON_PLACE, String LESSON_LIMIT, String LESSON_START, String LESSON_END) {
		this.LESSON_NUM = LESSON_NUM;
		this.TYPE = TYPE;
        this.LESSON_NAME = LESSON_NAME;
        this.LESSON_PRO = LESSON_PRO;
        this.LESSON_TIME = LESSON_TIME;
        this.LESSON_PLACE = LESSON_PLACE;
		this.LESSON_LIMIT = LESSON_LIMIT;
		this.LESSON_START = LESSON_START;
		this.LESSON_END = LESSON_END;
	}

	public Long getLESSON_NUM() {
		return this.LESSON_NUM;
	}

	public void setLESSON_NUM(Long LESSON_NUM) {
		this.LESSON_NUM = LESSON_NUM;
	}

	public String getTYPE() {
		return this.TYPE;
	}

	public void setTYPE(String TYPE) {
		this.TYPE = TYPE;
	}

	public String getLESSON_NAME() {
		return this.LESSON_NAME;
	}

	public void setLESSON_NAME(String LESSON_NAME) {
		this.LESSON_NAME = LESSON_NAME;
    }
    
    public String getLESSON_PRO() {
		return this.LESSON_PRO;
	}

	public void setLESSON_PRO(String LESSON_PRO) {
		this.LESSON_PRO = LESSON_PRO;
    }

    public String getLESSON_TIME() {
		return this.LESSON_TIME;
	}

	public void setLESSON_TIME(String LESSON_TIME) {
		this.LESSON_TIME = LESSON_TIME;
    }

    public String getLESSON_PLACE() {
		return this.LESSON_PLACE;
	}

	public void setLESSON_PLACE(String LESSON_PLACE) {
		this.LESSON_PLACE = LESSON_PLACE;
    }

    public String getLESSON_LIMIT() {
		return this.LESSON_LIMIT;
	}

	public void setLESSON_LIMIT(String LESSON_LIMIT) {
		this.LESSON_LIMIT = LESSON_LIMIT;
	}
	
	public String getLESSON_START() {
		return this.LESSON_START;
	}

	public void setLESSON_START(String LESSON_START) {
		this.LESSON_START = LESSON_START;
	}
	
	public String getLESSON_END() {
		return this.LESSON_END;
	}

	public void setLESSON_END(String LESSON_END) {
		this.LESSON_END = LESSON_END;
    }

	public lessonbean LESSON_NUM(Long LESSON_NUM) {
		this.LESSON_NUM = LESSON_NUM;
		return this;
	}

	public lessonbean TYPE(String TYPE) {
		this.TYPE = TYPE;
		return this;
	}

	public lessonbean LESON_NAME(String LESSON_NAME) {
		this.LESSON_NAME = LESSON_NAME;
		return this;
    }
    
    public lessonbean LESON_PRO(String LESSON_PRO) {
		this.LESSON_PRO = LESSON_PRO;
		return this;
    }

    public lessonbean LESON_TIME(String LESSON_TIME) {
		this.LESSON_TIME = LESSON_TIME;
		return this;
    }

    public lessonbean LESON_PLACE(String LESSON_PLACE) {
		this.LESSON_PLACE = LESSON_PLACE;
		return this;
    }

    public lessonbean LESON_LIMIT(String LESSON_LIMIT) {
		this.LESSON_LIMIT = LESSON_LIMIT;
		return this;
	}
	
	public lessonbean LESON_START(String LESSON_START) {
		this.LESSON_START = LESSON_START;
		return this;
	}
	
	public lessonbean LESON_END(String LESSON_END) {
		this.LESSON_END = LESSON_END;
		return this;
    }

	@Override
	public boolean equals(Object o) {
		if (o == this)
			return true;
		if (!(o instanceof lessonbean)) {
			return false;
		}
		lessonbean lessonbean = (lessonbean) o;
		return Objects.equals(LESSON_NUM, lessonbean.LESSON_NUM) && Objects.equals(TYPE, lessonbean.TYPE)
                && Objects.equals(LESSON_NAME, lessonbean.LESSON_NAME) && Objects.equals(LESSON_PRO, lessonbean.LESSON_PRO)
                && Objects.equals(LESSON_TIME, lessonbean.LESSON_TIME) && Objects.equals(LESSON_PLACE, lessonbean.LESSON_PLACE)
				&& Objects.equals(LESSON_LIMIT, lessonbean.LESSON_LIMIT) && Objects.equals(LESSON_START, lessonbean.LESSON_START)
				&& Objects.equals(LESSON_END, lessonbean.LESSON_END);
	}

	@Override
	public int hashCode() {
		return Objects.hash(LESSON_NUM, TYPE, LESSON_NAME, LESSON_PRO, LESSON_TIME, LESSON_PLACE, LESSON_LIMIT, LESSON_START, LESSON_END);
	}

	@Override
	public String toString() {
		return "{" +
			" LESSON_NUM='" + getLESSON_NUM() + "'" +
			", TYPE='" + getTYPE() + "'" +
            ", LESSON_NAME='" + getLESSON_NAME() + "'" +
            ", LESSON_PRO='" + getLESSON_PRO() + "'" +
            ", LESSON_TIME='" + getLESSON_TIME() + "'" +
            ", LESSON_PLACE='" + getLESSON_PLACE() + "'" +
			", LESSON_LIMIT='" + getLESSON_LIMIT() + "'" +
			", LESSON_START='" + getLESSON_START() + "'" +
			", LESSON_END='" + getLESSON_END() + "'" +
			"}";
	}

	public lessonbean() {
	}



}