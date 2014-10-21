package heidsoft.test;

/**
 * volatitle 变量自增运算测试
 * @author heidsoft
 *
 */
public class TestVolatile {
	public static volatile int race=0;
	
	public static void increase(){
		race++;
	}
	
	private static final int THREADS_COUNT=20;
	
	public static void main(String[] args) {
		Thread[] threads = new Thread[THREADS_COUNT];
		
		for(int i=0;i<THREADS_COUNT;i++){
			threads[i]=new Thread(new Runnable() {
				
				@Override
				public void run() {
					for(int i=0;i<10000;i++){
						increase();
					}
				}
			});
			
			threads[i].start();
		}
		
		//等待所有累加线程都结束
		while(Thread.activeCount()>1){
			//该方法与sleep()类似，只是不能由用户指定暂停多长时间，
			//并且yield（）方法只能让同优先级的线程有执行的机会。
			Thread.yield();
			
			System.out.println(race);
		}
	}
}
