package com.example.mindtree.feedbackservice.token;

import java.util.ArrayList;
import java.util.List;

public class Counter_2 implements Runnable {
	int count = 0;
	List<Integer> list = new ArrayList<Integer>();

	@Override
	public void run() {
		System.out.println("Counetr_1");
		try {
			wait();
			if (list.size() == 0) {
				wait();
				count = list.remove(count);
				notify();
				Thread.sleep(2000);
			}

		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}
}
