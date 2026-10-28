package com.example.jouren.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.jouren.entity.Player;

public interface PlayerRepository extends JpaRepository<Player,Integer >{

}
