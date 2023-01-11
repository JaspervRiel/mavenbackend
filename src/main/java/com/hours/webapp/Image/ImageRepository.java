package com.hours.webapp.Image;

import com.hours.webapp.User.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ImageRepository extends JpaRepository<Image,Integer> {

    @Query("SELECT n FROM Image n WHERE n.user = ?1")
    List<Image> findbyuserID(User user);
}
