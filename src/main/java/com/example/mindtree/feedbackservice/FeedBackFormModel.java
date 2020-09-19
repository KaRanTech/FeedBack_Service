package com.example.mindtree.feedbackservice;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "message", "rating", "comments"})
public class FeedBackFormModel {
	
	private String message;
	
	private String rating;
	
	private String comments;
	
	private Customer CustID;

	public Customer getCustID() {
		return CustID;
	}

	public void setCustID(Customer custID) {
		CustID = custID;
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

	@Override
	public String toString() {
		return "FeedBackFormModel [message=" + message + ", rating=" + rating + ", comments=" + comments + "]";
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

}
