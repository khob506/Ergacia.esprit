package entity;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Question
 *
 */
@Entity

public class Question implements Serializable {

	   
	@Id
	private int id;
	private String diffculty;
	private String question;
	private int nbr_correct_answer;
	private static final long serialVersionUID = 1L;

	public Question() {
		super();
	}   
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}   
	public String getDiffculty() {
		return this.diffculty;
	}

	public void setDiffculty(String diffculty) {
		this.diffculty = diffculty;
	}   
	public String getQuestion() {
		return this.question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}   
	public int getNbr_correct_answer() {
		return this.nbr_correct_answer;
	}

	public void setNbr_correct_answer(int nbr_correct_answer) {
		this.nbr_correct_answer = nbr_correct_answer;
	}
   
}
