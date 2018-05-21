package com.example.ec.domain;


import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import java.io.Serializable;

@Entity
public class TourRating implements Serializable {

    @EmbeddedId
    private TourRatingPk pk;

    @Column(nullable=false)
    private Integer score;

    @Column
    private String comment;

/*
* @param pk primary key of a tour and a customer id
* @param score [1-5] integer
* @param comment optional
**/

    public TourRating(TourRatingPk pk, Integer score, String comment) {
        this.pk = pk;
        this.score = score;
        this.comment = comment;
    }

    protected TourRating(){}

    public TourRatingPk getPk() {
        return pk;
    }

    public void setPk(TourRatingPk pk) {
        this.pk = pk;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
