package com.example.jouren.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import lombok.Data;

@Entity
@Table(name="player")
@Data
public class Player {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY) // AUTO_INCREMENTに任せる
@Column(name="id")
private Integer id;

@Column(name="youtube_name")
private String youtubeName;

@Column(name="tekken_id")
private String tekkenid;

@Column(name="cid")
private Integer cid;

@Column(name="memo")
private String memo;
}

