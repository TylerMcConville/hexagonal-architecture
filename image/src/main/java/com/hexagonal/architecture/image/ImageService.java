package com.hexagonal.architecture.image;

import org.springframework.stereotype.Service;

@Service
public class ImageService {

    public Image getImage(String imageId){
        Image image = new Image();
        image.setPath("/the-image.png");
        return image;
    }

}
