package chapter4.item29;

/**
 * <p>FavoritesTest</p>
 * 类型安全的异构容器测试
 *
 * @author wuxinshui
 */
public class FavoritesTest {
    public static void main(String[] args) {
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
        System.out.printf("%s %x %n", favoriteString, favoriteInteger,favorite, favoriteClass.getName());
    }
}
