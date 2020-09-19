package com.example.mindtree.Orderdemo.servicetest;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import javax.swing.text.DefaultEditorKit.CutAction;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import com.example.mindtree.feedbackservice.Customer;
import com.example.mindtree.feedbackservice.FeedBackForm;
import com.example.mindtree.feedbackservice.FeedBackFormModel;
import com.example.mindtree.feedbackservice.FeedBackFormRepository;

@RunWith(MockitoJUnitRunner.class)
public class FeedBackServiceTest {
	
	@InjectMocks
	private FeedBackServiceTest service;
	
	@Mock
	private FeedBackFormRepository repository;
	
	@Test
	public void savefeedback() {
		FeedBackFormModel model = new FeedBackFormModel();
		model.setComments("i am happy on it");
		model.setMessage("Thanks for the quqlity service");
		model.setRating("4.2");
		Customer customer = new Customer();
		customer.setId(1l);
		model.setCustID(customer);
		FeedBackForm form = new FeedBackForm();
		form.setMessage(model.getMessage());
		form.setRating(model.getRating());
		form.setComments(model.getComments());
		form.setCustomer(model.getCustID());
		FeedBackForm model1 = repository.save(form);
		service.savefeedback();
		assertNotNull(model1);
	}
}
