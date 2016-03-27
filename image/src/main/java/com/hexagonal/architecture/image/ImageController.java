package com.hexagonal.architecture.image;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/images")
public class ImageController {

    @Resource
    private ImageService imageService;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public @ResponseBody Image getImage(@PathVariable("id") String imageId){
        return imageService.getImage(imageId);
    }

}
