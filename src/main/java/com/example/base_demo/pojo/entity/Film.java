package com.example.base_demo.pojo.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Table;
import java.util.Date;


@Setter
@Getter
@Table(name = "film")
public class Film {

    @Column(name = "title")
    String title;

    @Column(name = "description")
    String dwscription;

    @Column(name = "release_year")
    String release_year;

    @Column(name = "special_features")
    String special_features;

    @Column(name = "last_update")
    Date last_update;
}
