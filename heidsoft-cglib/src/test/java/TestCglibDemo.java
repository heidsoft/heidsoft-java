import com.heidsoft.*;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.beans.BeanGenerator;
import net.sf.cglib.proxy.Mixin;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import static org.junit.Assert.*;
/**
 * @program: heidsoft-java
 * @description: test,http://junit.sourceforge.net/javadoc/org/junit/Assert.html
 * @author: heidsoft
 * @create: 2018-11-19 22:49
 **/
public class TestCglibDemo {

    @Test
    public void testEnhancerMethodInterceptor(){
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(PersonService.class);
        enhancer.setCallback((MethodInterceptor)(obj,method,args,proxy) ->{
            if( method.getDeclaringClass() != Object.class && method.getReturnType() == String.class){
                return "Hello Tom!";
            } else {
                return proxy.invokeSuper(obj,args);
            }
        });

        PersonService proxy = (PersonService) enhancer.create();
        assertEquals("Hello Tom!",proxy.sayHello(null));

        int lengthOfName = proxy.lengthOfName("Mary");
        assertEquals(4,lengthOfName);
    }

    @Test
    public void testBeanGenerator(){
        BeanGenerator beanGenerator = new BeanGenerator();

        beanGenerator.addProperty("name", String.class);
        Object myBean = beanGenerator.create();
        Method setter = null;
        try {
            setter = myBean.getClass().getMethod("setName", String.class);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        try {
            setter.invoke(myBean, "some string value set by a cglib");
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

        Method getter = null;
        try {
            getter = myBean.getClass().getMethod("getName");
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        try {
            assertEquals("some string value set by a cglib", getter.invoke(myBean));
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

    }

    @Test
    public void testMixin(){
        Mixin mixin = Mixin.create(
                new Class[]{ Interface1.class, Interface2.class, MixinInterface.class },
                new Object[]{ new Class1(), new Class2() }
        );
        MixinInterface mixinDelegate = (MixinInterface) mixin;

        assertEquals("first behaviour", mixinDelegate.first());
        assertEquals("second behaviour", mixinDelegate.second());
    }
}

