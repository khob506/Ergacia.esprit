package entity;

import java.io.Serializable;
import java.lang.String;
import java.sql.Timestamp;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Entreprise_Profile
 *
 */
@Entity

public class Entreprise_Profile implements Serializable {

	   
	@Id
	private int id;
	private String website;
	private String industry;
	private int size;
	private String headquarter;
	private String type;
	private Timestamp date_foundation;
	private static final long serialVersionUID = 1L;

	public Entreprise_Profile() {
		super();
	}   
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}   
	public String getWebsite() {
		return this.website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}   
	public String getIndustry() {
		return this.industry;
	}

	public void setIndustry(String industry) {
		this.industry = industry;
	}   
	public int getSize() {
		return this.size;
	}

	public void setSize(int size) {
		this.size = size;
	}   
	public String getHeadquarter() {
		return this.headquarter;
	}

	public void setHeadquarter(String headquarter) {
		this.headquarter = headquarter;
	}   
	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}   
	public Timestamp getDate_foundation() {
		return this.date_foundation;
	}

	public void setDate_foundation(Timestamp date_foundation) {
		this.date_foundation = date_foundation;
	}
   
}
