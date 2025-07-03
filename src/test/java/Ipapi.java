import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

/**
 * 
 */

/**
 * @author nages
 *
 */
public class Ipapi {
	public static void main(String[] args) throws IOException {
		URL ipapi = new URL("https://ipapi.co/49.205.165.172/json/");

		URLConnection c = ipapi.openConnection();
		c.setRequestProperty("User-Agent", "java-ipapi-client");
		BufferedReader reader = new BufferedReader(new InputStreamReader(c.getInputStream()));
		String location = reader.readLine();
		reader.close();

		System.out.println(location);
	}

}
