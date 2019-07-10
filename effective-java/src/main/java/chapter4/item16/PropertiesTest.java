package chapter4.item16;


import java.util.Hashtable;
import java.util.Properties;

/**
 * <p>PropertiesTest</p>
 *
 * @author wuxinshui
 */
public class PropertiesTest {
    public static void main(String[] args) {
        Hashtable hashtable=new Properties();
        hashtable.get("");

        Properties properties=new Properties();
        properties.put("1","1");
        properties.put("2","2");


        Object obj1=properties.get("1");
        Object obj2=properties.getProperty("1");

        System.out.println(obj1);
        System.out.println(obj2);
    }
}
