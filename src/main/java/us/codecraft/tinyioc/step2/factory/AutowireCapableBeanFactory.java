package us.codecraft.tinyioc.step2.factory;

import us.codecraft.tinyioc.step2.BeanDefinition;

/**
 * @author: 祁文杰(灯塔)
 * @Date: 2022/2/9 11:25
 * @Description:
 */
public class AutowireCapableBeanFactory extends AbstractBeanFactory{

    @Override
    protected Object doCreateBean(BeanDefinition beanDefinition) {
        try {
            Object bean = beanDefinition.getBeanClass().newInstance();
            return bean;
        } catch (InstantiationException e){
            e.printStackTrace();
        } catch (IllegalAccessException e){
            e.printStackTrace();
        }

        return null;
    }
}