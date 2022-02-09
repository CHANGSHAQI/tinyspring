package us.codecraft.tinyioc.step3;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: 祁文杰(灯塔)
 * @Date: 2022/2/9 11:42
 * @Description:
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