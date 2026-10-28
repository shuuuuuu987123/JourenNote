package com.example.jouren.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.jouren.entity.PlayerChara;
import com.example.jouren.repository.PlayerCharaRepository;

import lombok.AllArgsConstructor;

@Controller
@AllArgsConstructor
public class PlayerListController {
	private PlayerCharaRepository playerCharaRepository;

	@GetMapping("/player_list")
	public ModelAndView showPlayerList(ModelAndView mv) {
		List<PlayerChara> playerList = playerCharaRepository.findAll();
		mv.setViewName("player_list");
		mv.addObject("playerList", playerList);
		return mv;
	}
}
