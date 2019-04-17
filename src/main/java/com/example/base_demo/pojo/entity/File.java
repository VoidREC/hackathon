package com.example.base_demo.pojo.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;

@Getter
@Setter
@ToString
public class File {

    @Column(name = "uid")
    String uid;

    @Column(name = "pic_url")
    String pic_url;
}
