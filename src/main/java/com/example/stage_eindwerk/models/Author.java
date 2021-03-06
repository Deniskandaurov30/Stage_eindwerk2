package com.example.stage_eindwerk.models;

import javax.persistence.*;
import java.util.List;

@Entity
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String userName;
    @Column (nullable = false)
    private String passWord;
    @OneToMany(mappedBy = "author")
    private List<Blogpost> blogposts;
    private String imageLocation;


    public Author() {
    }

    public Author(String userName, String passWord, List blogposts, List comments, String imageLocation) {
        this.userName = userName;
        this.passWord = passWord;
        this.blogposts = blogposts;
        this.imageLocation = imageLocation;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public List getBlogposts() {
        return blogposts;
    }

    public void setBlogposts(List blogposts) {
        this.blogposts = blogposts;
    }

    public String getImageLocation() {
        return imageLocation;
    }

    public void setImageLocation(String imageLocation) {
        this.imageLocation = imageLocation;
    }

}

