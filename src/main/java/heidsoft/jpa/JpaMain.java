package heidsoft.jpa;

/**
 * <code>JpaMain</code>
 *
 * @description:
 * @version:0.0.1
 * @author:liubin(wind.b.liu@leaptocloud.com)
 * @date:2016/3/23 22:46
 */
public class JpaMain {
    public static void main(String[] args) {
        HelloService helloService = new HelloServiceBean();
        helloService.sayHello("无状态Bean");
    }
}
