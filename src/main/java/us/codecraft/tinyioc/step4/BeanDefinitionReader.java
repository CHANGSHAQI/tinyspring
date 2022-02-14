package us.codecraft.tinyioc.step4;

public interface BeanDefinitionReader {

    void loadBeanDefinitions(String location) throws Exception;
}
