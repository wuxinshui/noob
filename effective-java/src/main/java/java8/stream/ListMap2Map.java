package java8.stream;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @Author: yoyo
 * @Description:
 * @Date: Created in 2019/5/28 14:17
 */
public class ListMap2Map {

    public static void main(String[] args) {
        List<String> phoneList = List.of("123", "124", "125", "126");
        String reward = "11111111111111";
        Map<String, Map<String, String>> params = phoneList.stream().map(phone -> {
            return Map.of(phone, Map.of("phone", phone, "reward", reward));
        }).map(Map::entrySet).flatMap(Set::stream).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        System.out.println(params);
    }
}
