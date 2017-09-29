package com.abhishek._04_generics.item29;

/**
 * Created by AbhishekPatel on 9/28/2017.
 *
 * Item29: Consider typesafe heterogeneous containers
 */
public class App29 {
    public static void main(String[] args) {
        Favourites favourites = new Favourites();
        favourites.putFavorite(String.class, "heterogeneous");
        favourites.putFavorite(Integer.class, 10);

        System.out.println("Get String : " + favourites.getFavorite(String.class));
        System.out.println("Get Integer : " + favourites.getFavorite(Integer.class));
    }
}
