package com.example.mindtree.feedbackservice.token;

import java.util.List;

/**
 * @author AG16714
 *
 */
public class TokenAssignService implements Runnable {

	private final List<Runnable> runnables;

	private final List<Integer> list;

	public TokenAssignService(List<Runnable> runnables, List<Integer> list) {
		this.runnables = runnables;
		this.list = list;
	}

	@Override
	public void run() {
		for (Runnable runnable : runnables) {
			new Thread(runnable).start();
		}
	}

}
