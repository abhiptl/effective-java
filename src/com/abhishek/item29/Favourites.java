package com.abhishek.item29;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by AbhishekPatel on 9/28/2017.
 */
public class Favourites {
    private Map<Class<?>, Object> favorites =
            new HashMap<Class<?>, Object>();

    public <T> void putFavorite(Class<T> type, T instance) {
        if (type == null)
            throw new NullPointerException("Type is null");
        favorites.put(type, instance);
    }
    public <T> T getFavorite(Class<T> type) {
        return type.cast(favorites.get(type));
    }
}
