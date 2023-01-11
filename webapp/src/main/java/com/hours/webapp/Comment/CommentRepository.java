package com.hours.webapp.Comment;

import com.hours.webapp.Image.Image;
import com.hours.webapp.User.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CommentRepository extends JpaRepository<Comment,Integer> {
    @Query("SELECT n FROM Comment n WHERE n.image = ?1")
    List<Comment> FindByImageID(Image image);

    @Query("select n from Comment n where n.user = ?1")
    List<Comment> FindByUserID(User user);
}
