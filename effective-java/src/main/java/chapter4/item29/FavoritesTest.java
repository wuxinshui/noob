package chapter4.item29;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/**
 * <p>FavoritesTest</p>
 * 类型安全的异构容器测试
 * Favorites有两种局限性值得注意：
 * 1、恶意的客户端可以很轻松破坏Favorites实例的类型安全，
 * 只要以它的原生态形式使用Class对象。
 * 2、Favorites类的第二种局限性在于它不能用在不可具体化的类型中。
 * 可以保存String或String[]，但是不能保存List<String>。
 * 原因在于List<String>.Class是个语法错误。
 *
 * @author wuxinshui
 */
public class FavoritesTest {
    public static void main(String[] args) {
        // test1();
        test2();
    }

    private static void test1() {
        //实例化
        Favorites favorites = new Favorites();
        //put
        favorites.putFavorite(String.class, "Java");
        favorites.putFavorite(Integer.class, 0xcafebabe);
        favorites.putFavorite(Class.class, Favorites.class);
        //get
        String favoriteString = favorites.getFavorite(String.class);
        Integer favoriteInteger = favorites.getFavorite(Integer.class);
        Favorites favorite = favorites.getFavorite(Favorites.class);
        Class<?> favoriteClass = favorites.getFavorite(Class.class);

        //print in format
        // System.out.printf("%s %x %n", favoriteString, favoriteInteger,favorite, favoriteClass.getName());
    }

    /**
     * Favorites有两种局限性值得注意。
     * 恶意的客户端可以很轻松破坏Favorites实例的类型安全，
     * 只要以它的原生态形式使用Class对象。
     * <p>
     * 每个泛型都定义一个原生态类型（raw type）,即不带任何实际类型参数的泛型名称。List<E>的相对应的原生态类型是List。
     * 实际上，原生态类型List和Java平台没有泛型之前的接口类型List完全一样。
     */
    public static void test2() {
        HashSet integerHashSet = new HashSet<Integer>();
        integerHashSet.add(12);
        integerHashSet.add("");

        Favorites favorites = new Favorites();
        //ArrayList<Integer>
        favorites.putFavorite(List.class, Arrays.asList(1, 2, 3, 4));
        //ArrayList<String>
        favorites.putFavorite(List.class, Arrays.asList("字符串1", "字符串2", "字符串3"));
        List favoriteList = favorites.getFavorite(List.class);
        System.out.println(favoriteList);
    }

    public static void test3() {
        Favorites favorites = new Favorites();
        //无法为List<Integer>获得一个Class对象，List<Integer>.class是个语法错误
        //can not select from parameterized type
        // favorites.putFavorite(List<Integer>.class, new ArrayList<>());
        favorites.putFavorite(List.class, new ArrayList<Integer>());
        favorites.putFavorite(List.class, new ArrayList<String>());

    }

    /**
     *
     * @param element
     * @param annotationTypeName
     * @return
     */
    static Annotation getAnnotation(AnnotatedElement element, String annotationTypeName) {
        Class<?> annotationType = null;
        try {
            annotationType = Class.forName(annotationTypeName);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return element.getAnnotation(annotationType.asSubclass(Annotation.class));
    }


}
