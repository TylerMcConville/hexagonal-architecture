package com.hexagonal.architecture.price;

import com.hexagonal.architecture.image.Image;

public interface ImagePort {

    Image getImage(String id);

}
