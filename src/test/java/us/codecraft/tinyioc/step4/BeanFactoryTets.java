package us.codecraft.tinyioc.step4;

import org.junit.Test;
import us.codecraft.tinyioc.step4.factory.AutowireCapableBeanFactory;
import us.codecraft.tinyioc.step4.factory.BeanFactory;
import us.codecraft.tinyioc.step4.io.ResourceLoader;
import us.codecraft.tinyioc.step4.xml.XmlBeanDefinitionReader;

import java.util.Map;

/**
 * @author: 祁文杰(灯塔)
 * @Date: 2022/2/14 17:43
 * @Description:
 */
public class BeanFactoryTets {

    @Test
    public void test() throws Exception {
        // 1.读取配置
        XmlBeanDefinitionReader xmlBeanDefinitionReader = new XmlBeanDefinitionReader(new ResourceLoader());
        xmlBeanDefinitionReader.loadBeanDefinitions("tinyioc.xml");

        // 2.初始化BeanFactory并注册bean
        BeanFactory beanFactory = new AutowireCapableBeanFactory();
        for(Map.Entry<String, BeanDefinition> beanDefinitionEntry : xmlBeanDefinitionReader.getRegistry().entrySet()){
            beanFactory.registerBeanDefinition(beanDefinitionEntry.getKey(), beanDefinitionEntry.getValue());
        }

        //获取Bean
        HelloWorldService helloWorldService = (HelloWorldService) beanFactory.getBean("helloWorldService");
        helloWorldService.helloWorld();
    }
}