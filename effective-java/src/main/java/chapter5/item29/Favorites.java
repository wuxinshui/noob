package chapter5.item29;

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
        //恶意的客户端可以很轻松破坏Favorites实例的类型安全
        //确保Favorites永远不违背他的类型约束条件就是检验instance是否真的是type所表示类型的实例。
        // favorites.put(type, instance);
        favorites.put(type, type.cast(instance));
    }

    public <T> T getFavorite(Class<T> type) {
        return type.cast(favorites.get(type));
    }


}
