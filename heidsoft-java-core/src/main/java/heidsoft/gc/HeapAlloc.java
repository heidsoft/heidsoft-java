package heidsoft.gc;

/**
 * 程序运行参数
 * -Xms512M -Xmx1024M -XX:+PrintCommandLineFlags -XX:+PrintGCDetails -XX:+UseSerialGC
 *
 * <p>/Library/Java/JavaVirtualMachines/jdk1.8.0_144.jdk/Contents/Home/bin/java -Xms512M -Xmx1024M -XX:+PrintCommandLineFlags -XX:+PrintGCDetails -XX:+UseSerialGC "-javaagent:/Applications/IntelliJ IDEA.app/Contents/lib/idea_rt.jar=59634:/Applications/IntelliJ IDEA.app/Contents/bin" -Dfile.encoding=UTF-8 -classpath /Library/Java/JavaVirtualMachines/jdk1.8.0_144.jdk/Contents/Home/jre/lib/charsets.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_144.jdk/Contents/Home/jre/lib/deploy.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_144.jdk/Contents/Home/jre/lib/ext/cldrdata.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_144.jdk/Contents/Home/jre/lib/ext/dnsns.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_144.jdk/Contents/Home/jre/lib/ext/jaccess.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_144.jdk/Contents/Home/jre/lib/ext/jfxrt.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_144.jdk/Contents/Home/jre/lib/ext/localedata.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_144.jdk/Contents/Home/jre/lib/ext/nashorn.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_144.jdk/Contents/Home/jre/lib/ext/sunec.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_144.jdk/Contents/Home/jre/lib/ext/sunjce_provider.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_144.jdk/Contents/Home/jre/lib/ext/sunpkcs11.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_144.jdk/Contents/Home/jre/lib/ext/zipfs.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_144.jdk/Contents/Home/jre/lib/javaws.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_144.jdk/Contents/Home/jre/lib/jce.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_144.jdk/Contents/Home/jre/lib/jfr.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_144.jdk/Contents/Home/jre/lib/jfxswt.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_144.jdk/Contents/Home/jre/lib/jsse.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_144.jdk/Contents/Home/jre/lib/management-agent.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_144.jdk/Contents/Home/jre/lib/plugin.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_144.jdk/Contents/Home/jre/lib/resources.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_144.jdk/Contents/Home/jre/lib/rt.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_144.jdk/Contents/Home/lib/ant-javafx.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_144.jdk/Contents/Home/lib/dt.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_144.jdk/Contents/Home/lib/javafx-mx.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_144.jdk/Contents/Home/lib/jconsole.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_144.jdk/Contents/Home/lib/packager.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_144.jdk/Contents/Home/lib/sa-jdi.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_144.jdk/Contents/Home/lib/tools.jar:/Users/heidsoft/research/heidsoft-java/heidsoft-java-io/out/production/classes:/Users/heidsoft/research/heidsoft-java/heidsoft-java-io/out/production/resources:/Users/heidsoft/.gradle/caches/modules-2/files-2.1/org.slf4j/slf4j-api/1.7.21/139535a69a4239db087de9bab0bee568bf8e0b70/slf4j-api-1.7.21.jar:/Users/heidsoft/.gradle/caches/modules-2/files-2.1/io.netty/netty-all/4.0.4.Final/925914146e37041255ea18ae2d5982f9589c784d/netty-all-4.0.4.Final.jar:/Users/heidsoft/.gradle/caches/modules-2/files-2.1/javax.persistence/persistence-api/1.0/5725f57873e05e068803e2bf9d5a8ea3740ffec5/persistence-api-1.0.jar:/Users/heidsoft/.gradle/caches/modules-2/files-2.1/commons-logging/commons-logging/1.2/4bfc12adfe4842bf07b657f0369c4cb522955686/commons-logging-1.2.jar heidsoft.gc.HeapAlloc
 -XX:InitialHeapSize=536870912 -XX:MaxHeapSize=1073741824 -XX:+PrintCommandLineFlags -XX:+PrintGCDetails -XX:+UseCompressedClassPointers -XX:+UseCompressedOops -XX:+UseSerialGC
 objc[2631]: Class JavaLaunchHelper is implemented in both /Library/Java/JavaVirtualMachines/jdk1.8.0_144.jdk/Contents/Home/bin/java (0x10a2a24c0) and /Library/Java/JavaVirtualMachines/jdk1.8.0_144.jdk/Contents/Home/jre/lib/libinstrument.dylib (0x10b3254e0). One of the two will be used. Which one is undefined.
 989Mb
 486Mb
 494Mb
 分配1M空间
 989Mb
 486Mb
 494Mb
 分配4M空间
 989Mb
 482Mb
 494Mb
 Heap
 def new generation   total 157248K, used 15278K [0x0000000780000000, 0x000000078aaa0000, 0x0000000795550000)
 eden space 139776K,  10% used [0x0000000780000000, 0x0000000780eeba08, 0x0000000788880000)
 from space 17472K,   0% used [0x0000000788880000, 0x0000000788880000, 0x0000000789990000)
 to   space 17472K,   0% used [0x0000000789990000, 0x0000000789990000, 0x000000078aaa0000)
 tenured generation   total 349568K, used 0K [0x0000000795550000, 0x00000007aaab0000, 0x00000007c0000000)
 the space 349568K,   0% used [0x0000000795550000, 0x0000000795550000, 0x0000000795550200, 0x00000007aaab0000)
 Metaspace       used 3302K, capacity 4496K, committed 4864K, reserved 1056768K
 class space    used 366K, capacity 388K, committed 512K, reserved 1048576K
 </p>
 *
 *
 *
 */

/**
 * @program: heidsoft-java
 * @description: 堆分配测试
 * @author: heidsoft
 * @create: 2018-09-12 16:08
 **/
public class HeapAlloc {
    public static void main(String[] args) {


        System.out.println("maxMemory " + Runtime.getRuntime().maxMemory()/(1024*1024) + "Mb");
        System.out.println("freeMemory " + Runtime.getRuntime().freeMemory()/(1024*1024) + "Mb");
        System.out.println("totalMemory "+ Runtime.getRuntime().totalMemory()/(1024*1024)+ "Mb");

        byte[] b1 = new byte[1*1024*1024];
        System.out.println("分配1M空间");

        System.out.println("maxMemory " + Runtime.getRuntime().maxMemory()/(1024*1024) + "Mb");
        System.out.println("freeMemory " + Runtime.getRuntime().freeMemory()/(1024*1024) + "Mb");
        System.out.println("totalMemory "+ Runtime.getRuntime().totalMemory()/(1024*1024)+ "Mb");

        byte[] b2 = new byte[4*1024*1024];
        System.out.println("分配4M空间");

        System.out.println("maxMemory " + Runtime.getRuntime().maxMemory()/(1024*1024) + "Mb");
        System.out.println("freeMemory " + Runtime.getRuntime().freeMemory()/(1024*1024) + "Mb");
        System.out.println("totalMemory "+ Runtime.getRuntime().totalMemory()/(1024*1024)+ "Mb");

    }
}
