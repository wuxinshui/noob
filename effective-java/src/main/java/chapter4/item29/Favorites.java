package chapter4.item29;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>Favorites</p>
 * 优先考虑类型安全的异构容器
 * <p>
 * Typesafe heterogeneous container pattern - implementation
 *
 * @author wuxinshui
 */
public class Favorites {
    private Map<Class<?>, Object> favorites = new HashMap<>();


    public <T> void putFavorite(Class<T> type, T instance) {
        if (null == type) {
            throw new NullPointerException();
        }
        favorites.put(type, instance);
    }

    public <T> T getFavorite(Class<T> type) {
        return type.cast(favorites.get(type));
    }


}
