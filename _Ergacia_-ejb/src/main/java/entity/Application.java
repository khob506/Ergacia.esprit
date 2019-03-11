package entity;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Application
 *
 */
@Entity

public class Application implements Serializable {

	   
	@Id
	private int id;
	private Timestamp date;
	private int isAccepted;
	private static final long serialVersionUID = 1L;

	public Application() {
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
	public int getIsAccepted() {
		return this.isAccepted;
	}

	public void setIsAccepted(int isAccepted) {
		this.isAccepted = isAccepted;
	}
   
}
