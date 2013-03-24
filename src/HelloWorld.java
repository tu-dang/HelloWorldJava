import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created with IntelliJ IDEA.
 * User: Tu Huynh Dang
 * Date: 3/24/13
 * Time: 3:33 PM
 * To change this template use File | Settings | File Templates.
 */
public class HelloWorld {
    public static void main(String[] args) throws IOException {
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Tu t'appales comment ?");
        System.out.flush();
        String s = buff.readLine();
        System.out.printf("Hello, %s", s);

    }
}
