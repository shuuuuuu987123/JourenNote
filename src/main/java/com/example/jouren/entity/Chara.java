package com.example.jouren.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import lombok.Data;

@Entity
@Table(name="chara")
@Data
public class Chara {
@Id
@Column(name="cid")
private Integer cid;

@Column(name="cname")
private String cname;
}
