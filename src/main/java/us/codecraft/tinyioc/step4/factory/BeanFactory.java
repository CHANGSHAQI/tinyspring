package us.codecraft.tinyioc.step4.factory;

import us.codecraft.tinyioc.step4.BeanDefinition;

public interface BeanFactory {

    Object getBean(String name);

    void registerBeanDefinition(String name, BeanDefinition beanDefinition) throws Exception;

}
