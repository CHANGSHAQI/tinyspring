package us.codecraft.tinyioc.step4.io;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

/**
 * @author: 祁文杰(灯塔)
 * @Date: 2022/2/14 16:27
 * @Description:
 */
public class UrlResource implements Resource{

    private final URL url;

    public UrlResource(URL url){
        this.url = url;
    }

    @Override
    public InputStream getInputStream() throws IOException {
        URLConnection urlConnection = url.openConnection();
        urlConnection.connect();
        return urlConnection.getInputStream();
    }
}