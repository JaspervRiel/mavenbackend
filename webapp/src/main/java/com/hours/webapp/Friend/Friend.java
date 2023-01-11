package com.hours.webapp.Friend;
import com.hours.webapp.User.User;

import javax.persistence.*;
import java.util.List;

@Entity
public class Friend{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @OneToOne
    @JoinColumn(name = "user_ID", referencedColumnName = "id")
    private User UserFriendSending;
    @OneToOne
    private User UserFriendRequested;
    private Boolean friendAccepted;

    public Friend(User userFriendSending, User userFriendRequested, Boolean friendAccepted) {
        this.id = id;
        UserFriendSending = userFriendSending;
        UserFriendRequested = userFriendRequested;
        this.friendAccepted = friendAccepted;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public User getUserFriendSending() {
        return UserFriendSending;
    }

    public void setUserFriendSending(User userFriendSending) {
        UserFriendSending = userFriendSending;
    }

    public User getUserFriendRequested() {
        return UserFriendRequested;
    }

    public void setUserFriendRequested(User userFriendRequested) {
        UserFriendRequested = userFriendRequested;
    }

    public Boolean getFriendAccepted() {
        return friendAccepted;
    }

    public void setFriendAccepted(Boolean friendAccepted) {
        this.friendAccepted = friendAccepted;
    }
}
