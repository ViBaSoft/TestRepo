package org.vibasoft.bvr.test.ThreadTest.misc;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadExecutors {

	
	public static void main(String[] args) {
		ExecutorService executor = Executors.newFixedThreadPool(2);//newSingleThreadExecutor();
		executor.execute(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
//				while(true) {
					System.out
							.println(Thread.currentThread().getName() + "Run1");
//				}
			}
			
		});
		
		Runnable run2 = new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
//				while(true) {
					System.out
							.println(Thread.currentThread().getName() + "Run2");
//				}
			}
			
		};
		Runnable run3 = new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
//				while(true) {
					System.out
							.println(Thread.currentThread().getName() + "Run3");
//				}
			}
			
		};
		Runnable run4 = new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
//				while(true) {
					System.out
							.println(Thread.currentThread().getName() + "Run4");
//				}
			}
			
		};
		executor.submit(run2);
		executor.submit(run3);
		executor.submit(run4);
		executor.shutdown();
	}
}
