package entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Stat
 *
 */
@Entity

public class Stat implements Serializable {

	   
	@Id
	private int id;
	private int views;
	private int searchs;
	private int connections;
	private int follows;
	private int applications;
	private static final long serialVersionUID = 1L;

	public Stat() {
		super();
	}   
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}   
	public int getViews() {
		return this.views;
	}

	public void setViews(int views) {
		this.views = views;
	}   
	public int getSearchs() {
		return this.searchs;
	}

	public void setSearchs(int searchs) {
		this.searchs = searchs;
	}   
	public int getConnections() {
		return this.connections;
	}

	public void setConnections(int connections) {
		this.connections = connections;
	}   
	public int getFollows() {
		return this.follows;
	}

	public void setFollows(int follows) {
		this.follows = follows;
	}   
	public int getApplications() {
		return this.applications;
	}

	public void setApplications(int applications) {
		this.applications = applications;
	}
   
}
