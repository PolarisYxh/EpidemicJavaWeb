package yxh.demo;
import java.net.URL;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.net.URLConnection;
public class Demo2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		URL url=new URL("https://zaixianke.com/yq/all");
		URLConnection conn=url.openConnection();
		InputStream is=conn.getInputStream();
		BufferedReader br=new BufferedReader(new InputStreamReader(is,"utf-8"));
		String text=br.readLine();
		System.out.println(text);
	}

}
