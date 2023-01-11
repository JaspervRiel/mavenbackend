package com.hours.webapp.Friend;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface FriendRepository extends JpaRepository<Friend,Integer> {
    @Query("SELECT n FROM Friend n WHERE n.friendAccepted = true" )
    List<Friend> findbyacceptedtrue();

}
