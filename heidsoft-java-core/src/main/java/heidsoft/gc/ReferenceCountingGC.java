package heidsoft.gc;

/**
 * https://blog.csdn.net/weiyongxuan/article/details/46685583
 * https://blog.csdn.net/renfufei/article/details/49230943
 * https://blog.csdn.net/renfufei/article/details/61924893
 * https://www.jianshu.com/p/536b0df1fd55
 * -verbose:[class|gc|jni] 在输出设备上显示虚拟机运行信息。
 * -verbose:class 显示有多少个类被加载
 * -verbose:gc 在虚拟机发生内存回收时在输出设备显示信息
 * -verbose:jni 输出native方法调用的相关情况，一般用于诊断jni调用错误信息。
 * -verbose:gc 
 * -XX:+PrintGCDetails  打印日志详细信息
 * -XX:+PrintGCDateStamps 显示时间戳
 * -Xloggc:gc.log 输出到文件
 * 
 * @author Nicholas
 *
 */

public class ReferenceCountingGC {

	public Object instance = null;
	private static final int _1MB = 1024 * 1024;

	// 这个属性的作用就是占点内存，以便在GC 日志中查看内存是否被回收
	private byte[] bigSize = new byte[2 * _1MB];

	public void testGC() {
		ReferenceCountingGC referenceCountingGC1 = new ReferenceCountingGC();
		ReferenceCountingGC referenceCountingGC2 = new ReferenceCountingGC();

		// 循环引用
		referenceCountingGC1.instance = referenceCountingGC2;
		referenceCountingGC2.instance = referenceCountingGC1;

		referenceCountingGC1 = null;
		referenceCountingGC2 = null;

		System.gc();
	}

	public static void main(String[] args) {
		new ReferenceCountingGC().testGC();
	}
}