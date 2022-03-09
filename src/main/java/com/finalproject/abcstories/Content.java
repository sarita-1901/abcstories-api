package com.finalproject.abcstories;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.sql.Timestamp;
import java.util.Date;

@Entity
public class Content {
    @Id
    @GeneratedValue
    private int contentId;
    private String title;
    private String type;
    private String color;
    private String text;
    private String subcategoryId;
    private String categoryId;
    private String author;
    private Timestamp dateCreated;
    private Boolean bookmarked;
    private Boolean liked;
    private int likes;

    public Content() {};

    public Content(String title, String type, String color, String text, String subcategoryId, String categoryId, String author, Boolean bookmarked, Boolean liked, int likes) {
        this.title = title;
        this.type = type;
        this.color = color;
        this.text = text;
        this.subcategoryId = subcategoryId;
        this.categoryId = categoryId;
        this.author = author;
        this.dateCreated = new Timestamp(new Date().getTime());
        this.bookmarked = bookmarked;
        this.liked = liked;
        this.likes = likes;
    }


    public int getContentId() {
        return contentId;
    }

    public String getTitle() {
        return title;
    }

    public String getType() {
        return type;
    }

    public String getColor() {
        return color;
    }

    public String getText() {
        return text;
    }

    public String getSubcategoryId() {
        return subcategoryId;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public String getAuthor() {
        return author;
    }

    public Timestamp getDateCreated() {
        return dateCreated;
    }

    public Boolean getBookmarked() {
        return bookmarked;
    }

    public Boolean getLiked() {
        return liked;
    }

    public int getLikes() {
        return likes;
    }

    public void setContentId(int contentId) {
        this.contentId = contentId;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setSubcategoryId(String subcategoryId) {
        this.subcategoryId = subcategoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setDateCreated(Timestamp dateCreated) {
        this.dateCreated = dateCreated;
    }

    public void setBookmarked(Boolean bookmarked) {
        this.bookmarked = bookmarked;
    }

    public void setLiked(Boolean liked) {
        this.liked = liked;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    @Override
    public String toString() {
        return "Content{" +
                "contentId=" + contentId +
                ", title='" + title + '\'' +
                ", type='" + type + '\'' +
                ", color='" + color + '\'' +
                ", text='" + text + '\'' +
                ", subcategoryId='" + subcategoryId + '\'' +
                ", categoryId='" + categoryId + '\'' +
                ", author='" + author + '\'' +
                ", dateCreated=" + dateCreated +
                ", bookmarked=" + bookmarked +
                ", liked=" + liked +
                ", likes=" + likes +
                '}';
    }
}
