package com.finalproject.abcstories;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Timestamp;
import java.util.Date;

@Entity
public class Comments {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int commentId;
    private int contentid;
    private String commentedBy;
    private String commentText;
    private Timestamp commentedOn;

    public Comments() {}

    public Comments(int contentid, String commentedBy, String commentText) {
        this.contentid = contentid;
        this.commentedBy = commentedBy;
        this.commentText = commentText;
        this.commentedOn = new Timestamp(new Date().getTime());
        System.out.println("Content id is:" + contentid);
    }

    public int getContentid() {
        return contentid;
     //   return 1;
    }

    public void setContentid(int contentid) {
        this.contentid = contentid;
      //  this.contentid = 2;
    //    System.out.println("Content id " + this.contentid + " in setter is:" + contentid);
    }

    public int getCommentId() {
        return commentId;
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

    public void setCommentId(int commentId) {
        this.commentId = commentId;
    }

    public void setCommentedBy(String commentedBy) {
        this.commentedBy = commentedBy;
    }

    public void setCommentText(String commentText) {
        this.commentText = commentText;
    }

    public void setCommentedOn(Timestamp commentedOn) {
        this.commentedOn = commentedOn;
    }
}
