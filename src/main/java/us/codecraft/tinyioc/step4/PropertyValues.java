package us.codecraft.tinyioc.step4;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: 祁文杰(灯塔)
 * @Date: 2022/2/14 16:14
 * @Description: * 包装一个对象所有的PropertyValue。<br/>
 *  * 为什么封装而不是直接用List?因为可以封装一些操作
 */
public class PropertyValues {

    private final List<PropertyValue> propertyValueList = new ArrayList<>();

    public PropertyValues(){}

    public void addPropertyValue(PropertyValue pv){
        this.propertyValueList.add(pv);
    }

    public List<PropertyValue> getPropertyValues(){
        return this.propertyValueList;
    }
}