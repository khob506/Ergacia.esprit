package entity;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Follow
 *
 */
@Entity

public class Follow implements Serializable {

	   
	@Id
	private int id;
	private Timestamp date;
	private static final long serialVersionUID = 1L;

	public Follow() {
		super();
	}   
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}   
	public Timestamp getDate() {
		return this.date;
	}

	public void setDate(Timestamp date) {
		this.date = date;
	}
   
}
