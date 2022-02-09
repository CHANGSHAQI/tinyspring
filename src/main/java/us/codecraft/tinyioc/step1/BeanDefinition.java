package us.codecraft.tinyioc.step1;

/**
 * @author: 祁文杰(灯塔)
 * @Date: 2022/2/9 10:45
 * @Description:
 */
public class BeanDefinition {

    private Object bean;

    public BeanDefinition(Object bean){
        this.bean = bean;
    }

    public Object getBean(){
        return bean;
    }
}