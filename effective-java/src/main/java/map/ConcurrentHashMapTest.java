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
        //putNull();
        threshold();


    }

    private static void threshold() {
        HashMap map=new HashMap();
        //ConcurrentHashMap map=new ConcurrentHashMap();

        map.put(1,1);
        map.put(2,1);
        map.put(3,1);
        map.put(4,1);
        map.put(5,1);
        map.put(6,1);
        map.put(7,1);
        map.put(8,1);
        map.put(9,1);
        map.put(10,1);
        map.put(11,1);
        map.put(12,1);
        //map.threshold 12
        System.out.println(map.size());
        map.put(13,1);
        //map.threshold 24
        System.out.println(map.size());
    }

    private static void putNull() {
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
