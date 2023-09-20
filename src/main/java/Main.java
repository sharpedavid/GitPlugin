import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Main {


    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
        InputStream input = new Main().getClass().getClassLoader().getResourceAsStream("git.properties");
        properties.load(input);
        String commitId = properties.getProperty("git.commit.id");

    }
}
