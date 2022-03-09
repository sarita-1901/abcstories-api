package com.finalproject.abcstories;

import java.sql.Timestamp;
import java.util.List;
import com.finalproject.abcstories.Content;
import java.util.ArrayList;


public class ContentDTO {
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
    private List<ContentCommentsDTO> comments;

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

    public void setComments(List<ContentCommentsDTO> comments) {
        this.comments = comments;
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

    public List<ContentCommentsDTO> getComments() {
        return comments;
    }

    @Override
    public String toString() {
        return "ContentDTO{" +
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
                ", comments=" + comments +
                '}';
    }

    public static class ContentCommentsDTO {
        private String commentedBy;
        private String commentText;
        private Timestamp commentedOn;


        public void setCommentedBy(String commentedBy) {
            this.commentedBy = commentedBy;
        }

        public void setCommentText(String commentText) {
            this.commentText = commentText;
        }

        public void setCommentedOn(Timestamp commentedOn) {
            this.commentedOn = commentedOn;
        }

        public String getCommentedBy() {
            return commentedBy;
        }

        public String getCommentText() {
            return commentText;
        }

        public Timestamp getCommentedOn() {
            return commentedOn;
        }

        @Override
        public String toString() {
            return "ContentCommentsDTO{" +
                    "commentedBy='" + commentedBy + '\'' +
                    ", commentText='" + commentText + '\'' +
                    ", commentedOn=" + commentedOn +
                    '}';
        }
    }

}








