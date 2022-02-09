package us.codecraft.tinyioc.step2.factory;

import us.codecraft.tinyioc.step2.BeanDefinition;

public interface BeanFactory {

    Object getBean(String name);

    void registerBeanDefinition(String name, BeanDefinition beanDefinition);
}
