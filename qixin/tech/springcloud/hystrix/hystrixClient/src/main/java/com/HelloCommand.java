package com;


import com.netflix.hystrix.HystrixCommand;
import com.netflix.hystrix.HystrixCommandGroupKey;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

/**
 * Created by qixin on 2018/1/22.
 */
public class HelloCommand extends HystrixCommand<String> {
    private String url;

    CloseableHttpClient httpClient;

    public HelloCommand(String url) {
        super(HystrixCommandGroupKey.Factory.asKey("ExampleGroup"));

        this.httpClient = HttpClients.createDefault();
        this.url = url;
    }

    @Override
    protected String run() throws Exception {
        HttpGet httpGet = new HttpGet(url);
        HttpResponse response = httpClient.execute(httpGet);
        return EntityUtils.toString(response.getEntity());
    }

    @Override
    protected String getFallback() {
        System.out.println("fallback");
        return "error";
    }
}
