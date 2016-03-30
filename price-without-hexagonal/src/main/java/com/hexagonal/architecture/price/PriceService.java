package com.hexagonal.architecture.price;

import com.hexagonal.architecture.image.Image;
import com.hexagonal.architecture.image.ImageService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class PriceService {

    @Resource
    private ImageService imageService;

    public Price getPrice(String id){
        Image image = imageService.getImage(id);

        int cost = 10;
        if (image.getPath().contains("whatever")){
            cost = 20;
        }

        Price price = new Price();
        price.setCost(cost);

        return price;
    }

}
