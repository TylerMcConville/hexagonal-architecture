package com.hexagonal.architecture.price;

import com.hexagonal.architecture.image.Image;

// This adapter would not traditionally be in the same module as the business logic class
// It should be with the driving application (in this case, the monolith)
// For simplicity's sake, I combined them for the purposes of the presentation
public class ImageJavaServiceAdapter implements ImagePort{

    public Image getImage(String id){
        // Here we would pull in the ImageService (Java class)
        // and continue to call that method
        //imageService.getImage(id);
        return null;
    }

}
