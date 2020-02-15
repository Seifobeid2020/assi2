import org.apache.commons.io.filefilter.FileFilterUtils;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.poi.hssf.record.RecordBase;
/**
 * This class contains a main method that instantiates different objects from
 different libraries
 * @author Anas Samara // put your name
 *
 */
public class TestMavenPlugins {
    /**
     * This is the main method that prints your name
     * @param args
     */
    public static void main(String[] args) {

        FileFilterUtils fileFilterUtils = new FileFilterUtils();

        RecordBase recordBase;

        CloseableHttpClient httpClient = HttpClients.createDefault();
        System.out.println("My name is ANAS ");
        System.out.println("!!!!!!!!!!!!!DONE!!!!!!!!!!!!!!!");
    }

    /**
     * This method takes a string as input and does nothing with it
     * @param inputString
     */
    public void method1(String inputString) {

    }

    /**
     * This method does nothing
     * @return number ZERO
     */
    public int method2() {
        return 0;
    }
} 