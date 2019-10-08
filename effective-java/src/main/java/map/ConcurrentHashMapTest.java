package map;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Author: yoyo
 * @Description:
 * @Date: Created in 2019/10/8 15:02
 */
public class ConcurrentHashMapTest {
    public static void main(String[] args) {
        HashMap map = new HashMap(2);
        map.put(null, null);

        //Exception in thread "main" java.lang.NullPointerException
        //	at java.base/java.util.concurrent.ConcurrentHashMap.putVal(ConcurrentHashMap.java:1021)
        //	at java.base/java.util.concurrent.ConcurrentHashMap.put(ConcurrentHashMap.java:1016)
        //	at map.ConcurrentHashMapTest.main(ConcurrentHashMapTest.java:17)
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(2);
        concurrentHashMap.put(null, null);
    }
}
