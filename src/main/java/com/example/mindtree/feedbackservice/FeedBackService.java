package com.example.mindtree.feedbackservice;

import org.springframework.beans.factory.annotation.Autowired;

public class FeedBackService {
	
	@Autowired
	private FeedBackFormRepository repository;
	
	/**
	 * @param model
	 * @return
	 */
	public FeedBackFormModel saveFeedBackForm(FeedBackFormModel model) {
		FeedBackForm form = new FeedBackForm();
		form.setMessage(model.getMessage());
		form.setRating(model.getRating());
		form.setComments(model.getComments());
		form.setCustomer(model.getCustID());
			repository.save(form);		
		return model;
		
	}
	
	/**
	 * @param custId
	 * @return
	 */
	public FeedBackFormModel getFeedBackInfo(long custId) {
		FeedBackFormModel form = new FeedBackFormModel();
		FeedBackForm feedback = repository.getCustomer(custId);
		form.setCustID(feedback.getCustomer());
		form.setComments(feedback.getComments());
		form.setMessage(feedback.getMessage());
		form.setRating(feedback.getRating());
		return form;	
	}

}
