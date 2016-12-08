import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Test {
    public static void main(String[] args) throws Exception {
        System.out.println("Here we go! Iphone 4 như mới màn hình Hello");
        URL url = new URL("https://www.chotot.com/quan-8/mua-ban-dien-thoai-di-dong/gl-lumia-640xl-con-moi-99--30103033.htm");
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestMethod("GET");
        con.setRequestProperty("User-Agent", "Mozilla/5.0");
        BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuffer response = new StringBuffer();

        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        in.close();
        
        String html = response.toString();
        System.out.println(html);
    }
}
