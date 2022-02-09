package us.codecraft.tinyioc.step3;

/**
 * @author: 祁文杰(灯塔)
 * @Date: 2022/2/9 13:09
 * @Description:
 */
public class HelloWorldService {

    private String text;

    public void helloWorld() {
        System.out.println(text);
    }

    public void setText(String text){
        this.text = text;
    }
}