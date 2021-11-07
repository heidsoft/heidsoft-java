package heidsoft.concurrency;

/**
 * @author heidsoft
 */
public class ConcurrencyRunner {
    public static void main(String[] args) {

        Counter counter = new Counter();
        counter.increment();
        counter.increment();
        counter.increment();
        System.out.println( counter.getI());

        BiCounter biCounter = new BiCounter();
        biCounter.incrementI();
        biCounter.incrementI();
        biCounter.incrementI();
        biCounter.incrementJ();
        biCounter.incrementJ();
        biCounter.incrementJ();
        System.out.println( biCounter.getI());
        System.out.println( biCounter.getJ());

        BiCounterWithLock biCounterWithLock = new BiCounterWithLock();
        biCounterWithLock.incrementI();
        biCounterWithLock.incrementI();
        biCounterWithLock.incrementI();
        biCounterWithLock.incrementJ();
        biCounterWithLock.incrementJ();
        biCounterWithLock.incrementJ();
        System.out.println( biCounterWithLock.getI());
        System.out.println( biCounterWithLock.getJ());

        BiCounterWithAtomicInteger biCounterWithAtomicInteger = new BiCounterWithAtomicInteger();
        biCounterWithAtomicInteger.incrementI();
        biCounterWithAtomicInteger.incrementI();
        biCounterWithAtomicInteger.incrementI();
        biCounterWithAtomicInteger.incrementJ();
        biCounterWithAtomicInteger.incrementJ();
        biCounterWithAtomicInteger.incrementJ();
        System.out.println( biCounterWithAtomicInteger.getI());
        System.out.println( biCounterWithAtomicInteger.getJ());
    }
}
