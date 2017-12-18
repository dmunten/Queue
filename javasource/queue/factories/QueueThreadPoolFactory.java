package queue.factories;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

import queue.entities.QueueConfiguration;

public class QueueThreadPoolFactory {
	
	public ScheduledExecutorService newScheduledThreadPool(QueueConfiguration configuration, QueueThreadFactory factory) {
		return Executors.newScheduledThreadPool(configuration.getCorePoolSize(), factory);
	}

}
