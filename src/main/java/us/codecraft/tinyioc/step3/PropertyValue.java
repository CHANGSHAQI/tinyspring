package us.codecraft.tinyioc.step3;

/**
 * @author: 祁文杰(灯塔)
 * @Date: 2022/2/9 11:40
 * @Description: 用于bean的属性注入
 */
public class PropertyValue {

    private final String name;

    private final Object value;

    public PropertyValue(String name, String value){
        this.name=name;
        this.value=value;
    }

    public String getName(){
        return name;
    }

    public Object getValue(){
        return value;
    }
}