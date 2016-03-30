package com.hexagonal.architecture.price;

import com.hexagonal.architecture.image.Image;

public class ImageJavaServiceAdapter implements ImagePort{

    public Image getImage(String id){
        // Here we would pull in the ImageService (Java class)
        // and continue to call that method
        return null;
    }

}
