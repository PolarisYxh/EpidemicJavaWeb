package yxh.demo;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
public class PhoneSend {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		URL url=new URL("https://api.jisuapi.com/sms/send?mobile=13121272591&content=%E6%81%AD%E5%96%9C%E4%BD%A0%EF%BC%8C%E4%BD%9C%E4%B8%9A%E5%B7%B2%E5%AE%8C%E6%88%90%EF%BC%81%E9%AA%8C%E8%AF%81%E7%A0%81%E6%98%AF%EF%BC%9A666666%E3%80%82%E5%A6%82%E9%9D%9E%E6%9C%AC%E4%BA%BA%E6%93%8D%E4%BD%9C%EF%BC%8C%E8%AF%B7%E5%BF%BD%E7%95%A5%E6%9C%AC%E7%9F%AD%E4%BF%A1%EF%BC%81%E3%80%90%E5%BC%80%E8%AF%BE%E5%90%A7%E6%96%B0%E8%81%8C%E8%AF%BE%E3%80%91&appkey=62958a3a6ef3c56d");
		URLConnection conn=url.openConnection();
	
		InputStream is=conn.getInputStream(); 
		BufferedReader br=new BufferedReader(new InputStreamReader(is,"utf-8")); 
		String text=br.readLine();
		System.out.println(text);
	}

}
