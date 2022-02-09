package us.codecraft.tinyioc.step3.factory;

import us.codecraft.tinyioc.step3.BeanDefinition;
import us.codecraft.tinyioc.step3.PropertyValue;
import us.codecraft.tinyioc.step3.factory.AbstractBeanFactory;

import java.lang.reflect.Field;

/**
 * @author: 祁文杰(灯塔)
 * @Date: 2022/2/9 11:25
 * @Description:
 */
public class AutowireCapableBeanFactory extends AbstractBeanFactory {

    @Override
    protected Object doCreateBean(BeanDefinition beanDefinition) throws Exception {
        Object bean = createBeanInstance(beanDefinition);
        applyPropertyValues(bean,beanDefinition);
        return bean;
    }

    protected Object createBeanInstance(BeanDefinition beanDefinition) throws Exception{
        return beanDefinition.getBeanClass().newInstance();
    }

    protected void applyPropertyValues(Object bean, BeanDefinition beanDefinition) throws Exception {
        for (PropertyValue propertyValue:beanDefinition.getPropertyValues().getPropertyValues()) {
            Field declaredField = bean.getClass().getDeclaredField(propertyValue.getName());
            declaredField.setAccessible(true);
            declaredField.set(bean,propertyValue.getValue());
        }
    }
}