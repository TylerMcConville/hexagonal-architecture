package com.hexagonal.architecture.price;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/prices")
public class PriceController {

    @Resource
    private PriceService priceService;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public @ResponseBody Price getPrice(@PathVariable("id") String id){
        return priceService.getPrice(id);
    }

}
