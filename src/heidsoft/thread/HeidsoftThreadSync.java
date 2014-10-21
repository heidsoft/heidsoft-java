package heidsoft.thread;

import java.util.concurrent.TimeUnit;

/**
 * 对stopRequested 进行同步操作，使其数据的变化，两个线程都能看到。
 * @author heidsoft
 *
 */
public class HeidsoftThreadSync {
	private static boolean stopRequested;
	
	private synchronized static void stopRequested(){//写操作同步
		stopRequested=true;
	}
	
	private synchronized static boolean reqeustStop(){//读操作
		return stopRequested;
	}
	
	
	public static void main(String[] args) throws InterruptedException {
		Thread backGroudThread = new Thread(new Runnable(){

			int i=0;
			@Override
			public void run() {
				
				while(!reqeustStop()){//轮旬
					i++;
					System.out.println("i="+i);
				}
			}
			
		});
		
		backGroudThread.start();//开启线程
		
		TimeUnit.SECONDS.sleep(1L);
		
		stopRequested();
	}

}
