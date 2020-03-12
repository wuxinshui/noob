package java8.listgroup;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ListGrouping {
    public static void main(String[] args) {
        Product product1 = new Product("1", "aa", "AA");
        Product product2 = new Product("1", "ee", "ee");
        Product product3 = new Product("2", "bb", "BB");
        Product product4 = new Product("3", "dd", "DD");

        List<Product> productList = List.of(product1, product2, product3, product4);

        Map<String, List<Product>> listMap = productList.stream().collect(Collectors.groupingBy(Product::getId));
        System.out.println(listMap);

        Map<String, List<String>> map = listMap.entrySet().stream().collect(Collectors.toMap(key -> key.getKey(), value -> value.getValue().stream().map(o -> o.getCode()).collect(Collectors.toList())));
        System.out.println(map);
    }


}
