package com.hours.webapp.Image;

import com.hours.webapp.User.User;

import javax.persistence.*;
import java.sql.Blob;
import java.util.Arrays;

@Entity
public class Image {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(
            name = "imageData"
    )
    @Lob
    private byte[] image;
    @Column(
            name = "Bio",
            columnDefinition = "TEXT"
    )
    private String Bio;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;
    public Image() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public byte[] getImage() {
        return image;
    }

    public String getBio() {
        return Bio;
    }

    public void setBio(String bio) {
        Bio = bio;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Image{" +
                "id=" + id +
                ", image=" + Arrays.toString(image) +
                ", Bio='" + Bio + '\'' +
                '}';
    }
}
