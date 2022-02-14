package us.codecraft.tinyioc.step4.xml;

import org.junit.Assert;
import org.junit.Test;
import us.codecraft.tinyioc.step4.BeanDefinition;
import us.codecraft.tinyioc.step4.io.ResourceLoader;

import java.util.Map;

/**
 * @author: 祁文杰(灯塔)
 * @Date: 2022/2/14 17:39
 * @Description:
 */
public class XmlBeanDefinitionReaderTest {

    @Test
    public void test() throws Exception {
        XmlBeanDefinitionReader xmlBeanDefinitionReader = new XmlBeanDefinitionReader(new ResourceLoader());
        xmlBeanDefinitionReader.loadBeanDefinitions("tinyioc.xml");
        Map<String, BeanDefinition> registry = xmlBeanDefinitionReader.getRegistry();
        Assert.assertTrue(registry.size()>0);
    }
}