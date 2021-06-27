package heidsoft.thread.extthread;

import heidsoft.thread.entity.PublicVar;

/**
 * 脏读测试线程
 */
public class EntityThreadA extends Thread{
    private PublicVar publicVar;

    public EntityThreadA(PublicVar publicVar) {
        super();
        this.publicVar = publicVar;
    }

    @Override
    public void run() {
        super.run();
        publicVar.setValue("B","BB");
    }


}
