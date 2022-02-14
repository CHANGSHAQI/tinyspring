package us.codecraft.tinyioc.step4.factory;

import us.codecraft.tinyioc.step4.BeanDefinition;
import us.codecraft.tinyioc.step4.PropertyValue;

import java.lang.reflect.Field;

/**
 * @author: 祁文杰(灯塔)
 * @Date: 2022/2/14 16:41
 * @Description:
 */
public class AutowireCapableBeanFactory extends AbstractBeanFactory{

    @Override
    protected Object doCreateBean(BeanDefinition beanDefinition) throws Exception {
        Object bean = createBeanInstance(beanDefinition);
        applyPropertyValues(bean,beanDefinition);
        return bean;
    }

    protected Object createBeanInstance(BeanDefinition beanDefinition) throws Exception {
        return beanDefinition.getBeanClass().newInstance();
    }

    protected void applyPropertyValues(Object bean,BeanDefinition mbd) throws Exception{
        for (PropertyValue propertyValue:mbd.getPropertyValues().getPropertyValues()){
            Field declaredField = bean.getClass().getDeclaredField(propertyValue.getName());
            declaredField.setAccessible(true);
            declaredField.set(bean,propertyValue.getValue());
        }
    }
}