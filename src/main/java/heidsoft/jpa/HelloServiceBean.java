package heidsoft.jpa;

import javax.ejb.Stateless;

/**
 * <code>HelloServiceBean</code>
 *
 * @description:
 * @version:0.0.1
 * @author:liubin(wind.b.liu@leaptocloud.com)
 * @date:2016/3/23 22:38
 */
@Stateless
public class HelloServiceBean implements HelloService{
    @Override
    public String sayHello(String name) {
        System.out.println("say:"+name);
        return name;
    }
}
