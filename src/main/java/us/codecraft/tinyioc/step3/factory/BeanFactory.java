package us.codecraft.tinyioc.step3.factory;

import us.codecraft.tinyioc.step3.BeanDefinition;

public interface BeanFactory {

    Object getBean(String name);

    void registerBeanDefinition(String name, BeanDefinition beanDefinition) throws Exception;
}
