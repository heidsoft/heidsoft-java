package heidsoft.thread;

import java.util.concurrent.TimeUnit;

/**
 * 没有同步stopRequested，将导致无限的循环，此问题说明backGroudThread线程没有看到主线程对stopRequested进行的修改，即为没有达到
 * @author heidsoft
 *
 */
public class HeidsoftThread {

	private static boolean stopRequested;
	
	public static void main(String[] args) throws InterruptedException {
		Thread backGroudThread = new Thread(new Runnable(){

			int i=0;
			@Override
			public void run() {
				
				while(!stopRequested){//轮旬
					i++;
					System.out.println("i="+i);
				}
			}
			
		});
		
		backGroudThread.start();//开启线程
		
		TimeUnit.SECONDS.sleep(1L);
		
		stopRequested=true;
	}

}
