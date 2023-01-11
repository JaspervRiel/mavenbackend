package com.hours.webapp.Image;

import com.hours.webapp.User.User;
import com.hours.webapp.User.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ImageController {
    @Autowired
    ImageRepository imageRep;
    @Autowired
    UserRepository userRep;
    @CrossOrigin

    @PostMapping("/createImage")
    Image createImage(@RequestBody Image image)
    {
        return  imageRep.save(image);

    }
    @CrossOrigin
    @GetMapping("/getImage")
    List<Image>getImage(){
        User user = userRep.findById(1).orElse(null) ;
        return imageRep.findbyuserID(user);
    }

    @CrossOrigin
    @GetMapping("/GetImagebyID")
    Image GetImagebyID(){
        return imageRep.findById(1).orElse(null);
    }


}
