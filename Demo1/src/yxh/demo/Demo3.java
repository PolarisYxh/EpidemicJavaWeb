package yxh.demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;

public class Demo3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String para=URLEncoder.encode("½²¸öÐ¦»°","UTF-8");
		URL url=new URL("https://api.jisuapi.com/iqa/query?appkey=62958a3a6ef3c56d&question="+para);
		URLConnection conn=url.openConnection();
		InputStream is=conn.getInputStream();
		BufferedReader br=new BufferedReader(new InputStreamReader(is,"utf-8"));
		String text=br.readLine();
		System.out.println(text);
	}

}
