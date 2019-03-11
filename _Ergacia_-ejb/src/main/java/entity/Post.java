package entity;

import java.io.Serializable;
import java.lang.String;
import java.sql.*;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Post
 *
 */
@Entity

public class Post implements Serializable {

	   
	@Id
	private int id;
	private String titre;
	private String content;
	private String img_url;
	private Timestamp date;
	private static final long serialVersionUID = 1L;

	public Post() {
		super();
	}   
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}   
	public String getTitre() {
		return this.titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}   
	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}   
	public String getImg_url() {
		return this.img_url;
	}

	public void setImg_url(String img_url) {
		this.img_url = img_url;
	}
	public Timestamp getDate() {
		return date;
	}
	public void setDate(Timestamp date) {
		this.date = date;
	}
   
}
