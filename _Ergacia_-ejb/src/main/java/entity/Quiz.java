package entity;

import java.io.Serializable;
import java.lang.String;
import java.sql.Timestamp;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Quiz
 *
 */
@Entity

public class Quiz implements Serializable {

	   
	@Id
	private int id;
	private String domain;
	private String diffculty;
	private Timestamp date;
	private static final long serialVersionUID = 1L;

	public Quiz() {
		super();
	}   
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}   
	public String getDomain() {
		return this.domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
	}   
	public String getDiffculty() {
		return this.diffculty;
	}

	public void setDiffculty(String diffculty) {
		this.diffculty = diffculty;
	}   
	public Timestamp getDate() {
		return this.date;
	}

	public void setDate(Timestamp date) {
		this.date = date;
	}
   
}
