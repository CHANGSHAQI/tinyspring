package us.codecraft.tinyioc.step4;

/**
 * @author: 祁文杰(灯塔)
 * @Date: 2022/2/14 17:42
 * @Description:
 */
public class HelloWorldService {
    private String text;

    public void helloWorld(){
        System.out.println(text);
    }

    public void setText(String text) {
        this.text = text;
    }
}