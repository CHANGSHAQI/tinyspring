package us.codecraft.tinyioc.step4;

/**
 * @author: 祁文杰(灯塔)
 * @Date: 2022/2/14 16:10
 * @Description: 用于bean的属性注入
 */
public class PropertyValue {

    private final String name;

    private final Object value;

    public PropertyValue(String name,Object value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public Object getValue() {
        return value;
    }
}