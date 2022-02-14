package us.codecraft.tinyioc.step4.io;

import java.net.URL;

/**
 * @author: 祁文杰(灯塔)
 * @Date: 2022/2/14 16:29
 * @Description:
 */
public class ResourceLoader {

    public Resource getResource(String location){
        URL resource = this.getClass().getClassLoader().getResource(location);
        return new UrlResource(resource);
    }
}