package us.codecraft.tinyioc.step4;

import us.codecraft.tinyioc.step4.io.ResourceLoader;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: 祁文杰(灯塔)
 * @Date: 2022/2/14 16:22
 * @Description:
 */
public abstract class AbstractBeanDefinitionReader implements BeanDefinitionReader{

    private Map<String, BeanDefinition> registry;

    private ResourceLoader resourceLoader;

    protected AbstractBeanDefinitionReader(ResourceLoader resourceLoader){
        this.registry = new HashMap<>();
        this.resourceLoader = resourceLoader;
    }

    public Map<String, BeanDefinition> getRegistry() {
        return registry;
    }

    public ResourceLoader getResourceLoader() {
        return resourceLoader;
    }
}