package com.example.mindtree.feedbackservice;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "FEED_BACK_TBL")
public class FeedBackForm implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	@Column(name = "FEED_ID")
	private int id;

	@Column(name = "MESSAGE")
	private String message;

	@Column(name = "RATING")
	private String rating;

	@Column(name = "COMMENTS")
	private String comments;
	
	@OneToMany
	@Column(name = "CUST_ID")
	private Customer customer;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	@Override
	public String toString() {
		return "FeedBackForm [id=" + id + ", message=" + message + ", rating=" + rating + ", comments=" + comments
				+ "]";
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

}
