package entity;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Condidate_Profile
 *
 */
@Entity

public class Condidate_Profile implements Serializable {

	   
	@Id
	private int id;
	private String img_url;
	private String intro;
	private String summary;
	private String current_state;
	private int age;
	private static final long serialVersionUID = 1L;

	public Condidate_Profile() {
		super();
	}   
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}   
	public String getImg_url() {
		return this.img_url;
	}

	public void setImg_url(String img_url) {
		this.img_url = img_url;
	}   
	public String getIntro() {
		return this.intro;
	}

	public void setIntro(String intro) {
		this.intro = intro;
	}   
	public String getSummary() {
		return this.summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}   
	public String getCurrent_state() {
		return this.current_state;
	}

	public void setCurrent_state(String current_state) {
		this.current_state = current_state;
	}   
	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		this.age = age;
	}
   
}
