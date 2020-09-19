package com.example.mindtree.feedbackservice.token;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class MultipleCountersAssignToCust {
	
	public void getAssignCounter() {
		BlockingQueue<Runnable> worksQueue = new ArrayBlockingQueue<>(5);
		CounterExecutionHandelerImpl rejectionHandler = new CounterExecutionHandelerImpl();
        ThreadPoolExecutor executor = new ThreadPoolExecutor(3, 3, 10, TimeUnit.SECONDS, worksQueue, rejectionHandler);
 
        executor.prestartAllCoreThreads();
        
        List<Runnable> counterGroup = new ArrayList<>();
        counterGroup.add(new Counter_1());
        counterGroup.add(new Counter_2());
        List<Integer> listofTokens = new ArrayList<Integer>();
        
        worksQueue.add(new TokenAssignService(counterGroup,listofTokens));
	}

}
