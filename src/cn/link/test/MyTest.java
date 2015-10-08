package cn.link.test;

import java.io.IOException;

import org.apache.http.HttpEntity;
import org.apache.http.StatusLine;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

public class MyTest {
	public static void main(String[] args) throws Exception {
		CloseableHttpClient httpclient = HttpClients.createDefault();
		HttpGet httpGet = new HttpGet("http://www.jianke.com/product/1816.html");
		CloseableHttpResponse  response = httpclient.execute(httpGet);
		StatusLine sl = response.getStatusLine();
		int statusCode = sl.getStatusCode();
		HttpEntity entity = response.getEntity();  
        String body = EntityUtils.toString(entity);  
        System.out.println(body);
	}
}
