import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author heidsoft
 * 模拟使用Executors导致OOM的情况, 不建议使用此种方式创建线程池
 * https://zhuanlan.zhihu.com/p/32867181
 */
public class ExcutorsRunner {
    private static ExecutorService executor = Executors.newFixedThreadPool(15);
    public static void main(String[] args){
        for(int i = 0; i< Integer.MAX_VALUE; i++){
            System.out.println(i);
            executor.execute(new SubThread());
        }
    }
}

class SubThread extends Thread{
    @Override
    public void run(){
        try{
            Thread.sleep(10000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
