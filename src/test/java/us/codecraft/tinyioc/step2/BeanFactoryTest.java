package us.codecraft.tinyioc.step2;

import org.junit.Test;
import us.codecraft.tinyioc.step2.factory.AutowireCapableBeanFactory;
import us.codecraft.tinyioc.step2.factory.BeanFactory;

/**
 * @author: 祁文杰(灯塔)
 * @Date: 2022/2/9 11:28
 * @Description:
 */
public class BeanFactoryTest {

    @Test
    public void test() {

        //1.初始化beanfactory
        BeanFactory beanFactory = new AutowireCapableBeanFactory();

        //2.注入bean
        BeanDefinition beanDefinition = new BeanDefinition();
        beanDefinition.setBeanClassName("us.codecraft.tinyioc.step2.HelloWorldService");
        beanFactory.registerBeanDefinition("helloWorldService",beanDefinition);

        //3.获取bean
        HelloWorldService helloWorldService = (HelloWorldService) beanFactory.getBean("helloWorldService");
        helloWorldService.helloWorld();
    }
}