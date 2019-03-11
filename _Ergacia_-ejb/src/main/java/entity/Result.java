package entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Result
 *
 */
@Entity

public class Result implements Serializable {

	   
	@Id
	private int id;
	private int result;
	private int isAccepted;
	private static final long serialVersionUID = 1L;

	public Result() {
		super();
	}   
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}   
	public int getResult() {
		return this.result;
	}

	public void setResult(int result) {
		this.result = result;
	}   
	public int getIsAccepted() {
		return this.isAccepted;
	}

	public void setIsAccepted(int isAccepted) {
		this.isAccepted = isAccepted;
	}
   
}
