package com.hours.webapp.Friend;

import com.hours.webapp.User.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FriendController {
    @Autowired
    FriendRepository friendRepository;

    @CrossOrigin
    @PostMapping("/CreateFriend")
    Friend friend(@RequestBody List<User> users){
        Friend friend = new Friend(users.get(0),users.get(1),false);
        return friendRepository.save(friend);
    }

    @CrossOrigin
    @GetMapping("/FindFriends")
    List<Friend> friends(){
        return friendRepository.findbyacceptedtrue();
    }

}
