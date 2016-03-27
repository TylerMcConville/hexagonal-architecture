package com.hexagonal.architecture.price;

import com.hexagonal.architecture.image.Image;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class PriceService {

    @Resource
    private ImagePort imagePort;

    public Price getPrice(String id){
        Image image = imagePort.getImage(id);

        int cost = 10;
        if (image.getPath().contains("llama")){
            cost = 20;
        }

        Price price = new Price();
        price.setCost(cost);

        return price;
    }

}
