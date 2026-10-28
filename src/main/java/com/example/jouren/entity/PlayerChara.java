package com.example.jouren.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import lombok.Data;

@Entity
@Table(name="v_player_chara")
@Data
public class PlayerChara {
@Id
@Column(name="id")
private Integer id;

@Column(name="youtube_name")
private String youtubeName;

@Column(name="tekken_id")
private String tekkenId;

@Column(name="cid")
private Integer cid;

@Column(name="cname")
private String cname;

@Column(name="memo")
private String memo;
}
