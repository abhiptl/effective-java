package com.abhishek._01_creating_destryoing_objects.item6;

import java.util.WeakHashMap;

/**
 * Created by AbhishekPatel on 9/13/2017.
 */
public class WeakReferenceClass {
    public static void main(String[] args) {
        WeakHashMap<UniqueImageName, BigImage> map = new WeakHashMap<>();
        BigImage bigImage = new BigImage("image_id");
        UniqueImageName imageName = new UniqueImageName("name_of_big_image");

        map.put(imageName, bigImage);
        System.out.println(map.containsKey(imageName));

        imageName = null;
        System.gc();

        System.out.println(map.isEmpty());
    }
}

class UniqueImageName {
    private String imageName;

    public UniqueImageName(String imageName) {
        this.imageName = imageName;
    }
}

class BigImage {
    private String imageId;

    public BigImage(String imageId) {
        this.imageId = imageId;
    }
}
