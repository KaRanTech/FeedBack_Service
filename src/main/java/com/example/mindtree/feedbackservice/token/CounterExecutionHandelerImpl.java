package com.example.mindtree.feedbackservice.token;

import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;

public class CounterExecutionHandelerImpl implements RejectedExecutionHandler {

	@Override
	public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {
		System.out.println(r.toString() + " : I've been rejected ! ");

	}

}
